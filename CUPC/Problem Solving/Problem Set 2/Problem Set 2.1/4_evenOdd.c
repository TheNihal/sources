/*
Determining whether a number is EVEN or ODD?
*/

#include<stdio.h>
int main()
{
    int num;
    scanf("%d", &num);

    if(num==0)
    {
        printf(" Zero is neither even nor odd");
    }
    else if(num%2==0)
    {
        printf("Even\n");
    }
    else
    {
        printf("Odd\n");
    }

    return 0;
}
