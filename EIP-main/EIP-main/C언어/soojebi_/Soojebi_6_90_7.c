#include<stdio.h>
#include<string.h>
int main(int argc, char *argv[]){
    char str1[10]="KOREA";
    char str2[8]="LOVE";
    char* p1 = NULL;
    char* p2 = NULL;
    p1 = str1;
    p2 = str2;
    str1[1]= p2[2];
    str2[3] = p1[4];
    strcat(str1,str2);

    printf("%c\n", *(p2-1)); // strcat에 문자사이에 null값이 포함
    printf("%c\n", *(p2-2)); // A
    printf("%c\n", *(p2-3));
    printf("%c\n", *(p2-4));
    printf("%c\n", *(p1+4));
    printf("%c\n", *(p1+5));
    printf("%c\n", *(p1+6));
    printf("%c\n", *(p1+7));
    printf("%c\n", *(p1+8));
     printf("%c\n", *(p2));
     printf("%c\n", *(p2-2));
  
  

  
    return 0;
}