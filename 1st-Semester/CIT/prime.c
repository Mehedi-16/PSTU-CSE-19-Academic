#include<stdio.h>
int main()
{
int i,j,n,count=0;
scanf("%d",&n);
    for(i=2;i<n;i++)
{
    if(n%i==0)
    {
       count++;
        break;
    }
}
if(count==0)
    printf("YES");
    else
    printf("NO");
}
