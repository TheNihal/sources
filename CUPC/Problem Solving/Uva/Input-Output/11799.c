/*
#include <stdio.h>
int main()
{
    int T, N, i[N], c = 1, x;
    scanf("%d", &T);

    while (T--)
    {
        scanf("%d", &N);
        for (x = 0; x < N; x++)
        {
            scanf("%d", &i[x]);
        }
        for (x = 0; x < N; x++)
        {
            if (x == 0)
            {
                printf("Case %d: %d ", c, i[x]);
                c++;
            }
            else if (x == (N - 1))
            {
                printf("%d\n", i[x]);
            }
            else
            {
                printf("%d ", i[x]);
            }
        }
    }

    return 0;
}
*/

#include <stdio.h>
int main()
{
    int t, n, i[10000], c = 1, x;
    scanf("%d", &t);

    while (t--)
    {
        scanf("%d", &n);
        for (x = 0; x < n; x++)
        {
            scanf("%d", &i[x]);
        }
        for (x = 0; x < n; x++)        {
            if (x == 0)
            {
                printf("Case %d: %d ", c++, i[x]);
            }
            else if (x == (n - 1))
            {
                printf("%d\n", i[x]);
            }
            else
            {
                printf("%d ", i[x]);
            }
        }
    }

    return 0;
}
