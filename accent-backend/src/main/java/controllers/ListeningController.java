package controllers;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.EnvironmentVariableCredentialsProvider;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.polly.AmazonPolly;
import com.amazonaws.services.polly.AmazonPollyClientBuilder;
import com.amazonaws.services.polly.model.DescribeVoicesRequest;
import com.amazonaws.services.polly.model.DescribeVoicesResult;
import com.amazonaws.services.polly.model.OutputFormat;
import com.amazonaws.services.polly.model.SynthesizeSpeechRequest;
import com.amazonaws.services.polly.model.SynthesizeSpeechResult;
import com.amazonaws.services.polly.model.Voice;
import models.ListeningExercise;
import spark.utils.IOUtils;
import spark.Request;
import spark.Response;

import javax.servlet.http.HttpServletResponse;

public class ListeningController {

    public static ListeningExercise getExercise(Request req, Response res) {
        int id = new Integer(req.params(":id"));
        return ListeningExercise.getExercises()[id];
    }

    public static HttpServletResponse getSentenceAudio(Request req, Response res) {
        int id = new Integer(req.params(":id"));
        int sentenceId = new Integer(req.params(":sentence"));

        ListeningExercise exercise = ListeningExercise.getExercises()[id];

        AmazonPolly client = AmazonPollyClientBuilder.standard()
                .withRegion(Regions.US_EAST_1)
                .withClientConfiguration(new ClientConfiguration())
                .withCredentials(new EnvironmentVariableCredentialsProvider())
                .build();

        DescribeVoicesRequest voicesRequest = new DescribeVoicesRequest();
        DescribeVoicesResult voicesResult = client.describeVoices(voicesRequest);
        List<Voice> voices = voicesResult.getVoices();

        Voice frenchVoice = null;

        for (int i = 0; i < voices.size(); i++) {
            Voice voice = voices.get(i);
            if (voice.getLanguageCode().equals("fr-FR")) {
                frenchVoice = voice;
                break;
            }
        }

        SynthesizeSpeechRequest synthReq = new SynthesizeSpeechRequest().
                withText(exercise.getSentences()[sentenceId])
                .withVoiceId(frenchVoice.getId())
                .withOutputFormat(OutputFormat.Mp3);

        SynthesizeSpeechResult synthRes = client.synthesizeSpeech(synthReq);
        InputStream speechStream = synthRes.getAudioStream();

        try {
            byte[] bytes = IOUtils.toByteArray(speechStream);

            HttpServletResponse raw = res.raw();
            raw.getOutputStream().write(bytes);
            raw.getOutputStream().flush();
            raw.getOutputStream().close();

            return res.raw();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
