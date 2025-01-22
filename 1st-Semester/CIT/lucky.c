#include<stdio.h>
int main()
{
int N,P,Q;
scanf("%d",&N);
P=N/10;
Q=N%10;
if(Q%P==0 || P%Q==0)
printf("YES");
else
printf("NO");
}