package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class MergeSort {

    public ArrayList<Integer> mSort(ArrayList<Integer> m, int start, int end)
    { int res[]= n;
        ArrayList<Integer> A=new ArrayList<>();
        ArrayList<Integer> B=new ArrayList<>();

        if(start>=end)
            res.add(m.get(start));

        else
        {  int r=start+end/2;
           A =mSort(m,start,r);
            B=mSort(m,r+1,end);
            res=merge(A,B);
            System.out.println("result is"+res);
        }




        return res;
    }

    public ArrayList<Integer>merge (ArrayList<Integer> A,ArrayList<Integer>B)
    { int i=0,j=0;
        ArrayList<Integer> result=new ArrayList<>();
        if(i!=A.size()-1 && j!=B.size()-1)
        {
            if(A.get(i)<=B.get(j))
            {
                result.add(A.get(i));
                i++;
            }
            else
            {
                result.add(B.get(j));
                j++;
            }

        }
        else {
            if(i>j)
            result.addAll(B);
            else
                result.addAll(A);
        }
        System.out.println(result);
        return result;
    }
}
