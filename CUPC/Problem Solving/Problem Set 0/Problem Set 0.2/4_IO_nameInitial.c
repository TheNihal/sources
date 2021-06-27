/*
 I/O your Name Initial. (Take input twice, and give output twice separately) 
 */

#include<stdio.h>
int main()
{
    char name1, name2;

    scanf("%[A-Za-z]%*c", &name1);      // "%[A-Za-z]" only read a char between A-Z or a-z, then "%*c" ignore a char
    scanf("%c", &name2);

    printf("%c\n", name1);
    printf("%c\n", name2);

    return 0;
}