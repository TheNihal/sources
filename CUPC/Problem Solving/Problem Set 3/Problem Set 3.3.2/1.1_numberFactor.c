/*
Number Theory

Count Number of Factor.
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
            count++;
        }
        i++;
    }

    // for( ; i<=num; i++)
    // {
    //     if(num%i==0)
    //     {
    //         count++;
    //     }
    // }


    // do
    // {
    //     if(num%i==0)
    //     {
    //         count++;
    //     }
    //     i++;
    // } while (i<=num);
    

    printf("%d\n", count);

    return 0;
}