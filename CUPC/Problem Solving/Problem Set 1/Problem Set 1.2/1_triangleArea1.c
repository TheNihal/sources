/*
 Find the Area of Triangle using Base and Height.
 */

#include<stdio.h>
int main()
{
    float base, height;

    scanf("%f%f", &base, &height);

    float area = 0.5*base*height;

    printf("%.2f\n", area);

    return 0;
}