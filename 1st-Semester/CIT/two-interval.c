#include <stdio.h>
int main() {
    int l1, r1, l2, r2;
    scanf("%d %d", &l1, &r1);
    scanf("%d %d", &l2, &r2);
int start = (l1 > l2) ? l1 : l2;
    int end = (r1 < r2) ? r1 : r2;

    if (start <= end) {
        printf("%d%d\n", start, end);
    } else {
        printf("-1\n");
    }
    return 0;
}
