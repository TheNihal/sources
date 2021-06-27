/*
 Find the Area of a Triangle using the length of 3 sides.
 */

#include<stdio.h>
#include<math.h>

int main()
{
    float a, b, c, s, area;

    scanf("%f%f%f", &a, &b, &c);

    s = (a+b+c)/2;
    area = sqrt(s*(s-a)*(s-b)*(s-c));

    printf("%f\n", area);



}