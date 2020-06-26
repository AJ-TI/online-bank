package Bank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        List<User> user = getUsersWithBank();

        //Opcja nr 1:
        //stworzenie listy z bankami - powiazanie
        //opcja nr 2: stworzenie struktry danych ktora bedzie przechowywac uzytkownika i powiazane banki
        //opcja nr 3: uzycie kolekcji danych typu Mapa -> TODO



        //todo fix problem and run code
        ListIterator<User>
                iterator = getUsersWithBank().listIterator();

        System.out.println("\nActual list:\n");
        while (iterator.hasNext()) {
            System.out.println("Active user : "
                    + iterator.next());
        }
        Map<Integer, String> mbank = new TreeMap<>();
        mbank.put(1234, "Adrian");
        mbank.put(1235, "Bartek");
        mbank.put(1236, "Kamil");

        Map<Integer, String> pko = new TreeMap<>();
        pko.put(1234,"Adrian");
        pko.put(1237,"Tomek");

        Map<Integer, String> nest = new TreeMap<>();
        nest.put(1234,"Adrian");
        nest.put(1237, "Tomek");

        Set<Map.Entry<Integer,String>> entrySet = mbank.entrySet();
        System.out.println("\nAmount of Mbank users: " + mbank.size());
        for(Map.Entry<Integer, String> entry: entrySet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        Set<Map.Entry<Integer,String>> entrySet1 = pko.entrySet();
        System.out.println("\nAmount of PKO users: " + pko.size());
        for(Map.Entry<Integer, String> entry: entrySet1) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        Set<Map.Entry<Integer,String>> entrySet2 = nest.entrySet();
        System.out.println("\nAmount of Nest users: " + nest.size());
        for(Map.Entry<Integer, String> entry: entrySet2) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("\nWelcome, please log in: \n");

        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        String login = reader.readLine().toLowerCase();

        boolean isUserExist = false;
        for (int i = 0; i < getUsersWithBank().size(); i++) {
            User userName = getUsersWithBank().get(i);
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
                        user.add((User) getUsersWithBank());
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
        user2.bankName = Arrays.asList("Mbank");
        user.add(user2);

        User user3= new User();
        user3.userName="Tomek";
        user3.bankName = Arrays.asList("PKO", "Nest");
        user.add(user3);

        User user4= new User();
        user4.userName="Kamil";
        user4.bankName = Arrays.asList("Mbank");
        user.add(user4);

        return user;
    }


}




