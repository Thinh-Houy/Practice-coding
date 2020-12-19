/*
Show the input(integer) from user is even or odd. 
*/ 
#include<stdio.h>
void main(){
    // get number from user
    int a;
    printf("Input your number here: ");
    scanf("%d", &a);

    // find if it is even or odd number
    if ((a % 2) == 0){
        printf("Your input number %d is even number", a);
    }
    else{
        printf("Your input number %d is odd number", a);
    }
}