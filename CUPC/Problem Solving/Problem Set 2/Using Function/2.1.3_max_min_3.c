#include<stdio.h>
void maxMin(int num1, int num2, int num3);

int main() {
    int a, b , c;
    scanf("%d%d%d", &a, &b, &c);
    
    maxMin(a, b, c);

    return 0;
}

void maxMin(int num1, int num2, int num3) {
    if(num1>num2 && num1>num3 || num1==num2 && num1>num3 || num1>num2 && num1==num3)
    {
        printf("%d\n", num1);
    }
    else if(num2>num1 && num2>num3 || num2==num1 && num2>num3 || num2>num1 && num2==num3)
    {
        printf("%d\n", num2);
    }
    else if (num3>num1 && num3>num2 || num3==num1 && num3>num2 || num3>num1 && num3==num2)
    {
        printf("%d\n", num3);
    }
    else
    {
        printf("Equal\n");
    }

}