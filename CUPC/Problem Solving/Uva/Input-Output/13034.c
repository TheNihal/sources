/*
#include <stdio.h>
int main()
{
    int S, s=1, N=13, x[N];
    scanf("%d", &S);

    while(S--)
    {

        for(int i=0; i<N; i++)
        {
            scanf("%d", &x[i]);
        }

        printf("Set #%d: ", s);
        s++;

        for(int i=0; i<N; i++)
        {
            printf("%d ", x[i]);
        }
        printf("\n");
    }


    return 0;
}
*/
#include <stdio.h>
int main()
{
    int s, j=13, set=1, x[j];
    scanf("%d", &s);

    while(s--)
    {

        while(j--)
        {
            scanf("%d", &x[j]);
        }

        j=13;

        printf("Set #%d: ", set++);

        while(j--)
        {
            printf("%d ", x[j]);
        }
        j=13;

        printf("\n");

    }


    return 0;
}
