/*
    Write code in c to find the greatest common divisor of 2 integer number which 
    input by user
*/

#include<stdio.h>
void main(){
    int a, b, temp, gcd;
    printf("Input a: ");
    scanf("%d",&a);
    printf("Input b: ");
    scanf("%d",&b);
    
    // ========================
    while (b != 0)
    {
        if(a > b){
            a = a -b;
        }
        else{
            b = b - a;
        }
    }
    gcd = a;
    printf("GCD = %d", gcd);

    // while (b != 0){
    //     temp = b;
    //     b = a % b;
    //     a = temp;
    // }
    // gcd = a;
    // printf("GCD = %d", gcd);

}