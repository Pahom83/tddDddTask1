package netology.ru;

import java.util.HashMap;

public class Phonebook {
    protected static HashMap<String, Integer> phonebook = new HashMap<>();
    public static int add (String name, int number){
        if (!phonebook.containsKey(name)){
            phonebook.put(name, number);
        }
        return phonebook.size();
    }

    public static String findByNumber (int number){
        return null;
    }
}
