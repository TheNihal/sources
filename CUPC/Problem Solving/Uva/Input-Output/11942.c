#include <stdio.h>
int main()
{
    int n, l[10];
    scanf("%d", &n);

    while (n--)
    {
        for (int i = 0; i < 10; i++)
        {
            scanf("%d", &l[i]);
        }
        for (int i = 0; i < 10; i++)
        {
            if (i == 9)
            {
                printf("%d\n", l[i]);
            }
            else
            {
                printf("%d ", l[i]);
            }
        }
    }

    return 0;
}
