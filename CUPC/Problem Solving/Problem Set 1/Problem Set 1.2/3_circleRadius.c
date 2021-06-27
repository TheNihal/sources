/*
 Find the Area of Circle using Radius.
 */

#include<stdio.h>
#include<math.h>

int main()
{
    float r;
    scanf("%f", &r);
    float area = M_PI*r*r;

    printf("%.2f\n", area);
    return 0;
}