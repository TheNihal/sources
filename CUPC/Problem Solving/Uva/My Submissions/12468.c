#include<stdio.h>
int main()
{
    int ch1, ch2, next, prev;

    while(scanf("%d %d", &ch1, &ch2), !(ch1==-1 && ch2==-1))
    {
        if(ch2 > ch1)
        {
            next = ch2 - ch1;
            prev = 100 + ch1 - ch2;
        }
        else
        {
            next = ch1 - ch2;
            prev = 100 + ch2 - ch1;
        }

        if(next>prev)
        {
            printf("%d\n", prev);
        }
        else
        {
            printf("%d\n", next);
        }
    }

    return 0;
}