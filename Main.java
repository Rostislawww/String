public class Main {
    public static void main(String[] args) {
        String fullName = "Rostyslav Hrybyk";
        String[] words = fullName.split(" ");
        for (String word : words) {
            if (!word.isEmpty()) {
                System.out.print(word.charAt(0) + ". ");
            }
        }
    }
}