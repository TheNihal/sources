#include<stdio.h>

void maxMin(int num1, int num2);

int main() {
    maxMin(10, 12);

    return 0;
}

void maxMin(int num1, int num2) {
    if(num1==num2)
    {
        printf("Equal\n");
    }
    else if(num1>num2)
    {
        printf("%d\n", num1);
    }
    else
    {
        printf("%d\n", num2);
    }
}