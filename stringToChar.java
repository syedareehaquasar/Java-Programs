public class stringToChar {
    public static void main(String args[]) {
        String s = "hello World!";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.println("char at " + i + " index is: " + c);
        }
    }
}
