public class ReverseString {
    public static void main(String[] args) {
        String input = "HelloWorld!";
        String reversed = reverse(input);
        System.out.println("Reversed string: " + reversed);
    }

    public static String reverse(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }
}
