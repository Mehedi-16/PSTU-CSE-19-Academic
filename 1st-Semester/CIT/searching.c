#include <stdio.h>
int main()
{
    int A[50], N, i, pos =-1, C;
    scanf("%d", &N);
    for (i = 0; i < N; i++)
    {
        scanf("%d", &A[i]);
    }
    scanf("%d", &C);
    for (i = 0; i < N; i++)
    {
        if (C == A[i])
        {
            pos = pos+i;
            break;
        }
    }

    if (pos == -1)
        printf("-1");
    else
        printf("%d", pos);
}