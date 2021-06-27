#include<stdio.h>
int main()
{
    int p, h, o;
    
    while (scanf("%d%d%d",&p,&h,&o)!=EOF)
    {
        if (h+p>o) 
            printf("Hunters win!\n");
        else 
            printf("Props win!\n");
    }
    


    return 0;
}