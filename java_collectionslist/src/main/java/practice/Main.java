package practice;

import java.util.Scanner;


public class Main {
    private static TodoList todoList = new TodoList();


    public static void main(String[] args) {
        // TODO: написать консольное приложение для работы со списком дел todoList



        while (true){

            String text ="";
            int size = 0;
            int indexWrite = -1;
            Scanner scan = new Scanner(System.in);
            String[] words = scan.nextLine().split("[\\s]+");
            String textWrite = "";
            textWrite = textWrite + words[0];
            if (words.length > 1){
                if (words[1].matches("[0-9]")) {
                    indexWrite = (Integer.parseInt(words[1]));
                    for (int i = 1; i < words.length; ++i) {
                        text = text + words[i] + " ";
                    }
                }else {
                    for (int i = 1; i < words.length; ++i){
                        text = text + words[i] + " ";
                        }
                    }
                }

            System.out.println();
            switch (textWrite){
                case "ADD":
                    if (indexWrite >= 0) {
                        todoList.add(indexWrite, text);
                        size = size + 1;
                    } else{
                        todoList.add(text);
                        size = size + 1;
                    }

                    continue;
                case "LIST":

                    System.out.println("Ваш список дел: ");
                    System.out.println("- " + todoList.getTodos());
                    continue;
                case "DELETE":
                    System.out.println("Дело \"");
                    todoList.delete(indexWrite);
                    continue;
                default:
                    System.out.println();
                    break;
            }
            scan.close();
        }
    }
}
