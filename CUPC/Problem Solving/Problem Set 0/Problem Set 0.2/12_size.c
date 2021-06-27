/*
 Print size in bytes for different data types.
 */

#include<stdio.h>
int main()
{
    int i;
    float f;
    double d;
    char c;

    printf("Int: %d\n", sizeof(i));
    printf("Float: %d\n", sizeof(f));
    printf("Double %d\n", sizeof(d));
    printf("Char: %d\n", sizeof(c));
    
    return 0;
}