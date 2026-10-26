#include<stdio.h>

void change(int *x){
    *x = 100;
}

int main(int argc, char const *argv[])
{
    int n = 10;
    change(&n);
    printf("\nn = %d", n); 
    return 0;
}
