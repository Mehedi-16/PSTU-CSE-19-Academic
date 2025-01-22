#include <stdio.h>
#include <math.h>
int main()
 {

long long int A,B,C,D;
scanf("%lld%lld%lld%lld",&A,&B,&C,&D);
if((pow(A,B))>(pow(C,D)))
printf("YES");
else if((pow(A,B))==(pow(C,D)))
printf("NO");
else
printf("NO");
}