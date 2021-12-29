package com.codechef;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*
	Advantages of using arraylist:
	If you don't know the exact size then you can use something named as arraylist;
	 */
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer > a1 = new ArrayList<>(6);
        // if you want to add the elements then:
        for(int i=0;i<3;i++){
            a1.add(sc.nextInt());
        }
        System.out.println(a1);
        // if you want to check that the asked element is there in list is
        System.out.println(a1.contains(69));
        System.out.println(a1.contains(56));
        // if you want to replace an element from a given index:
        a1.set(0,99);
        a1.set(1,88);
        System.out.println(a1);

    }
}
