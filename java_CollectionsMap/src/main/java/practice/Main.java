package practice;

import java.util.Scanner;
import java.util.TreeMap;


public class Main {
private static final PhoneBook phoneBook = new PhoneBook();

    public static void main(String[] args) {
        TreeMap<String, String> phoneBook = new TreeMap<>();
        phoneBook.put("79991234567", "Миша");
        Scanner scanner = new Scanner(System.in);
        for (;;){
            String text = scanner.nextLine();
            String[] words = text.split("[\\s]+");
            if (words.length > 1){
                phoneBook.put(words[0], words[1]);
                } else if (words.length < 1) {


            }
            if(text.equals("LIST")){
                printMap(phoneBook);
                continue;
            }

            }
        }


    private static void printMap(TreeMap<String, String> phoneBook)
    {
        for (String key : phoneBook.keySet()){
            System.out.println(phoneBook.get(key) + " - " + key);
        }

    }

}
