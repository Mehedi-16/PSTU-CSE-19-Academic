#include <stdio.h>
#include <math.h>
int main()
 {
    float A, B ,f,c,r;
    scanf("%f %f", &A, &B);

    f = floor(A / B);
    c= ceil(A / B);
    r = round(A / B);

    printf("floor %.0f / %.0f = %.0f\n", A, B, f);
    printf("ceil %.0f / %.0f = %.0f\n", A, B, c);
    printf("round %.0f / %.0f = %.0f\n", A, B, r);
}
