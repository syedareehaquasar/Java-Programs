public class EvenOdd {

    public static void main(String[] args) {

        int num = Integer.valueOf(args[0]);

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
}
