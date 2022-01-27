package practice;

import java.util.Scanner;


public class Main {
    private static TodoList todoList = new TodoList();



    public static void main(String[] args) {
        // TODO: написать консольное приложение для работы со списком дел todoList
        while (true){String text ="";
            int indexWrite = -1;
            Scanner scan = new Scanner(System.in);
            String[] words = scan.nextLine().split("[\\s]+");
            String textWrite = "";
            textWrite = textWrite + words[0];
            if (words.length > 1){
                if (words[1].matches("[0-9]")) {
                    indexWrite = (Integer.parseInt(words[1]));
                    for (int i = 2; i < words.length; ++i) {
                        text = text + words[i] + " ";}
                }else {for (int i = 1; i < words.length; ++i){
                        text = text + words[i] + " ";}}}

            System.out.println();
            switch (textWrite){
                case "ADD":
                    if (indexWrite >= 0) {todoList.add(indexWrite, text);
                    } else{ todoList.add(text);}
                    continue;
                case "LIST":
                    for (int i = 0; i < todoList.getTodos().size(); i++) {
                        System.out.println(i + " - " + todoList.getTodoList().get(i));}
                    continue;
                case "DELETE":
                    System.out.println("Дело \"" +
                    todoList.getTodoList().get(indexWrite) + "\" удалено");
                    todoList.getTodoList().remove(indexWrite);
                    continue;
                case "EDIT":
                    System.out.println("Дело \"" + todoList.getTodoList().get(indexWrite) +
                            "\" заменено на \"" + text + "\"" );
                    todoList.edit(indexWrite, text);
                    continue;
                default:
                    System.out.println();
                    break;}
            scan.close();
        }
    }
}
