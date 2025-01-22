#include<stdio.h>
#include<stdlib.h>
int main()
{
int A[50],N,i,sum;
scanf("%d",&N);
for(i=0;i<N;i++)
{
scanf("%d",&A[i]);
}
for(i=0;i<N;i++)
{
sum=sum+(A[i]);
}
printf("%d",abs(sum));
}