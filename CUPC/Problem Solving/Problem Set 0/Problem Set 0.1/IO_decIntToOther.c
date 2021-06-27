/*
 Input one integer (decimal) number and print that number in the decimal, octal, and hexadecimal number system.
 */

#include<stdio.h>
int main()
{
    int num;

    scanf("%d", &num);          // as specified to input a decimal number

    printf("%d\n", num);        // decimal
    printf("%o\n", num);        // octal
    printf("%x\n", num);        // hexadecimal

    return 0;
}