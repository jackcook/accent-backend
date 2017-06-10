import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import spark.ResponseTransformer;

/**
 * Created by eric miao on 6/10/2017.
 */
public class JsonTransformer implements ResponseTransformer {

    private Gson gson= new GsonBuilder().create();

    @Override
    public String render(Object model) {
        return gson.toJson(model);
    }
}
