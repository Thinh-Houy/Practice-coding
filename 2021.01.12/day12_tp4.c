#include<stdio.h>
int square (int x){
 int y;
 y = x*x;
 return y;   
}

void main(){
    int y, z = 5;
    y = square(z);
    printf("y = %d", y);
}