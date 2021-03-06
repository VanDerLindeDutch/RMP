package User;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class UserMap {
    private Map<User, Integer> users;

    public UserMap() {
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
        in.close();
        for(User i: users.keySet()){
            if(i.getName().equals(name)){
                return users.get(i);
            }
        }
        System.out.println("User not found");
        return -1;

    }

    @Override
    public String toString() {
        return "UserMap{" +
                "users=" + users +
                '}';
    }
}
