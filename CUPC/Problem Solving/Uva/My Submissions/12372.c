#include<stdio.h>
int main()
{
    int t, l, h, w, c=1;
    scanf("%d", &t);

    while(t--)
    {
        scanf("%d %d %d", &l, &w, &h);
        
        if(l<=20 && w<=20 && h<=20)
            printf("Case %d: good\n", c++);
        
        else 
            printf("Case %d: bad\n", c++);

    }

    return 0;
}