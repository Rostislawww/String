import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        String a = new String("software");
        String b = new String("swear oft");
        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();
        Arrays.sort(aArray);
        Arrays.sort(bArray);
        a = new String(aArray).trim();
        b = new String(bArray).trim();

        if (a.equals(b)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not an anagram");
        }
    }
}