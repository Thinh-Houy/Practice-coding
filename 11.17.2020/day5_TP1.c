/* 
    Calculate S = 1 + 2 + 3 + ... + 100 by using C program.
*/ 

#include<stdio.h>
void main(){
    int S = 0;
    int i = 0;
    int a = 1;
    int b = 100;
    for(int i = a; i <= b; i++){
        S += i;
    }
    printf("S = %d + %d + %d + ... + %d = %d", a, a+1, a +2, b, S);

}