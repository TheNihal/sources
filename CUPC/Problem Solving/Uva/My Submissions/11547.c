#include<stdio.h>
int main()
{
    int t, n, num, i=2;
    unsigned int rem;
    scanf("%d", &t);

    while(t--)
    {
        scanf("%d", &n);

        num = (((((n*567)/9)+7492)*235)/47)-498;

        rem = num%10;
        num = num/10;
        rem = num%10;

        printf("%d\n", abs(rem));

    }

    return 0;
}

