package lab11.hashMapAssignment;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {
    public static int numberOfWords(String[] words, String word){
        int count = 0;
        for (int i = 0; i < words.length; i++){
            if (words[i].equals(word))
                count++;
        }
        return count;
    }

    public static Map<String, Integer> countWords(String paragraph){
        Map<String, Integer>    map = new HashMap<>();
        String[]    words = paragraph.split(" ");
        for (int i = 0; i < words.length; i++){
            String word = words[i];
            if (!map.containsKey(word))
                map.put(word, numberOfWords(words, word));
        }
        return map;
    }

    public static void main(String[] args){
        String paragraph = "abdelaziz aboukhame is a student in the miu, the student abdelaziz like coding";
        System.out.println(countWords(paragraph));
    }
}
