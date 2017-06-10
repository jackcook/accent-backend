import controllers.ListeningController;

import static spark.Spark.*;

public class Main {

    final private static JsonTransformer transformer = new JsonTransformer();

    public static void main(String[] args){
        path("/listening", () -> {
            get("", ListeningController::getExercise, transformer);
            get("/:id/sentences/:sentence/audio", ListeningController::getSentenceAudio);
        });
    }
}