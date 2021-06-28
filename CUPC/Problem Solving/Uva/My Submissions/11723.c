/* @Author	: MD. Fahim Abrar Saikat */
/* @Mail	: saikat.cucse.52@gmail.com */
/* @ID		: 1935202534 */
/* @Date	: 06/28/21, 09:32:01 PM */

#include <stdio.h>

int main()
{
    int R, N, test = 1, count;

    /* printf("%d\n", 3%2); */
    while (scanf("%d %d", &R, &N)) {
        if (N == 0 && R == 0) {
            break;
        }
        else if (R < N) {
            count = 0;
        }
        else {
            if ((R - N) % N == 0) {
                count = (R - N) / N;
            }
            else {
                count = (R - N) / N + 1;
            }
        }

        if (count > 26) {
            printf("Case %d: impossible\n", test++);
        }
        else {
            printf("Case %d: %d\n", test++, count);
        }
    }

    return 0;
}
