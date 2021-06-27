/*
Validate a Time.
*/

#include<stdio.h>
int main()
{
    int  h, m;
    scanf("%d:%d", &h, &m);
    printf("%02d:%02d\n", h, m);

    if(m>0 && m<60)
    {
        if(h>=0 && h<24)
        {
            printf("Valid\n");
        }
        else
        {
            printf("Invalid\n");
        }
    }
    else
    {
        printf("Invalid\n");
    }

    return 0;
}
