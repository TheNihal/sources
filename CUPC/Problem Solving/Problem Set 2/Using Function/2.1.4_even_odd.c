#include<stdio.h>
int num;

void evenOdd(int num);

int main() {
    scanf("%d", &num);
    evenOdd(num);

    return 0;
}

void evenOdd(int num) {
    if(num==0)
    {
        printf(" Zero is neither even nor odd");
    }
    else if(num%2==0)
    {
        printf("Even\n");
    }
    else
    {
        printf("Odd\n");
    }
}