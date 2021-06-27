/*
 Convert Temperature Celsius to Fahrenheit.
 */

#include<stdio.h>
int main()
{
    float c;
    scanf("%f", &c);

    float f = (c*9)/5 + 32; // c/5 = (f-32)/9 = (k-273)/5; f = (c*9)/5+32

    printf("%f\n", f);
    
    return 0;
}