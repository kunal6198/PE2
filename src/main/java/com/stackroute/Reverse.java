package com.stackroute;

public class Reverse {
    public int reverseIt(int a){
        int sum=0;
        while(a>0)
        {
            sum=(sum*10)+a%10;
            a=a/10;
        }
        return sum;
    }

    public String reverseFun(int n) {
        int a=reverseIt(n);
        if(a==n) return "Yes";
        else return "No";
    }


}
