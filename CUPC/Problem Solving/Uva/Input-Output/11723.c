/*
 #include<stdio.h>
int main()
{
    int N, R;

    int t=1;
    while(t<=10002)
    {
        scanf("%d%d", &R, &N);
        printf("Case %d: %d %d\n", t, N, R);
        t++;
    }

    return 0;
*/

#include<stdio.h>
int main()
{
    int n, r, t=1;

    while(scanf("%d%d", &r, &n), (n>0 && r<10001))
    {
        printf("Case %d: %d %d\n", t++, n, r);
    }

    return 0;
}
