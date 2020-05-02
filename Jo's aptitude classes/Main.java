#include <stdio.h>
 
// to determine where to start gcd counting from
int greatest(int a, int b, int c){
    if(a>=b && a>=c){
        return a;
    }
 
    else if(b>=a && b>=c){
        return b;
    }
 
    else if(c>=a && c>=b){
        return c;
    }
}
 
main()
{
 
    int x,y,z,a;
    scanf("%d %d %d %d",&x,&y,&z,&a);
    int gcd;
    
    for(gcd=greatest(x,y,z); gcd>=1; gcd--){
        if(x%gcd==0 && y%gcd==0 && z%gcd==0){
            break;
        }
    }
  if(gcd==a)
    printf("Answer is correct.");
  else
    printf("Answer is wrong.");
    
    
}