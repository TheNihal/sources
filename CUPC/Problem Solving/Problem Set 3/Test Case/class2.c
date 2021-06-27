/*
Check Odd/Even for 5 Integer Numbers.
*/

#include<stdio.h>
int main()
{
    int n=5, t;

    for( ;n--; )
    {
        scanf("%d", &t);

        if(t%2==0)
            printf("Even\n");
        else
            printf("Odd\n");
    }

    return 0;
}
