#include<stdio.h>
int age;

int if_voter(int age);

int main() {
    scanf("%d", &age);
    if_voter(age);
    
    return 0;
}

int if_voter(int age) {
    if(age<0)
    {
        printf("Age is not valid\n");
    }
    else if(age>=18)
    {
        printf("Voter\n");
    }
    else
    {
        printf("Not Voter\n");
    }
}