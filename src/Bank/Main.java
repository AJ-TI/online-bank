package Bank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> user = new ArrayList<>();
        user.add("Adrian");
        user.add("Bartek");
        user.add("ola");

        System.out.println("Welcome, please log in: ");

        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        String login = reader.readLine();

        boolean isUserExist=false;
        for(int i = 0; i< user.size(); i++){
            String userName = user.get(i);
            if(userName.equals(login)){
                isUserExist= true;
                break;
            }
        }

        if(isUserExist)
            System.out.println("Login successful, welcome " + login);
        else{
            System.out.println("Sorry, I don't recognize user name: " + login);
        }

        //TODO ask quesiton if you want create user? if yes , get user name + put this user name to our user list
    }
}
