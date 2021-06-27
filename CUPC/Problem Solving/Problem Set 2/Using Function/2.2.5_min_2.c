#include<stdio.h>
int num1, num2;

void min(int num1, int num2);

int main()
{
    scanf("%d%d", &num1, &num2);

    min(num1, num2);

    return 0;
}

void min(int num1, int num2)
{
    if(num1==num2)
    {
        printf("Equal\n");
    }
    else if(num1>num2)
    {
        printf("%d\n", num2);
    }
    else
    {
        printf("%d\n", num1);
    }
}