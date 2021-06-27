/*
Check Odd/Even until end of file.
*/

#include <stdio.h>
int main()
{
    int n, b;

    //    b=scanf("%d", &n);
    //    printf("%d\n", b);
    //    printf("%d\n", n);
    //
    //    b=scanf("%d", &n);
    //    printf("%d\n", b);
    //    printf("%d\n", n);

    while (scanf("%d", &n) != EOF)
    {
        if (n % 2 == 0)
        {
            printf("Even\n");
        }
        else
        {
            printf("Odd\n");
        }
    }
    // int even[20], odd[20];
    // // int i=0, j=0;
    // int e=0, o=0;
    // while (scanf("%d", &n)!=EOF)
    // {
    //     if (         n % 2 == 0)
    //     { // printf("Even\n");
    //         even[e] = n;
    //         e++;
    //     }
    //     else
    //     {
    //         // printf("Odd\n");
    //         odd[o] = n;
    //         // j++;
    //         o++;
    //     }
    // }
    // for(int i=0;i<e;i++)
    // {
    //     printf("Even: %d\n", even[i]);

    // }


    return 0;
}
