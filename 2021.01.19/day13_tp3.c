#include<stdio.h>
void main(){
    int array[5]= {1, 2, 3, 4, 5};
    int size = sizeof(array[0]);

    printf("The size of array[0] is %d", size);
}