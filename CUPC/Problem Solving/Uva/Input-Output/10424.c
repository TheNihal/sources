/*
Your input will be two names. Each name holds not more than 25 characters. End of file will indicatethe end of input.

Sample Input
saima
shanto
Pakistan
India
USA
USSR
*/
// NULL char
/*
#include<stdio.h>
int main()
{
    char name1[25], name2[25], ch;

    while (scanf("%s %s %c", &name1, &name2, &ch)!=EOF)
    {
        printf("%s %s\n", name1, name2);
//        scanf("%*c" );
    }
*/
#include<stdio.h>
int main()
{
    char name1[26], name2[26];

    while(scanf("%s%s", &name1, &name2)!=EOF)
    {
        printf("%s %s\n", name1, name2);
    }

    return 0;
}
