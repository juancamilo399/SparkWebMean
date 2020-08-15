package edu.escuelaing.arep;

import com.google.gson.Gson;
import edu.escuelaing.arep.calculator.App;
import static spark.Spark.*;
public class SparkWebApp {

    public static void main(String[] args) {
        port(getPort());
        staticFiles.location("/views");
        Gson gson = new Gson();
        get("/calculator", (request, response) -> {
            response.redirect("/index.html");
            response.status(200);
            return null;
        });

        post("/calculator/calculate/", (req, res) -> {
            String result = App.calculate(req.body());
            return gson.toJson(result);

        });
    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; // returns default port if heroku-port isn't set(i.e. on localhost)
    }
}
