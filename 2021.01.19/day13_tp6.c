#include<stdio.h>

void main(){
    int array[5] = {1, 2, 3, 4, 5};

    int array_length = sizeof(array) /sizeof(array[0]);
    printf("The size of array is %d \n", array_length);
    for(int i = 0; i< array_length; i++){
        printf("%d", array[i]);
    }
    array[2] = 10;
    printf("\narray: ");
    for(int i = 0; i < array_length; i++){
        printf("%d ", array[i]);
    }
}