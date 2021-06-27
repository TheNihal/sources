#include<stdio.h>
int main()
{
    int t, i, shop, position[20], max, min, walk;
    scanf("%d", &t);

    while (t--)
    {
        scanf("%d", &shop);
        for(i=0; i<shop; i++)
        {
            scanf("%d", &position[i]);
        }
        
        max = position[0];
        for(i=0; i<shop; i++)
        {
            if(position[i]>max)
            {
                max = position[i];
            }
        }

        min = position[0];
        for(i=0; i<shop; i++)
        {
            if(position[i]<min)
            {
                min = position[i];
            }
        }

        walk = (max - min)*2;
        printf("%d\n", walk);
    }

    

    return 0;
}