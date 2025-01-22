#include <stdio.h>
#include <math.h>

int main() {
    int X;
    float P;
    scanf("%d %f", &X, &P);

    float Discount = P / (1 - (X/100.0));
    float Price = ceilf(Discount * 100) / 100;

    printf("%.2f\n", Price);

    return 0;
}
