#include<stdio.h>

int main(int argc, char const *argv[])
{
    int size = 5;
    int arr[] = {10, 20, 30, 40, 50};

    int *p = arr;

    int i;
    // printf("\nAddress of each element of arr[]: \n");
    // printf("\nContent of each element of arr[]: \n");
    // for(i = 0; i < size; i++){
    //     printf("arr[%d]: %d\n", i, *(arr+i));
    // }
    printf("\nFirst element: %d", *p);
    printf("\nSecond element: %d", *(p + 1));
    printf("\nThird element: %d", *(p + 2));
    // arr++; constant pointer
    p++; //pointing to the second element
    printf("\nAfter p++ = %d\n", *p);
    return 0;
}
