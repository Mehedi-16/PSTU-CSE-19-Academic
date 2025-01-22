#include<stdio.h>
int main()
{
long long int i=1,N,sum=0;
scanf("%lld",&N);
while (i<=N)
{
    sum=sum+i;
    i++;
}
printf("%lld",sum);

}