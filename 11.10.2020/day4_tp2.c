/* Find the middle number of the 3 number below
A =5 B =2 C = 7
*/ 
#include<stdio.h>

void main(){
    int a, b, c, min, max, midNum;
    a = 5;
    b = 2;
    c = 7;
    // find the max number
     if (a > b && a > c){
        max = a;
        if(b < c) min = b;
        else min = c;
    }
    else if(b> a && b> c){
        max = b;
        if( a> c) min = c;
        else min = a;
    }
    else{
        max = c;
        if(a> b) min = b;
        else min = a;
    }
    // find the min number
    // find the middle number  midNum = a + b + c -min - max 
    midNum = a + b + c - min - max;
    
    printf("The middle number is %d", midNum);

}