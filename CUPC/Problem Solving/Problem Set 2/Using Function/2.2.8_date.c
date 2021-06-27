#include<stdio.h>
int d, m, y;

void date_is(int d, int m, int y);

int main()
{
    scanf("%d/%d/%d", &d, &m, &y);

    date_is(d, m, y);

    return 0;
}

void date_is(int d, int m, int y)
{
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

}