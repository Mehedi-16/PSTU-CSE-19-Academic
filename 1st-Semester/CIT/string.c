#include <stdio.h>
#include <string.h>

int main() {
    char S[1001], T[1001];
    scanf("%s",S);
    scanf("%s",T);
    int lenS = strlen(S);
    int lenT = strlen(T);
    printf("%d %d\n", lenS, lenT);
    printf("%s %s\n", S, T);
}
