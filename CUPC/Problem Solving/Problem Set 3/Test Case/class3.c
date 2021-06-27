/*
Check Odd/Even for T Integer Numbers.
*/

#include <stdio.h>
int main()
{
    int T, n;

    scanf("%d", &T);

    for (; T--;)
    {
        scanf("%d", &n);

        if (n % 2 == 0)
        {
            printf("Even\n");
        }
        else
        {
            printf("Odd\n");
        }
    }

    return 0;
}
