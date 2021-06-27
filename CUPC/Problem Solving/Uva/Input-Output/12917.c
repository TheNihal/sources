/*

Input:
The input consists of several test cases, each one on a single line that contains 3 integersP(1<=P<=5),H(1<=H<=5) andO(1<=P<=O<=10).

*/

#include <stdio.h>
int main()
{
    int p, h, o;

    while (scanf("%d%d%d", &p, &h, &o) != EOF)
    {
        printf("%d %d %d\n", p, h, o);
    }

    return 0;
}