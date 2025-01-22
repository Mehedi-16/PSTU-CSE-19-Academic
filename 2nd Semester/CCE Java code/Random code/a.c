#include<stdio.h>
int main()
{
    int num[]={2,7,11,15};
    for(int i=0;i<4;i++)
    {
        if(num[i]+num[i+1]==9)
        {
            printf("[%d,%d]",i,i+1);
        }
    }
}