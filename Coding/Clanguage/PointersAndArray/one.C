#include<stdio.h>

int main(int argc, char const *argv[])
{
    int a[5] = {10, 20, 30, 40, 50};

    int *p = a; // equivalent to int *p = &a[0];
    printf("a[]\t*p\n");
    printf("%d\t", a[0]);
    printf("%d\n", *p);
    
    printf("%d\t", a[1]);
    printf("%d\n", *(p + 1));

    printf("%d\t", a[2]);
    printf("%d\n", *(p+2));

    printf("%d\t", a[3]);
    printf("%d\n", *(p+3));
    
    printf("%d\t", a[4]);
    printf("%d\n", *(p+4));
    
    return 0;
}
