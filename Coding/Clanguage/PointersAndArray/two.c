#include<stdio.h>
int main(int argc, char const *argv[])
{
    int x = 100;
    int *p = &x;
    printf("Value of x = %d\n", x);
    printf("Address of x = %p\n",&x);
    printf("Value of p = %p\n",p);
    printf("Value pointed by p = %d\n", *p);
    return 0;
}
