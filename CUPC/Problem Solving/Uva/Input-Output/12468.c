/*
#include<stdio.h>
int main()
{
    int t, a, b;

    while (scanf("%d%d", &a, &b), a>=0 && b>=0)
    {
        printf("%d %d\n", a, b);
    }
    

    return 0;
}
*/
#include<stdio.h>
int main()
{
    int t, a, b;

    while (scanf("%d%d", &a, &b), !(a==-1 && b==-1))
    {
        printf("%d %d\n", a, b);
    }


    return 0;
}
