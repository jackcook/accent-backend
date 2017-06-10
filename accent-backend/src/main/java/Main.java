import controllers.ListeningController;

import static spark.Spark.*;

public class Main{
    public static void main(String[] args){
        get("/audio", ListeningController::getAudio);
    }
}