/*
 Find reminder of two numbers
 */

#include<stdio.h>
int main()
{
    int num1, num2;
    scanf("%d%d", &num1, &num2);

    int reminder = num1%num2;

    printf("%d\n", reminder);


    return 0;
}