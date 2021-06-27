/*

There will be several lines in the input terminated with a line containing a single ‘*’. This last lineshould not be processed. Each of the lines will contain either Hajj or Umrah.


// NULL char*
#include<stdio.h>
int main()
{
    int t=1;
    char s[14];
    char b;
    while(scanf("%s", &s), s[0]!='*')
    {
        printf("Case %d: %s\n", t,s);
        t++;
    }

    return 0;
}
*/
#include<stdio.h>
int main()
{
    int t=1;
    char s[15];
    char b;
    while(scanf("%s", &s), s[0]!='*')
    {
        printf("Case %d: %s\n", t++,s);
    }

    return 0;
}
