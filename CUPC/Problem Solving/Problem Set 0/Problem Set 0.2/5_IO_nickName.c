/*
 I/O your Nickname. (Take input twice, and give output twice separately) 
 */

#include<stdio.h>
int main()
{
    char name1[10], name2[10];

    scanf("%s", &name1);
    scanf("%s", &name2);

    printf("%s\n", name1);
    printf("%s\n", name2);

    return 0;
}