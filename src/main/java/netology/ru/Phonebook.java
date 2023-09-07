package netology.ru;

import java.util.HashMap;
import java.util.Map;

public class Phonebook {
    protected static HashMap<String, Integer> phonebook = new HashMap<>();
    public static int add (String name, int number){
        if (!phonebook.containsKey(name)){
            phonebook.put(name, number);
        }
        return phonebook.size();
    }

    public static String findByNumber (int number){
        if (phonebook.containsValue(number)){
            for (Map.Entry<String, Integer> entry: phonebook.entrySet()){
                if (number == entry.getValue()){
                    return entry.getKey();
                }
            }
        }
        return "Number not found";
    }

    public static int findByName (String name){
        if (phonebook.containsKey(name)){
            return phonebook.get(name);
        }
        return 0;
    }
}
