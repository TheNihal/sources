#include<stdio.h>
void result(int n);

int main() {
    
    result(32);

    return 0;
}

void result(int n) {
    
    if(n>=33)
        printf("Pass\n");
    else
        printf("Fail\n");

}
