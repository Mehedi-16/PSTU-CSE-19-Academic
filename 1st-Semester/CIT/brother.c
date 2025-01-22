#include <stdio.h>
#include <string.h>

int main() 
{
    char F1[100], S1[100], F2[100], S2[100];
    scanf("%s %s", F1, S1);
    scanf("%s %s", F2, S2);

    if (strcmp(S1, S2) == 0) {
        printf("ARE Brothers\n");
    } else {
        printf("NOT\n");
    }

    return 0;
}
