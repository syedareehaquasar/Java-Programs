package javaApplication1;

/**
 *
 * @author reeha
 */

class A extends Thread {

    public void run() {
        for (;;) {
            System.out.println("A");
            try {
                Thread.currentThread().sleep(1000);
            }

            catch (InterruptedException e) {
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for (;;) {
            System.out.println("B");
            try {
                Thread.currentThread().sleep(3000);
            } catch (InterruptedException e) {
            }
        }
    }
}

public class threading {
    public static void main(String args[]) {

        A obj1 = new A();
        B obj2 = new B();
        obj1.start();
        obj2.start();
    }
}
