/* 
 Calculate S = 1 + 2 + 3 + ... + n term(odd number) which 
 n_term = 60 by using C programming.
*/ 

#include<stdio.h>
void main(){
    int s, i, n;
    s = 0;
    i = 1;
    for(n = 1; n <= 60; n++){
        printf("i = %d  n = %d\n", i, n);
        s = s + i;
        i = i + 2;
        
    }
    printf("n = %d\n", n);
    printf("S = %d\n", s);

}