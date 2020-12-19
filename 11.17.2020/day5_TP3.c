//  rewrite TP1, TP2 using while loop
#include<stdio.h>
void main(){
    int i, s;
    s = 0;
    i = 0;
    while(i <=100){
        s = s + i;
        i++;
    }
    printf("TP1: S = %d\n", s);

    s = 0;
    i = 1;
    while(i <= 100){
        s = s + i;
        i = i + 2;
    }
    printf("TP2: S = %d\n",s);

    
}