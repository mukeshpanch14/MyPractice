import java.util.Scanner;

public class Test{
  
  public int min(int a, int b, int c){
      if(a<=b && a<=c)
        return a;
     
    if(b<=a && b<=c)
        return b;
     
    if(c<=a && c<=b)
        return c;
    else
      return 0;
  }
  
 public int uglyNum(int n){
   
   int MAX=100;
   int arr_ugly[]=new int[MAX];
   
   if(arr_ugly[n]==0){
   
     arr_ugly[0]=1;
   
   int i2=0;
   int i3=0;
   int i5=0;
   
   int next_mul_2=2;
   int next_mul_3=3;
   int next_mul_5=5;
   
   for(int i=1;i<MAX;i++){
     int next_ugly=min(next_mul_2,next_mul_3,next_mul_5);
     arr_ugly[i]=next_ugly;
     
     if(arr_ugly[i]==next_mul_2){
       i2++;
       next_mul_2=arr_ugly[i2]*2;
     }
     
     if(arr_ugly[i]==next_mul_3){
       i3++;
       next_mul_3=arr_ugly[i3]*3;
     }
     
     if(arr_ugly[i]==next_mul_5){
       i5++;
       next_mul_5=arr_ugly[i5]*5;
     }
   }
   }
   return arr_ugly[n];
 }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    
    int n=sc.nextInt();
    
    Test t=new Test();
    int uglynum=t.uglyNum(n);
    
    System.out.println("Ugly Number:" +uglynum);
    
    
  }
}