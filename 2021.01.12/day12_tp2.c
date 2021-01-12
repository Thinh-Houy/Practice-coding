
#include<stdio.h>

void main(){
    int a, *pa;
    a = 10;
    pa = &a;
    printf("value x = %d \n",a);
    printf("Address x = %x \n", &a);
    printf("value through px = %d \n", *pa);
    printf("Address through px = %x \n",pa);

}