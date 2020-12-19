/*
Write code in c to show that a input number from user is prime number or not
*/ 

#include<stdio.h>
#include<stdbool.h>
void main(){
    int inputNum, countUp, halfVal;
    bool isPrime = false;
    printf("Input your number(must bigger than 1) to see if it is a prime number or not?\n input here: ");
    scanf("%d",&inputNum);

    countUp = 2;
    if(inputNum == 2 || inputNum == 3){
        printf("%d is a prime number",inputNum);
    }
    else
    {
        halfVal = inputNum/2;
        while (countUp <= halfVal)
        {
            if(inputNum % countUp == 0){
                printf("%d is not a prime number",inputNum);
                break;
            }
            else if(countUp == halfVal)
            {
                printf("%d is a prime number",inputNum);
                break;
            }
            else
            {
                countUp++;
            }            
        }        
    }    
}