#include<stdio.h>
#include<stdlib.h>
int main()
{
int A[100000],N,i,sum;
scanf("%d",&N);
for(i=0;i<N;i++)
{
scanf("%d",&A[i]);
sum=sum+(A[i]);
}
printf("%d",abs(sum));
}