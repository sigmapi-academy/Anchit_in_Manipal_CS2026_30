#include<stdio.h>

void display(int *p, int size){
    int i;
    for(i = 0; i < size - 1; p++, i++); //pointer increment
    for(;i >= 0; i--, p--){ //pointer decrement
        printf("\n%d", *p);
    }
}
int main(int argc, char const *argv[])
{
    int size = 5;
    int arr[] = {10, 20, 30, 40, 50};

    display(arr, size);
    
    return 0;
}
