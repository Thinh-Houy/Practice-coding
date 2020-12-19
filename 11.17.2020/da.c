    #include <stdio.h> 
    #include <stdbool.h> 
    #include <math.h> 
     
    int main () 
    { 
        for (int i = 1; i < 101; i++) 
        { 
            bool prime = true; 
            for (int j = 2; j <= i/2; j++){
                if(i%j == 0){
                    prime = false;
                }
            }
            if(prime == true){
                printf("%d\n",i);
            }
        }
     
        return 0; 
    } 