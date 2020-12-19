/* Find the middle number of the 3 number below
A =5 B =2 C = 7
*/ 
#include<stdio.h>

void main(){
    int a, b, c, midNum;
    a = 5;
    b = 10;
    c = 7;
    // find the max number
     if (a > b && a < c){
       midNum = a;
    }
    else if(b > a && b < c){
        midNum = b;
    }
    else{
        midNum = c;
    }
    // find the middle number 
    printf("The middle number is %d", midNum);

}