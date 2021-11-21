import java.io.IOException;

public class exceptions {
    void divideSt() {
        try {
            throw new ArithmeticException("func Can't divide a number by 0 ---> this is by throws");
        } catch (Exception e) {
            System.out.println("Exception handles of throw");
        }
    }

    public static void main(String args[]) throws ArithmeticException {
        exceptions obj = new exceptions();
        try {
            int data = 100 / 0;
            throw new ArithmeticException("Can't divide a number by 0 ---> this is by throws");
        } catch (ArithmeticException e) {
            System.out.println("Exception handles of throw2" + e);
            obj.divideSt();

        } catch (Exception e) {
            System.out.println("Exception handles of throw3" + e);

        } finally {
            System.out.println("finally executed");
            System.out.println("normal flow...");
        }
    }
}
