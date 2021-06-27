/*
Determining whether a number is prime?
*/

#include<stdio.h>
int main()
{
    int num, i=1, count=0;
    scanf("%d", &num);


    while(i<=num)
    {
        if(num%i==0)
        {
            printf("%d\n", i);
            count++;
        }
        i++;
    }

    if(count>1 && count<=2)
    {
        printf("prime\n");
    }
    else
    {
        printf("Not prime\n");
    }


    return 0;
}