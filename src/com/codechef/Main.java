package com.codechef;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
	/*
	Advantages of using arraylist:
	If you don't know the exact size then you can use something named as arraylist;
	 */
        Scanner sc = new Scanner(System.in);
        ArrayList <String> a1 = new ArrayList<>(6);
        // if you want to add the elements then:
        for(int i=0;i<3;i++){
            a1.add(sc.next());
        }
        System.out.println(a1);
    }
}
