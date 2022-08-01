import com.google.gson.Gson;
//import org.apache.log4j.BasicConfigurator;

import static spark.Spark.*;

public class MainSpark {
    public static void main(String[] args) {
//        BasicConfigurator.configure();

        get("/users", (request, response) -> {
            if(request.queryParams("name") == null) {
                User u = new User();
                return u.getAll();
            } else {
                System.out.println(request.queryParams("name"));
                return "";
            }
        });

        post("/users", (req, res) -> {
            System.out.println(req.body());

            Gson gson = new Gson();
            String json = req.body();
            User obj = gson.fromJson(json, User.class);
            obj.insert();
            return obj;
        });

        get("/users/:id", (request, response) -> {
            return "Hello: " + request.params(":id");
        });

    }
    //http://localhost:4567/users
    //http://localhost:4567/users?nume=gigel
}
