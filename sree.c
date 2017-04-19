#include<stdio.h>
#include<conio.h>
void main()
{
 {
    char c
    int s, r;

    printf("Enter an alphabet: ");
    scanf("%c",&c);
  s = (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    r = (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
    if (s ||r)
        printf("%c is a vowel.", c);
    else
        printf("%c is a consonant.", c);
    return 0;
}
