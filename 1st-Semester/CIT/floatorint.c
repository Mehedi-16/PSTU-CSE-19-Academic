#include <stdio.h>

int main() {
    float N;
    scanf("%f", &N);

    int intPart = (int)N; 
    if (N == intPart) {
        printf("int %d\n", intPart);
    } else {
        printf("float %d %.2f\n", intPart, N - intPart);
    }
}
