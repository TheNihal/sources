#include<stdio.h>
int  h, m;

void time_is(int h, int m);
int main()
{
    scanf("%d:%d", &h, &m);

    time_is(h, m);

    return 0;
}
void time_is(int h, int m)
{
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
}
