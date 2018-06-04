package com.company;

public class ChangeProblem {


public int nCount(int amount,int notes[]){
    int i=0,count=0;
    while (amount>0)
    {
        if(amount>=notes[i])
        {
            amount=amount-notes[i];
            count++;


        }
        else
        i++;

    }
    return count;
}


}