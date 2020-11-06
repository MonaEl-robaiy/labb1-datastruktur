package com.company;
import java.util.LinkedList;
public class Main {



    public static void main(String[] args) {
            LinkedList<Integer> list = new LinkedList<Integer>();
            // lägg till 5,10,25
            list.add(5);
            list.add(10);
            list.add(25);

            System.out.println(list.get(0));
            System.out.println(list.get(1));
            System.out.println(list.get(2));
        }

    }

