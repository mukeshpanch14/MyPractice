/*
Minimum Path
*/

public class Test{
  
  public int min(int a, int b){
    if(a<b)
      return a;
    else
      return b;
  }
  public static void main(String args[]){
    int arr[][]={{1,2,3,3},
                 {4,8,2,5},
                 {1,5,3,1}};
    
    int r=arr.length;
    int c=arr[0].length;
    
    //System.out.println(r+" "+c);
    int init_val=arr[0][0];
    int i=0;
    int j=0;
    
    int curr_value;
    int curr_i;
    int curr_j;
    while(i<r-1 && j<c-1){
      
      if(arr[i][j+1]<arr[i+1][j]){
        curr_value=arr[i][j+1];
        curr_i=i;
        curr_j=j+1;
      }
      else{
        curr_value=arr[i+1][j];
        curr_i=i+1;
        curr_j=j;
      }
      
      if(arr[i+1][j+1]<curr_value){
        curr_value=arr[i+1][j+1];
        curr_i=i+1;
        curr_j=j+1;
      }
      else{
        curr_value=curr_value;
        curr_i=curr_i;
        curr_j=curr_j;
      }
      
      i=curr_i;
      j=curr_j;
      
      System.out.println(curr_value);
        
        
    }
    
    
  }
}