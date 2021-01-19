#include<stdio.h>

void main(){
    int array[5] = {1, 2, 3, 4, 5};

    int Array_length = sizeof(array) /sizeof(array[0]);
    printf("The size of array is %d \n", Array_length);
}