#include<stdio.h>
int main()
{
int X,P;
scanf("%d",&X);
P=X/1000;
if(P%2==0)
printf("EVEN");
else
printf("ODD");
}