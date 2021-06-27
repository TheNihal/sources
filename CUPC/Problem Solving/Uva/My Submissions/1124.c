#include<stdio.h>
int main()
{
    char str[100];

    while(scanf("%[^\n]s", &str)!=EOF)
    {
        printf("%s\n", str);
        getchar();
    }

    return 0;
}
