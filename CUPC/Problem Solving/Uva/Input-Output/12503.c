/*

The first line contains the number of test cases T (T<=100). Each test case begins with an integer n(1<=n<=100), the number of instructions. Each of the following n lines contains an instruction.

*/

#include <stdio.h>
int main()
{
    int t, n, i;
    char x[100][100];
    scanf("%d", &t);

    while (t--)
    {
        scanf("%d", &n);

        for (i = 1; i <= n; i++)
        {
            scanf("%s", &x[i]);
        }

        for (i = 1; i <= n; i++)
        {
            if (i == n)
            {
                printf("%s\n", x[i]);
            }
            else
            {
                printf("%s ", x[i]);
            }
        }
    }

    return 0;
}