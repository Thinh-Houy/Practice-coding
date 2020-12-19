/*
 Show that the number input from user is positive or negative
*/ 

#include<stdio.h>

void main(){
    // get input number from user
    int num;
    printf("Input your number here: ");
    scanf("%d", &num);

    if(num > 0){
        printf("Your input number %d is positive", num);
    }
    else{
        printf("Your input number %d is negative", num);
    }

}