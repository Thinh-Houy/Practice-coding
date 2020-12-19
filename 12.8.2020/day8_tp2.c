/*
    Write code in C to find a prime factor of an input number
    ex. 12 = 1x2x2x3
*/

#include<stdio.h>

void main(){
    int inputNum, diviser, quotient, remainder, divideNum, primeFactor;
    printf("Input your number to find a prime factor of it.\ninput here: ");
    scanf("%d",&inputNum);
    diviser = 1;
    quotient = inputNum;
    for (int i = 1; i <= quotient; i++){
        diviser = i;
        remainder = quotient % diviser;
        if(remainder == 0){
            quotient = quotient/diviser;
        }
        else {
            diviser++;
        }
    }
    

}
