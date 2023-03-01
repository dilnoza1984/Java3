public class Main {
    public static void main(String[] args) {
        String word = "ANNA";
//        1-way
        String reversed = new StringBuilder(word).reverse().toString();
//        System.out.println(word.equals(reversed) ? "Palindrome" : "Not Palindrome");

        System.out.println("========================================");
        // 2-way
        System.out.println(new StringBuilder(word).reverse().toString().equals(word) ? "Palindrome" : "Not Palinfrome");


        // 3-way
        if (word.equals(reversed)) {
            System.out.println("Palindrome");
        } else System.out.println("Not Palindrome");
}
}