#include<stdio.h>

void main(){
    int array[10];

    for(int i = 0; i< 10; i++){
        array[i] = i+1;
    }
    printf("Array: ");
    for(int i = 0; i < 10; i++){
        printf("%d ", array[i]);
    }
}