package practice;

import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class PhoneBook {
    TreeMap<String, String> phoneBook = new TreeMap<>();


    public void addContact(String phone, String name) {
        if ((correctName(name)) && (correctNumber(phone))){
                phoneBook.put(phone,name);
            }
            phoneBook.put(phone,name);
        }
        // проверьте корректность формата имени и телефона
        // (рекомедуется написать отдельные методы для проверки является строка именем/телефоном)
        // если такой номер уже есть в списке, то перезаписать имя абонента


    private boolean correctNumber (String phone){
        String regex = "[^0-9]";
        boolean text;
        String textWrite = phone.replaceAll(regex, "");
        if (((textWrite.length() == 10) && ((textWrite.charAt(0) == '9'))))  {
            text = true;
        } else if ((textWrite.length() == 11) && (((textWrite.charAt(0) == '7')) || ((textWrite.charAt(0) == '8')))){
            text = true;
        } else {
            text = false;
        }
        return text;
    }

    private boolean correctName(String name){
        String regex = "[^А-Яа-я]{2,6}";
        return name.matches(regex);
    }

    public String getContactByPhone(String phone) {
        String text = "";
        Boolean b = correctNumber(phone);

        if (correctNumber(phone)){
            System.out.println();
            if (phoneBook.containsKey(phone)) {
                System.out.println();
                text = phoneBook.get(phone) + " - " + phone;
                System.out.println();
            }
        }
        // формат одного контакта "Имя - Телефон"
        // если контакт не найдены - вернуть пустую строку
        return text;
    }

    public Set<String> getContactByName(String name) {


        // формат одного контакта "Имя - Телефон"
        // если контакт не найден - вернуть пустой TreeSet
        return new TreeSet<>();
    }

    public Set<String> getAllContacts() {
        if (phoneBook.firstKey() != null){
            for (String key : phoneBook.keySet()){
                System.out.println(phoneBook.get(key) + " - " + key);
            }
        }
        // формат одного контакта "Имя - Телефон"
        // если контактов нет в телефонной книге - вернуть пустой TreeSet
        return new TreeSet<>();
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