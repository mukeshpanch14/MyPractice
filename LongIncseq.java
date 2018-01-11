/* 
Longest Increasing Sequence
*/

import java.util.Scanner;
public class Test{
  public int lis_count(int arr[]){
    int n=arr.length;
    int count=1;
    int init=arr[0];
    for(int i=1;i<n;i++){
      if(init<arr[i])
        count++;
    }
    
   return count;
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    
    Test t=new Test();
    int ans=t.lis_count(arr);
    System.out.println(ans);
    
  }
}