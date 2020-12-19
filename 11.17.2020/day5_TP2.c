/* 
    Calculate S = 1 + 3 + 5 + ... + 99 by using C program.
*/
#include<stdio.h>

void main(){
    int i, s;
    s = 0;
    i = 1;
    for(i = 1; i < 100; i +=2){
        s += i;
    }
    printf("S = %d", s);

   

}