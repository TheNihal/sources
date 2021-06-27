/*
 Input one integer number (decimal/octal/hexadecimal) and print that number in the decimal, octal, and hexadecimal number system.
 */

#include<stdio.h>
int main()
{
    int num;

    scanf("%i", &num);      // specifies to read integers in general from all number systems.

    printf("%d\n", num);
    printf("%o\n", num);
    printf("%x\n", num);
    
    return 0;
}