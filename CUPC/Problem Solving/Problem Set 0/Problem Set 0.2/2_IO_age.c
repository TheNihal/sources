/*
 I/O your Age. (Take input twice, and give output twice separately) 
 */

#include<stdio.h>
int main()
{
    int age;

    scanf("%d", &age);
    scanf("%d", &age);

    printf("%d\n", age);
    printf("%d\n", age);
    // printf("%d %d\n", age, age);

    return 0;
}