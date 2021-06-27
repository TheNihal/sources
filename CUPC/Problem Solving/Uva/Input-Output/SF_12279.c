/*

There are around 75 test cases in the input file. Each test case describes a series of events. A test case starts with an integer N(1N1000) denoting the number of events in this test case. This integeris followed by a line with N integers, each describing an event. These integers have values between 0 and 99 (inclusive). A value between 1 and 99 means a reason for Emoogle’s giving a treat has occurred while a 0 means he has given a treat.The end of input will be denoted by a case with N= 0. This case should not be processed

*/
/*
#include<stdio.h>
int main()
{
    int  n, x[n], c=1, i;

    while(scanf("%d", &n),(n!=0))
    {
        for (i = 0; i < n; i++)
        {
            scanf("%d", &x[i]);
        }

        for (i = 0; i < n; i++)
        {
            if (i == 0)
            {
                printf("Case %d: %d ", c, x[i]);
                c++;
            }
            else if (i == (n - 1))
            {
                printf("%d\n", x[i]);
            }
            else
            {
                printf("%d ", x[i]);
            }
        }
    }


    return 0;
}
*/
#include<stdio.h>
int main()
{
    int  n, x[n], c=1, i;

    while(scanf("%d", &n),(n!=0))
    {
        for (i = 0; i < n; i++)
        {
            scanf("%d", &x[i]);
        }

        for (i = 0; i < n; i++)
        {
            if (i == 0)
            {
                printf("Case %d: %d ", c++, x[i]);
            }
            else if (i == (n - 1))
            {
                printf("%d\n", x[i]);
            }
            else
            {
                printf("%d ", x[i]);
            }
        }
    }

    return 0;
}
