#include<stdio.h>
int main()
{
    int t, n, k, p, c=1;
    scanf("%d", &t);

    while(t--)
    {
        scanf("%d %d %d", &n, &k, &p);

        if((p%n)==0)
        {
            printf("Case %d: %d\n", c++, k);
        }

        else if(((p%n)+k)<=n)
        {
            printf("Case %d: %d\n", c++, (p%n)+k);
        }
        else if(((p%n)+k)>n)
        {
            printf("Case %d: %d\n", c++, ((p%n)+k)-n);
        }
    }


    return 0;
}