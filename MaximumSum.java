import java.util.Scanner;

public class Test{
  
  public int Maximumsum(int arr[]){
    int n=arr.length;
    int curr_max=arr[0];
    int max_so_far=arr[0];
    
    for(int i=0;i<n;i++){
      curr_max=max(curr_max+arr[i],arr[i]);
      max_so_far=max(max_so_far,curr_max);
    }
    
    return max_so_far;
  }
  
  public int max(int a,int b){
    if(a>b)
      return a;
    else
      return b;
  }
  
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    
    Test t=new Test();
    int sum_sofar=t.Maximumsum(arr);
    
    
    System.out.println("Maximum SubArray: "+sum_sofar);
  
  }
}