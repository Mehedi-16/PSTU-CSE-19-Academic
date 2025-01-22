#include <stdio.h>

int main() {
    int t,i,w[5],h[5];

    scanf("%d", &t); 
for(i=0;i<t;i++)
{
scanf("%d%d",&w[i],&h[i]);
}
for(i=0;i<t;i++)
{
        if (w[i] ==h[i]) 
        {
            printf("Square\n");

        } else {
            printf("Rectangle\n");
        }
    }
}

