package Com.My_Package.String;
import java.util.HashMap;

public class OccurenceCharacterHashMap {

    public static HashMap<Character, Integer> findOccurrence(String s) {

        HashMap<Character, Integer> hashmap = new HashMap<>();

        for (char c : s.toCharArray()) {

            if (hashmap.containsKey(c)) {
                hashmap.put(c, hashmap.get(c) + 1);
            } else {
                hashmap.put(c, 1);
            }
        }

        return hashmap;
    }
    public static void main(String[] args) {
        String s = "Maa Managala";
        System.out.println(findOccurrence(s));
    }
}