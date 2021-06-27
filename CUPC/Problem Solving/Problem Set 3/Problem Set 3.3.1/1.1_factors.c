/*
Number Theory

Print Factors of a Number.
*/

#include <stdio.h>
int main()
{
    int num, i = 1;
    scanf("%d", &num);

    while (i <= num)
    {
        if (num % i == 0)
        {
            printf("%d\n", i);
        }
        i++;
    }

    /*
    for (int i=1; i<=num; i++)          
    {
        if(num%i==0)
        {
            printf("%d\n", i);
        }
    }
    */

    /*
    do                                 
    {
        if (num % i == 0)
        {
            printf("%d\n", i);
        }
        i++;
    } while (i <= num);
    */

    return 0;
}