/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addVarArg;
import java.util.ArrayList;

/**
 *
 * @author reeha
 */
public class addVarArg {

    /**
     * @param args the command line arguments
     */
    int add(int a) {
        return a;
    }
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
    int add( int a, int ...b) {
        int sum = 0;
        int i = b.length;
        for (int j = 0; j < i; j++) {
            sum = sum + b[j];
        }
        return a + sum;
    }
    public static void main(String[] args) {
        // TODO code application logic here
//        System.out.println("Hello World!");
//        ArrayList arr = new ArrayList();
//        arr.add(20);
//        arr.add(1);
//        System.out.println(arr);
//        for (int i = 0; i < arr.size(); i++) {
//            System.out.println(arr.get(i));
//        }
        addVarArg ob = new addVarArg();
        System.out.print(ob.add(1, 2, 4, 5, 6));
    }
    
}
