/*
Find the minimum number in thes 3 numbers 
A = 5 , B =2 , C = 7;
*/

#include<stdio.h>

void main(){
    int a = 15, b =20 , c= 7;
    int max, min;

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
    printf("============================\n");
    printf("Max = %d\n", max);
    printf("Min = %d\n", min);
    printf("=============================");
}