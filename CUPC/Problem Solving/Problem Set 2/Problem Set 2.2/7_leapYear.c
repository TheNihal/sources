/*
Check is a year Leap Year or Not.
*/

#include<stdio.h>
int main()
{
    int year;
    scanf("%d",&year);
    if(year>=1582 && year%400!=0 && year%100==0) // Gregorian's law
    {
        printf("Not a leap year\n");
    }
    else if(year>=1582 && year%4==0) // Julian's law
    {
        printf("Leap year\n");
    }
    else
        printf("Concept started from 1582\n");
    return 0;
}

