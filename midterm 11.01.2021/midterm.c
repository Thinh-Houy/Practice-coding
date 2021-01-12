#include <stdio.h>
int main(){
    int N, i, j;    
    printf("This program allows the user input a value of n and then\nthe output show the decrement from n to 1 in both row and column.");
    start:
    printf("Input your number here: ");
    scanf("%d",&N);
    if(N>0){
        for (i=0; i<=N; i++)
            {
                for (j=N-i; j>0; j--)
                {
                    printf("%d ", j);
                }
                printf("\n");
            }
    }
    else{
        printf("\nplease input number that bigger than 0\n");
        goto start;
    }    
}