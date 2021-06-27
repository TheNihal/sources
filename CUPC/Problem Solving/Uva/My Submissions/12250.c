#include<stdio.h>
int main()
{
    int c=1;
    char w[50];

    while(scanf("%s", &w), w[0]!='#')
    {
        if(strcmp(w, "HELLO")==0)
            printf("Case %d: ENGLISH\n", c++);
        else if(strcmp(w, "HOLA")==0)
            printf("Case %d: SPANISH\n", c++);
        else if(strcmp(w, "HALLO")==0)
            printf("Case %d: GERMAN\n", c++);
        else if(strcmp(w, "BONJOUR")==0)
            printf("Case %d: FRENCH\n", c++);
        else if(strcmp(w, "CIAO")==0)
            printf("Case %d: ITALIAN\n", c++);
        else if(strcmp(w, "ZDRAVSTVUJTE")==0)
            printf("Case %d: RUSSIAN\n", c++);
        else
            printf("Case %d: UNKNOWN\n", c++);
    }

    return 0;
}
