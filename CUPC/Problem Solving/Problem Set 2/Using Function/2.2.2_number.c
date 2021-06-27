#include<stdio.h>

int num;

void type_num(int num);

int main() {
    scanf("%d", &num);

    type_num(num);

    return 0;
}

void type_num(int num) {
    if(num==0)
    {
        printf("Zero\n");
    }
    else if(num>0)
    {
        printf("Positive\n");
    }
    else
    {
        printf("Negative\n");
    }

}