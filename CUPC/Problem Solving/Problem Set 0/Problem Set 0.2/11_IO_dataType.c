/* 
 I/O different data type. (Including data type modifier)
 */

#include <stdio.h>
int main()
{
    int Int;
    printf("Int: ");
    scanf("%d", &Int);
    printf("Int: %d\n", Int);

    float Float;
    printf("Float: ");
    scanf("%f", &Float);
    printf("Float: %f\n", Float);

    double Double;
    printf("Double: ");
    scanf("%lf", &Double);
    printf("Double: %lf\n", Double);

    char ch;
    printf("Char: ");
    scanf("%*c%c", &ch);
    printf("Char: %c\n", ch);
    // unsigned char - %c

    char str[10];
    printf("String: ");
    scanf("%s", &str);
    printf("String: %s\n", str);

    signed int sInt;
    printf("Signed Int: ");
    scanf("%d", &sInt);
    printf("Signed Int: %d\n", sInt);

    unsigned int uInt;
    printf("Unsigned Int: ");
    scanf("%u", &uInt);
    printf("Unsigned Int: %u\n", uInt);

    short int shortInt;
    printf("Short Int: ");
    scanf("%hd", &shortInt);
    printf("Short Int: %hd\n", shortInt);

    long int lInt;
    printf("Long Int: ");
    scanf("%ld", &lInt);
    printf("Long Int: %ld\n", lInt);

    unsigned long int ulInt;
    printf("Unsigned Long Int: ");
    scanf("%lu", &lInt);
    printf("Unsigned Long Int: %lu\n", lInt);

    long long int llInt;
    printf("Long Long Int: ");
    scanf("%lld",  llInt);
    printf("Long Long Int: %lld\n", llInt);

    unsigned long long int ullInt;
    printf("Unsigned Long Long Int: ");
    scanf("%llu", &ullInt);
    printf("Unsigned Long LOng Int: %llu\n", ullInt);



    return 0;
}