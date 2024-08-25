#include<stdio.h>
int main()
{
    char wish[] = "I want to solve this question";
    char *p;
    p = wish;
    p += 2;
    printf("%s", p);
    return 0;
}
