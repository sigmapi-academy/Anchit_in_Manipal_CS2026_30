#include<stdio.h>

int main(int argc, char const *argv[])
{
    /* code */
    int x = 10;

    int *p = &x;

    int *ip = NULL;
    if(ip != NULL){ // Check before dereferencing
        printf("\n content: %d", *ip);
    }
    else{
        printf("\n ip is NULL");
    }

    printf("\nValue of x: %d",x);
    printf("\nValue of p: %u",p);
    printf("\nAddress of x: %u",&x);
    printf("\nAddress of p: %u", &p);
    printf("\nValue at *p: %d", *p);
    *p = 100;
    printf("\nAfter modification using *p value of x: %d",x);
    return 0;
}
