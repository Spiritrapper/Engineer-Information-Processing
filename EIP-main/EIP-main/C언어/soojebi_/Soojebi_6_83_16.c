#include<stdio.h>
void main() {
    int a[4] ={0, 2, 4, 8};
    int b[3];
    int* pl;
    int i , j;
    int sum = 0;
    for(i = 1; i < 4; i++) {
        pl = a + i; // pl즉 주소값이 *pl값과 같아지게 하는 식으로 되어있음
        b[i-1]=*pl - a[i-1];
        sum = sum + a[i] +b[i-1];
    }
    printf("%d", sum);
    
}