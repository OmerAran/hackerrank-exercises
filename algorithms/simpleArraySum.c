#include <assert.h>
#include <ctype.h>
#include <limits.h>
#include <math.h>
#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    int a; 
    int topla = 0 ;
    scanf("%d ", &a);
    int arr[a];
    for (int i = 0; i<a; i++) {
        int num;
    scanf("%d ", &num);
    arr[i]= num ;
    } 
    
    for (int i = 0; i<a; i++) {
    topla= topla + arr[i] ;
    }
 
 
printf("%d ",topla ) ;

return 0;

}