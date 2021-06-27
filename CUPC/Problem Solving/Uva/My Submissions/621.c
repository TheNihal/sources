#include <stdio.h>
#include <string.h>

int main()
{
    int t;
    char ch[50];
    scanf("%d", &t);

    while (t--)
    {
        scanf("%s", &ch);

        if (strcmp(ch, "1") == 0 || strcmp(ch, "4") == 0 || strcmp(ch, "78") == 0)
            printf("+\n");

        else if (ch[strlen(ch) - 1] == '5' && ch[strlen(ch) - 2] == '3')
            printf("-\n");

        else if (ch[0] == '9' && ch[strlen(ch) - 1] == '4')
            printf("*\n");

        else if (ch[0] == '1' && ch[1] == '9' && ch[2] == '0')
            printf("?\n");

    }

    return 0;
}