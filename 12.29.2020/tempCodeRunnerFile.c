
/* 
    Write code in C to product a traingle in form below:
    Example: if N = 4, then form is 4x4
    1
    1 2
    1 2 3
    1 2 3 4
*/

#include<stdio.h>

void main(){
    int N;
    N = 4;
    for (int i = 1; i<= 4; i++){
        printf("%d\n",i);
        for(int j = 1; j <= i; j++){
            printf("%d ",j);
            j++;
        }
    }
}