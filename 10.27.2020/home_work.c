/* a*x^2 + b*x + c;
Find x if a = 2, b = -3, c = 1;

** Algorithm 
delta = b*b - 4*a*c;
rt_delta = sqrt(delta);
x1 = (-b + rt_delta) / (2*a);
x2 = (-b - rt_delat) / (2*a)

*/

#include<stdio.h>
#include<math.h>

void main(){
    float a, b, c; // input variable
    float delta, x1, x2, verify_x1, verify_x2;  // output variable

    a = 2; b =-3; c =1;

    delta = pow(b, 2) - 4*(a * c);
    x1 = (-b + sqrt(delta)) / (2 * a);
    x2 = (-b - sqrt(delta)) / (2 * a);

    verify_x1 = a*pow(x1, 2) + b*x1 + c;
    verify_x2 = a*pow(x2, 2) + b*x2 + c;

    printf("delta = %f\n", delta);
    printf("x1 = %.2f\n", x1); 
    printf("x2 = %.2f\n", x2); 
    printf("verify x1 = %f\n", verify_x1); 
    printf("verify x2 = %f\n", verify_x2); 

}