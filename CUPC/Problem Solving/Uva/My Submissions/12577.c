#include<stdio.h>
int main()
{
    int c=1;
    char w[50];

    while(scanf("%s", &w), w[0]!='*')
    {
        if(strcmp(w, "Hajj")==0)
            printf("Case %d: Hajj-e-Akbar\n", c++);
        else if(strcmp(w, "Umrah")==0)
            printf("Case %d: Hajj-e-Asghar\n", c++);
    }

    return 0;
}

