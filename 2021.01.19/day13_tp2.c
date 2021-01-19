
#include<stdio.h>

int main(){
    int a = 10;
    int size = sizeof(a);
    int size_float = sizeof(float);
    int size_doouble = sizeof(double);


    printf("The size of variable a: %d", size);
    printf("The size of variable a: %d", size_float);
    printf("The size of variable a: %d", size_doouble);



    return 0;
}