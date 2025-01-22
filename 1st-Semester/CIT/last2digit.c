#include<stdio.h>
int main()
{
long long int A,B,C,D,mul;
scanf("%lld%lld%lld%lld",&A,&B,&C,&D);
mul=A*B*C*D;
printf("%lld",mul%100);

}