import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        //Task_2.1
        String[] words = {"java", "C", "Ruby", "Java", "Python", "Docker", "IDE", "JVM", "JDK", "JRE", "Java", "PHP",
                "java"};

        HashSet<String> setWords = new HashSet<>();
        HashMap<String, Integer> mapWords = new HashMap<>();

        for (String word : words) {

            String lowerCaseWord = word.toLowerCase();

            setWords.add(lowerCaseWord);
            mapWords.put(lowerCaseWord, mapWords.getOrDefault(lowerCaseWord, 0) + 1);
        }

        System.out.println("Уникальные слова: " + setWords);

        for (String word : mapWords.keySet()) {
            System.out.println(word + " - количество вхождений " + mapWords.get(word));
        }

        //Task_2.2
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Petrov", "89885887881");
        phoneBook.add("Petrov", "89885887882");
        phoneBook.add("Petrov", "89885887883");
        phoneBook.add("Hugh Jackman", "89885887882");

        System.out.println("Номер Petrova: " + phoneBook.get("Petrov"));
        System.out.println("Номер Hugh Jackman: " + phoneBook.get("Hugh Jackman"));
        System.out.println("Номер Ivanova: " + phoneBook.get("Ivanova"));
    }
}