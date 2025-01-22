#include<stdio.h>
int main()
{
    long long int N,year,months,days;
    scanf("%lld",&N);
    year=N/365;
    months=(N%365)/30;
    N=N-((year*365)+(months*30));
    printf("%lld years\n",year);
    printf("%lld months\n",months);
    printf("%lld days\n",N);
}