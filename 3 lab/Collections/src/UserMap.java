import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class UserMap {
    private Map<User, Integer> users;

    UserMap() {
        users = new HashMap<>();
        ForUser[] forUsers = ForUser.values();
        for (int i = 0; i < 5; i++) {
            users.put(new User(forUsers[i].getName()), new Random().nextInt(10));
        }
    }

    public int getScore(){
        System.out.println("Enter an user name");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        return users.get();
    }

    @Override
    public String toString() {
        return "UserMap{" +
                "users=" + users +
                '}';
    }
}
