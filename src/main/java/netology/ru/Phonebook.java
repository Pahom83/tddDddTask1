package netology.ru;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

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

    public static String printAllNames(){
        StringBuilder stringBuilder = new StringBuilder();
        if (!phonebook.isEmpty()){
            Map<String, Integer> sortedPhonebook = new TreeMap<>(phonebook);
            for (Map.Entry<String, Integer> entry: sortedPhonebook.entrySet()) {
                stringBuilder.append(entry.getKey()).append(", т. ").append(entry.getValue()).append("\n");
            }

        }
        String sorted = stringBuilder.toString();
        System.out.println(sorted.substring(0, sorted.length() - 1));
        return sorted.substring(0, sorted.length() - 1);
    }
}
