#include<stdio.h>
int main()
{
char c;
scanf("%c",&c);
if(c=='z')
printf("a");
else
{
c=c+1;
printf("%c",c);
}
return 0;
}