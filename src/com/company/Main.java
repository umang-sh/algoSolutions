package com.company;



import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
       Random ran = new Random();
//
        ArrayList<Integer> input = new ArrayList<>();
        for (int i = 0 ;i < 8; i++) {
            input.add(ran.nextInt(50) + 1);
        }
//        System.out.println("Numbers being");
//        for (int j = 0; j < 8; j++) {
//
//            System.out.println(input.get(j));
//        }
//
//        ArrayList output =InsertionSorted(input);
//        System.out.println("So
// rted Numbers being");
//        for (int j = 0; j <=7; j++) {
//
//            System.out.println(output.get(j));
        int Arr[]= {2000, 500, 200, 100, 50, 20, 10, 5, 1};

        //ChangeProblem cp=new ChangeProblem();
          MergeSort ms=new MergeSort();
        //System.out.println( cp.nCount(11,Arr));
        System.out.println("printingg");
        System.out.println(ms.mSort(input,0,input.size()-1));
//
//
//        Gcd g=new Gcd();
//        System.out.println(g.comGcd(1232,2464));

        }

       public static ArrayList InsertionSorted (ArrayList < Integer > input) {
            int i ;
            for (int j = 1; j <=input.size()-1; j++) {
                int key = input.get(j);
                i = j - 1;
                System.out.println("i is now" + i+ "A[i] is"+input.get(i));
                while (i >=0 && input.get(i) > key) {
                    input.set(i + 1, input.get(i));
                    i = i - 1;
                }
                input.set(i + 1, key);









            }
            return input;
        }
    }


