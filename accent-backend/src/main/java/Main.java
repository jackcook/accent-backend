import static spark.Spark.*;

/**
 * Created by jackcook on 6/10/17.
 */
public class Main {

    public static void main(String[] args) {
        before((request, response) -> response.type("application/json; charset=utf-8"));
        get("/hello", (req, res) -> "Hello World");
    }
}
