package practice;

import java.util.ArrayList;

public class TodoList {
    ArrayList<String> todoList = new ArrayList<>();

    public void add(String todo) {
        // TODO: добавьте переданное дело в конец списка
        todoList.add(todo);
        System.out.println("Добавлено дело - \"" + todo + "\"");

    }

    public void add(int index, String todo) {
        if (todoList.size() > index) {
            todoList.add(index, todo);
        } else {
            todoList.add(todo);
            // TODO: добавьте дело на указаный индекс,
            //  проверьте возможность добавления
        }
    }


    public void edit(int index, String todo) {
        if (todoList.size() > index) {
            todoList.set(index, todo);
        } else {
            System.out.println("it's not possible");
        }
        // TODO: заменить дело на index переданным todo индекс,
        //  проверьте возможность изменения
    }

    public void delete(int index) {
        if (todoList.size() > index) {
            todoList.remove(index);
        } else {
            System.out.println("it's not possible");
        }
        // TODO: удалить дело находящееся по переданному индексу,
        //  проверьте возможность удаления дела
    }

    public ArrayList<String> getTodos() {
        // TODO: вернуть список дел
        return todoList;
    }

}