/*
 Convert Temperature Fahrenheit to Celsius.
 */

#include<stdio.h>
int main()
{
    float f;
    scanf("%f", &f);

    float c = ((f-32)*5)/9; // c/5 = (f-32)/9; c = ((f-32)*5)/9

    printf("%f\n", c);

    return 0;
}