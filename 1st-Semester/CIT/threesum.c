#include <stdio.h>
int main() {
    int N, i;
    unsigned long long fact = 1;
    scanf("%d", &N);

    if (N < 0)
        printf("Error! Factorial of a negative number doesn't exist.");
    else {
        for (i = 1; i<=N; ++i) {
            fact *= i;
        }
        printf("%llu",fact);
    }
}
