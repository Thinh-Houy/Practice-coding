/*
    Give a fibonacci series in N term, and N>=3
    Ex: N = 6 => Fibo(6) = 1 1 2 3 5 8
*/ 

#include<stdio.h>
void main(){
    int N, fibo, n,m;
    N = 6;
    m = 1;
    fibo = 1;
    // printf("Fibo = %d ", fibo);
    if(m<=25){
        for(int i = 1; i <=N ; i++){
                printf("%d ",fibo);
                n = fibo + m;
                fibo = m;
                m = n;
            }
    }   
    
}