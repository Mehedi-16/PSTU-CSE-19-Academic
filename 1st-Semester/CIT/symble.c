#include <stdio.h>
int main() {
    char S;
    int N, i, j;
    scanf("%c", &S);
    scanf("%d", &N);
    int numbers[N];
    for (i = 0; i < N; i++) 
    {
        scanf("%d", &numbers[i]);
    }
    for (i = 0; i < N; i++) 
    {
        for (j = 0; j < numbers[i]; j++) 
        {
            printf("%c", S);
        }
        printf("\n");
    }
}
