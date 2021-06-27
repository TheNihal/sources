/*
 Find quotient of two numbers
 */

#include<stdio.h>
int main()
{
    float num1, num2;
    scanf("%d%d", &num1, &num2);

    float quotient = num1/num2;

    printf("%f\n", quotient);

    return 0;
}