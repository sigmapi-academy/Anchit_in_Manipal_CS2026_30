#include<stdio.h>

int main(int argc, char const *argv[])
{
    int size = 5;
    int arr[] = {10, 20, 30, 40, 50};

    int i, *p = arr;
    for(i = 0; i < size - 1; p++, i++); //pointer increment
    for(;i >= 0; i--, p--){ //pointer decrement
        printf("\n%d", *p);
    }
    return 0;
}
