
/* 
    Write code in C to product a traingle in form below:
    Example: if N = 4, then form is 4x4
    4
    4 3
    4 3 2
    4 3 2 1
*/

#include<stdio.h>

void main(){
    int N, k=1;
    N = 4;
    for (int i = N; i>=1; i--){
        for(int j = N; j >=i; j--){
            printf("%d ",j);
        }
        printf("\n");
    }
}