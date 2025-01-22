#include <stdio.h>
int main() {
  int n;
  scanf("%d", &n);
 long long int arr[n];
  for (int i = 0; i < n; ++i)
   {
    scanf("%lld", &arr[i]);
  }
  for (int i = 1; i < n; ++i) {
    if (arr[0] < arr[i]) {
      arr[0] = arr[i];
    }
  }

  printf("%lld", arr[0]);
}
