/*
 I/O your Full Name, Your age, Your CGPA print as following:
 Hello, [your Full Name]
 Your age is [your age]
 Your CGPA is [your CGPA]
*/

#include<stdio.h>
int main()
{
    char name[30];
    int age;
    float cgpa;

    scanf("%[A-Za-z ]", &name);     // specifies to read char between A-z and a-z including white space
    scanf("%d", &age);
    scanf("%f", &cgpa);

    printf("Hello, %s\n", name);
    printf("Your age is %d\n", age);
    printf("Your CGPA is %f\n", cgpa);

    return 0;
}