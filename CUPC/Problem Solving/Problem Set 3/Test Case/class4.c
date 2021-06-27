/*
Check Odd/Even until negative input.
*/

#include <stdio.h>
int main()
{
    int n;

    for (; scanf("%d", &n), n >= 0;)
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

    return 0;
}
