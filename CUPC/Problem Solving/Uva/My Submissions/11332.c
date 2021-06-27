/* @Author	: MD. Fahim Abrar Saikat */
/* @Mail	: saikat.cucse.52@gmail.com */
/* @ID		: 1935202534 */
/* @Date	: 06/27/21, 09:33:02 PM */

#include <stdio.h>

int main()
{
    long long int n, sum = 0;

    while (scanf("%lld", &n)) {

        if (n == 0) {
            break;
        }

        while ((n / 10) != 0) {
            sum = 0;

            while (n != 0) {
                sum += (n%10);
                n /= 10;
            }

            n = sum;
        }

        printf("%lld\n", n);
    }

    return 0;
}
