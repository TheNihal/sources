
#include <stdio.h>
int main()
{
    int t, e1, e2, e3, c=1;
    scanf("%d", &t);

    while(t--)
    {
        scanf("%d%d%d", &e1, &e2, &e3);
        
        if ((e1 > e2 && e1 < e3) || (e1 > e3 && e1 < e2))
            printf("Case %d: %d\n", c++, e1);
        else if ((e2 > e1 && e2 < e3) || (e2 < e1 && e2 > e3))
            printf("Case %d: %d\n", c++, e2);
        else
            printf("Case %d: %d\n", c++, e3);
    }
    return 0;
}
