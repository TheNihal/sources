/*
 Input one sentence and print that sentence.
 */

#include<stdio.h>
int main()
{
    char s[20];
    
    scanf("%[^\n]s", &s);       // specifies to assign input upon finding a newline.
    // gets(s);                 // assign inputs containing white spaces. 

    printf("%s\n", s);

    return 0;
}