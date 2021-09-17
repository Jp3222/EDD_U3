package edd_u3;

import Cola.Cola;

public class EDD_U3 {

    public static void main(String[] args) {
        Cola<Integer> c = new Cola<>();
        c.add(23);
        c.add(766);
        c.add(4);
        c.add(0);
        c.add(4);
        System.out.println(c);
        System.out.println("remove " + c.remove());
        System.out.println("remove " + c.remove());
        System.out.println("remove " + c.remove());
        System.out.println(c);
    }

}
