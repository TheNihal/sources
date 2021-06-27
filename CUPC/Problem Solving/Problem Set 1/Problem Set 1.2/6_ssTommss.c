/*
 Convert Second to MM:SS.
 */

#include<stdio.h>
int main()
{
    int ss;
    scanf("%d", &ss);

    int mm = ss/60;
    ss = ss%60;

    printf("%02d:%02d\n", mm, ss);

}

 