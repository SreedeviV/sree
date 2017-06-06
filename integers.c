#include<stdio.h>
#include<conio.h>
void main()
{
   int n,temp,count=0;
   printf("enter the numbers ");
   scanf("%d",&n);
   while(temp!=0)
   {
     temp=temp/10;
     ++count;
   }
   printf("%d",count);
   getch();
}
