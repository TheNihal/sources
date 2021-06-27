/*

 First line of the input file is an integer t(t<15) which denotes how many sets of inputs are there.
 Each of the nexttlines contain two integers a and b(jaj;jbj<1000000001).

 Sample Input 
 3
 10 20
 20 10
 10 10
 
 */

#include <stdio.h>
int main()
{
    int a, b, t;
    scanf("%d", &t);

    while(t--)
    {
        scanf("%d%d", &a, &b);
        printf("%d %d\n", a, b);
    }

    return 0;
}
