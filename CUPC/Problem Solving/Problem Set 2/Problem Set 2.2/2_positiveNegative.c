/*
Is a number Positive/ Negative/ Zero?
*/

#include<stdio.h>
int main()
{
    int num;
    scanf("%d", &num);      // signed int max limit: 2147483647, min limit: -2147483648

    if(num==0)
    {
        printf("Zero\n");
    }
    else if(num>0)
    {
        printf("Positive\n");
    }
    else
    {
        printf("Negative\n");
    }

    return 0;
}
