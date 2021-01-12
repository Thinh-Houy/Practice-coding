
/* 
    Write code in C to product a traingle in form below:
    Example: if N = 4, then form is 4x4
    1
    2 3
    4 5 6
    7 8 9 10
*/

#include<stdio.h>

void main(){
    int N, k=1;
    N = 4;
    for (int i = 1; i<= N; i++){
        // printf("%d",i);
        i = ++i;
        for(int j = i; j <= i; j++){
            printf("%d ",k);
            k++;
        }
        printf("\n");
    }
}