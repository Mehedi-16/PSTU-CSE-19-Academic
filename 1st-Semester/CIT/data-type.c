#include<stdio.h>
int main()
{
int n,k,a,result;
scanf("%d%d%d",&n,&k,&a);
result=(n*k)/a;
if(result>=-2147483648 && result<=2147483647)
printf("int");
else
printf("long long");
}