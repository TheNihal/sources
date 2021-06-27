/*
 Convert Second to DD:HH:MM:SS.
 */

#include<stdio.h>
int main()
{
    int ss;
    scanf("%d", &ss);

    int dd = ss/(3600*24);
    ss = ss%(3600*24);

    int hh = ss/3600;
    ss = ss%3600;
    
    int mm = ss/60;
    ss = ss%60;

    printf("%02d:%02d:%02d:%02d\n", dd, hh, mm, ss);

}

 