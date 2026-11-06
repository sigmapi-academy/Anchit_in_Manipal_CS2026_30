#include<stdio.h>

#define SIZE 5

int main(int argc, char const *argv[])
{
    int a[SIZE] = {10, 20, 30, 40, 50};

    int *p = a; // equivalent to int *p = &a[0];
    printf("a[]\t*p\n");
    int i;
    for(i = 0; i < SIZE; i++,p++){
        printf("%d\t%d\n", a[i], *(p));
    }
    return 0;
}
