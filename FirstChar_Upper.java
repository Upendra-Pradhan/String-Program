package Com.My_Package.String;

public class FirstChar_Upper {

    public static void main(String[] args) {

        String s = "java is an oop lang";
        char[] ch = s.toCharArray();

        // Capitalize first character
        if (ch[0] >= 'a' && ch[0] <= 'z') {
            ch[0] = (char) (ch[0] - 32);
        }

        // Capitalize after space
        for (int i = 0; i < ch.length - 1; i++) {
            if (ch[i] == ' ' && ch[i + 1] >= 'a' && ch[i + 1] <= 'z') {
                ch[i + 1] = (char) (ch[i + 1] - 32);
            }
        }

        String res = new String(ch);
        System.out.println("Result: " + res);
    }
}
