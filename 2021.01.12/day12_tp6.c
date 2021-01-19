#include<stdio.h>

void Swap(int *x, int *y){
    int temp;
    temp = *x;
    *x = *y;
    *y = temp;
    printf("In Swap: x = %x, y = %x \n", x, y);
    
}

void main(){
    int a, b;
    a = 10;
    b = 20;
    printf("Before Swap: a = %d, b = %d \n", a, b);
    Swap(&a,&b);
    printf("After Swap: a = %d, b = %d \n", a, b);
}