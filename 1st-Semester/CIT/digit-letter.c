#include <stdio.h>
int main() {
    char X;
    scanf("%c", &X);

    if (X >= '0' && X <= '9') {
        printf("IS DIGIT");
    } 
    else if (X >= 'A' && X <= 'Z') 
    {
        printf("ALPHA\n");
        printf("IS CAPITAL");
    } 
    else if (X >= 'a' && X <= 'z') {
        printf("ALPHA\n");
        printf("IS SMALL");
    }
}
