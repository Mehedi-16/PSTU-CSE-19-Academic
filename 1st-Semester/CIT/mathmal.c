#include <stdio.h>

int main() {
    int A, B;
    char S;
    scanf("%d %c %d", &A, &S, &B);

    int result;
    if (S == '>') 
    {
    printf("Right");


    
    } else if (S == '-') {
        result = A - B;
    } else if (S == '*') {
        result = A * B;
    }

    if (result == C) {
        printf("Yes\n");
    } else {
        printf("%d\n", result);
    }

    return 0;
}
