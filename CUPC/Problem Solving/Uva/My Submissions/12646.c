#include<stdio.h>
int main()
{
    int a, b, c;

    while(scanf("%d %d %d", &a, &b, &c)!=EOF)
    {
        if(a!=b && b==c)
            printf("A\n");

        else if(b!=a && a==c)
            printf("B\n");

        else if(c!=a && a==b)
            printf("C\n");

        else if(a==b && b==c)
            printf("*\n");
    }
    return 0;
}