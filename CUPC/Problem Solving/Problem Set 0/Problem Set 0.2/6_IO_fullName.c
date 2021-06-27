/*
 I/O your Full Name. (Take input twice, and give output twice separately)
 */

#include<stdio.h>
int main()
{
    char name[30];

    scanf("%[A-Za-z ]%*c", &name);      // specifies to read char between A-z and a-z including white space, then ignore a char 
    scanf("%[A-Za-z ]%*c", &name);      // specifies to read char between A-z and a-z including white space, then ignore a char

    printf("%s\n", name);
    printf("%s\n", name);
    return 0;
}
