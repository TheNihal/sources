/*

The first line of input gives the number of test cases,1t100.  There are two lines for each test case. The first gives the number of stores Michael wants to visit,1n20, and the second gives theirninteger positions on Long Street,0xi99.

Sample Input
2
42
4  13  89  37
6
7  30  41  14  39  42

*/
// n> garbage value
#include<stdio.h>
int main()
{
    int t, n, x[n];
    scanf("%d", &t);

    while(t--)
    {
        scanf("%d", &n);

        for(int i=0; i<n; i++)
        {
            scanf("%d", &x[i]);
        }

        for(int i=0; i<n; i++)
        {
            printf("%d ", x[i]);
        }
        printf("\n");
    }

    return 0;
}
