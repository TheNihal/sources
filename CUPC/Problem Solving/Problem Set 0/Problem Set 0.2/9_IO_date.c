/*
 Input date in MM/DD/YYYY (12/01/2020) format and print in DD-MM-YYYY (01-12-2020) format.
 */

#include<stdio.h>
int main()
{
    int dd, mm, yyyy;

    scanf("%d/%d/%d", &mm, &dd, &yyyy);     // specifies to read a particular special char inbetween decimals

    printf("%02d-%02d-%d\n", dd, mm, yyyy); // specifies to print in a particular format when possible
    
    return 0;
}