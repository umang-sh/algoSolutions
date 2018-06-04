package com.company;

public class Gcd {

    public int comGcd(int a,int b){
        if (b==0){return a;
        }

    else
        {
            return comGcd(b,a%b);
        }

    }
}
