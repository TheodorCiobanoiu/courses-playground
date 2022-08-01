import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        User u = new User();
        List<User> userList = u.getAll();
        for(User it : userList){
            System.out.println(it);
        }
        User newUser = new User(
                "Voinescu Alexandru",
                "valex@gmail.com"
        );
        //newUser.insert();
    }
}
