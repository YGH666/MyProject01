package yangguohao.java;

import java.util.ArrayList;
import java.util.Arrays;

public class Customer {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("Customer.main");

        int i = 10;
        System.out.println("i = " + i);

        String[] arr = new String[]{"1","2","3"};
        for (int j = 0; j < arr.length; j++) {
            String s = arr[j];
            System.out.println("s = " + s);
        }

        for (String s : arr) {
            System.out.println("s = " + s);
        }

        ArrayList<Object> list = new ArrayList<>();
        list.add(111);
        list.add(112);
        list.add(113);
        list.add(114);

        for (Object o : list) {
            
        }

        //list.fori
        for (int i1 = 0; i1 < list.size(); i1++) {
            
        }

        //list.forr
        for (int i1 = list.size() - 1; i1 >= 0; i1--) {
            
        }

    }

    void show(){
        ArrayList<Object> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        //ifn
        if (list == null) {
            
        }

        //inn
        if (list != null) {

        }
    }
}
