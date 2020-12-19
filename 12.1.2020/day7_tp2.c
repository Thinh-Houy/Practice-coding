/*
Write code in c to show that a input number from user is prime number or not
*/ 

#include<stdio.h>
#include<stdbool.h>
void main(){
    int input_num, m;
    bool isPrime = false;
    printf("Input your number(must bigger than 1) to see if it is a prime number or not?\n input here: ");
    scanf("%d",&input_num);

    m = input_num/2;
    for(int i = 2; i<= m; i++){
        if(input_num % i == 0){
            printf("The number you input %d is not a prime number.",input_num);
            isPrime = true;
            break;
        }
    }
    
    if(isPrime == false){
       printf("The number you input %d is a prime number",input_num);
    }
    
}