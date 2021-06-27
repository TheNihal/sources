/*
Validate a Date.
*/

#include<stdio.h>
int main()
{
    int d, m, y;
    scanf("%d/%d/%d", &d, &m, &y);
//    printf("%02d/%02d/%04d\n", d,m,y);


    if((y>0 && y<9999) && y%400==0 || (y%100!=0 && y%4==0))
    {
        if(m==2 && (d>0 && d<=29))
        {
            printf("Valid\n");
        }
        else
        {
            printf("Invalid\n");
        }
    }
    else if (y>0 && y<9999)
    {
        if(m==2 && (d>0 && d<29))
        {
            printf("Valid\n");
        }
        else if ((m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12) && (d>0 && d<=31))
        {
            printf("Valid\n");
        }
        else if((m==4 || m==6 || m==9 || m==11) && (d>0 && d<31))
                {
                    printf("Valid\n");
                }
        else
        {
            printf("Invalid\n");
        }
    }
    else
    {
        printf("Invalid\n");
    }


    return 0;
}
