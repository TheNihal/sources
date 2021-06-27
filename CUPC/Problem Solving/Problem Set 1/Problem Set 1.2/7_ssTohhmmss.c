/*
 Convert Second to HH:MM:SS.
 */

#include<stdio.h>
int main()
{
    int ss;
    scanf("%d", &ss);

    int hh = ss/3600;
    ss = ss%3600;
    
    int mm = ss/60;
    ss = ss%60;

    printf("%02d:%02d:%02d\n", hh, mm, ss);

}

 