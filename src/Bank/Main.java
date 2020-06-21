package Bank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) throws IOException {
        List<User> user = getUsersWithBank();

        //Opcja nr 1:
        //stworzenie listy z bankami - powiazanie
        //opcja nr 2: stworzenie struktry danych ktora bedzie przechowywac uzytkownika i powiazane banki
        //opcja nr 3: uzycie kolekcji danych typu Mapa -> TODO

        //todo fix problem and run code
        ListIterator<String>
                iterator = user.listIterator();

        System.out.println("\nActual list:\n");
        while (iterator.hasNext()) {
            System.out.println("Active user : "
                    + iterator.next());
        }

        System.out.println("\nWelcome, please log in: \n");

        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        String login = reader.readLine();

        boolean isUserExist = false;
        for (int i = 0; i < user.size(); i++) {
            String userName = user.get(i);
            if (userName.equals(login)) {
                isUserExist = true;
                break;
            }
        }


        if (isUserExist)
            System.out.println("Login successful, welcome " + login);
        else {
            System.out.println("Sorry, I don't recognize user name: " + login);
            boolean isContinue = true;

            do {
                System.out.println("Do you want to create an account? Answer yes or no");
                String answer = reader.readLine().toLowerCase();
                    if (answer.equals("yes")) {
                        System.out.println("Please enter your user name");
                        String createAccount = reader.readLine();
                        user.add(createAccount);
                        System.out.println("Thanks for creating account: " + createAccount);
                        isContinue = false;
                    } else if (answer.equals("no")) {
                        System.out.println("Thanks for visiting");
                        isContinue = false;
                } else {
                        System.out.println("Wrong answer.Please answer yes or no.");
                }
            } while (isContinue);
        }
    }

    private static List<User> getUsersWithBank() {
        List<User> user = new ArrayList<>();

        User user1= new User();
        user1.userName="Adrian";
        user1.bankName = Arrays.asList("Mbnak", "PKO", "Nest");
        user.add(user1);

        User user2= new User();
        user2.userName="Bartek";
        user2.bankName = Arrays.asList("Mbnak");
        user.add(user2);

        User user3= new User();
        user3.userName="Tomek";
        user3.bankName = Arrays.asList("PKO", "Nest");
        user.add(user3);

        return user;
    }
}




