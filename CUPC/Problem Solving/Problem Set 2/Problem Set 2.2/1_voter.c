/*
Find Maximum between 2 numbers.
*/

#include<stdio.h>
int main()
{
    int age;
    scanf("%d", &age);

    if(age<0)
    {
        printf("Age is not valid\n");
    }
    else if(age>=18)
    {
        printf("Voter\n");
    }
    else
    {
        printf("Not Voter\n");
    }


    return 0;
}
