package practice;

import java.util.*;

public class PhoneBook {
    private static TreeMap<String, String> phoneBook = new TreeMap<>();


    public boolean correctName(String name) {
        if (name.matches("[А-Яа-я]{1,6}")) return true;
        return false;
    }

    public boolean correctNumber(String phone){
        if (phone.matches("[0-9]{11}")) return true;
        return false;
    }


    public void addContact(String phone, String name) {
        if ((correctNumber(phone)) &&(correctName(name))) {
            phoneBook.put(phone, name);
            for (Map.Entry<String, String> entry : phoneBook.entrySet()){
                String key = entry.getKey(); // получения ключа
                String value = entry.getValue(); // получения ключа
                for (Map.Entry<String, String> entry1 : phoneBook.entrySet()){
                    String key1 = entry1.getKey(); // получения ключа
                    String value1 = entry1.getValue(); // получения ключа
                    if ((key1 == key) && (value1 != value)) {
                        phoneBook.remove(key);
                    }
                }
            }

        }
        // проверьте корректность формата имени и телефона
        // (рекомедуется написать отдельные методы для проверки является строка именем/телефоном)
        // если такой номер уже есть в списке, то перезаписать имя абонента
    }

    public Set<String> getContactByName(String name) {
        TreeSet<String> result = new TreeSet<String>();
        for (Map.Entry entry : phoneBook.entrySet()) {
            if (name.equalsIgnoreCase((String)entry.getValue())){
                result.clear();
                result.add(name + " - " + (String)entry.getKey());
            }
        }
        if (result.size() == 0) {
            result.add("");
        }
        return new TreeSet<String>(result);
    }

    public String getContactByPhone(String phone){
        String result = "";
        for (Map.Entry entry : phoneBook.entrySet()) {
            if (phone.equalsIgnoreCase((String)entry.getKey())){
                result = ((String)entry.getValue() + " - " + phone);
            }
        }
        return result;
    }

    public Set<String> getAllContacts() {
        TreeSet<String> result  = new TreeSet<>();
        for(Map.Entry<String,String> k: phoneBook.entrySet()){
            String key = k.getKey(); // получения ключа
            String value = k.getValue(); // получения ключа
            result.add(value +" - "+ key);
        }

        // формат одного контакта "Имя - Телефон"
        // если контактов нет в телефонной книге - вернуть пустой TreeSet
        return new TreeSet<>(result);
    }

    // для обхода Map используйте получение пары ключ->значение Map.Entry<String,String>
    // это поможет вам найти все ключи (key) по значению (value)
    /*
        for (Map.Entry<String, String> entry : map.entrySet()){
            String key = entry.getKey(); // получения ключа
            String value = entry.getValue(); // получения ключа
        }
    */
}