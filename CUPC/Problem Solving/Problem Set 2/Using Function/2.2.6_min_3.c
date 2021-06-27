#include<stdio.h>
int num1, num2, num3;

void min(int num1, int num2, int num3);

int main()
{
    scanf("%d%d%d", &num1, &num2, &num3);

    min(num1, num2, num3);

    return 0;
}

void min(int num1, int num2, int num3)
{
    if(num1<num2 && num1<num3 || num1==num2 && num1<num3 || num1<num2 && num1==num3)
    {
        printf("%d\n", num1);
    }
    else if(num2<num1 && num2<num3 || num2==num1 && num2<num3 || num2<num1 && num2==num3)
    {
        printf("%d\n", num2);
    }
    else if (num3<num1 && num3<num2 || num3==num1 && num3<num2 || num3<num1 && num3==num2)
    {
        printf("%d\n", num3);
    }
    else
    {
        printf("Equal\n");
    }

}