// class 27 October 2020
// The using of Variable

#include<stdio.h>

// include for using in number 3.
#include<math.h>



void main(){
//1. DECLEAR A VARIABLE
// int x;
// int y = 5;
// x = y*3;
// printf("the value of x = %d \n",x);
// printf("the value of y = %d", y);

//=================================

//2.Using multiple variable
//   int x, y, z;
//     x = 2;
//     y = 3 * x;
//     z = x + y;

//     printf("x = %d \ny = %d \nz = %d", x, y, z);
//     printf("\n\n");
    
//     int a = 2;
//     int b;
//     for(int i = 0; i<= 10; i++){
//         b = a * i;
//         printf("%d x %d = %d \n",a, i, b);
//     }

//=========================================

//3. 
// float x;
// float y = 8.0;
// x = (y - 3)/2;
// printf("y = x/2 + 3\nwhich y = 7\nfind x?\n");
// printf("answer\nx = %f",x);

//=========================================

//4. SQUARE ROOT
// float y, x;
// x = 4.0;
// y = sqrt(x);
// printf("square root of %f is %f", x, y);
// }

//============================================

//5. calculate equation
/* a*x^2 + b*x + c = 0
 Find x if a = 2, b = 3, c = 1 */

 int a = 2, b = 3, c = 1;
 float x1, x2, delta, verify_x1, verify_x2;
 delta = pow(b,2) - 4*(a*c);

 x1 = (-b + sqrt(delta)) / (2 * a);
 x2 = (-b - sqrt(delta)) / (2 * a);

    verify_x1 = a*pow(x1, 2) + b*x1 + c;
    verify_x2 = a*pow(x2, 2) + b*x2 + c;

    printf("delta = %f\n", delta);
    printf("x1 = %f\n", x1); 
    printf("x2 = %f\n", x2); 
    printf("verify x1 = %f\n", verify_x1); 
    printf("verify x2 = %f\n", verify_x2); 


}