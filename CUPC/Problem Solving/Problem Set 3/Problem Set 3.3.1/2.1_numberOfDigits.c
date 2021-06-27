/*
Digit

Count the number of Digits in an integer number.
*/

#include <stdio.h>
int main()
{
    int num, temp, count = 0;
    scanf("%d", &num);
    temp = num;

    while (temp != 0)
    {
        int rem = temp % 10;
        // printf("%d\n", rem); 
        temp /= 10;
        count++;
    }

/*
    for (int i = 1; temp != 0; i++)
    {
        int rem = temp % 10; // 5 5 2
        // printf("%d ", rem);
        temp /= 10; //25 2 0
        count++;
    }

*/

/*
    do
    {
        int rem = temp % 10;
        // printf("%d\n", rem);
        temp /= 10;
        count++;

    } while (temp != 0);
*/
    printf("%d\n", count);

    return 0;
}