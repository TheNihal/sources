#include<stdio.h>

int main()
{
    long long int x, y;

    while(scanf("%llu %llu", &x, &y)!=EOF)
    {   
        if (x>y)
        {
            printf("%llu\n", (x - y));
        }
        else
        {
            printf("%llu\n", (y-x));
        }
    }

    return 0;
}
