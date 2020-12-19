/*
Write code in C to create a multiplication table by input by user.
for example: Enter 3 and output is:
3 x 1 = 3
3 x 2 = 6
...
3 x 10 = 30
*/ 

#include<stdio.h>

void main(){
    int input_num, result,countUp = 1;

    printf("Enter number: ");
    scanf("%d",&input_num);
    
    for(countUp; countUp <= 10; countUp++){
        result = input_num * countUp;
        printf("%d x %d = %d\n",input_num, countUp, result);
    }
}