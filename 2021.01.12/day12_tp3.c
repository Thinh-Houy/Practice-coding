#include<stdio.h>
void main(){
    int x, y;
    x = 10;
    y = 20;
    printf("Before: x = %d, y = %d \n", x, y);
    int temp;
    temp = y;
    x = y;
    y = temp;
    printf("After: x = %d, y = %d \n", x, y);
    
}