#include<stdio.h>
void main(){
    int a,b,i,gcd, m;
    a =12;
    b = 9;
    m = (a + b)/2;
    for(i=1 ;i<= m;i++ ){
        if(a%i == 0){
            if(b%i ==0){
                gcd = i;
            }
        }
        i++;
        
       
    }
    printf("fdkjsl = %d",gcd);
}