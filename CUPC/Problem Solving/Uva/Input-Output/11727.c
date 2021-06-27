/*

The  first line of input is an integer T(T<20) that indicates the number of test cases.
Each case consists of a line with 3 distinct positive integers. These 3 integers represent the salaries of the threeemployees.
All these integers will be in the range [1000;10000]

*/

#include <stdio.h>
int main()
{
    int t, x, y, z;
    scanf("%d", &t);

    while (t--)
    {
        scanf("%d%d%d", &x, &y, &z),
        printf("%d %d %d\n", x, y, z);
    }


    return 0;
}
