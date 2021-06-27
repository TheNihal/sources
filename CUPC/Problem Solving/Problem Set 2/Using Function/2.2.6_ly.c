#include<stdio.h>
int year;

void if_leap(int year);

int main()
{
    scanf("%d", &year);
    if_leap(year);

    return 0;
}

void if_leap(int year)
{
    if(year%4!=0 || year%400!=0 && year%100==0 ) // Gregorian's law
    {
        printf("Not a leap year\n");
    }
    else if(year%4==0) // Julian's law
    {
        printf("Leap year\n");
    }
}