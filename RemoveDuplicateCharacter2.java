package Com.My_Package.String;

public class RemoveDuplicateCharacter2 {
    public static void main(String[] args) {
        String s = "Banana Orange Strawberry";
        System.out.println(removeDuplicates(s));
    }

    private static String removeDuplicates(String s) {
        char[] ch = s.toCharArray();
        String result = "";

        for (int i = 0; i < ch.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {
                if (ch[i] == ch[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                result += ch[i];
            }
        }
        return result;
    }
}

