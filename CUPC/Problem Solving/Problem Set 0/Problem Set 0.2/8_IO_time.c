/*
 Input current time in HH:MM:SS (1:5:30) format and print in HH.MM.SS (01.05.30) format.
 */

#include<stdio.h>
int main()
{
    int hh, mm, ss;

    scanf("%d:%d:%d", &hh, &mm, &ss);       // specifies to read a particular special char inbetween decimals

    printf("%02d.%02d.%02d\n", hh, mm, ss); // specifies to print in a particular format when possible
    
    return 0;
}