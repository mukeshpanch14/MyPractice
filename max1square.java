public class Test{
  
  public int min(int a, int b){
   if(a<b)
     return a;
    else
      return b;
  }
  
  public int maxsizesq(int arr[][]){
    int r=arr.length;
    int c=arr[0].length;
    
    int s[][]=new int[r][c];
    for(int i=0;i<r;i++){
      s[i][0]=arr[i][0];
    }
    
    for(int i=0;i<c;i++){
      s[0][i]=arr[0][i];
    }
    
    for(int i=1;i<r;i++){
      for(int j=1;j<c;j++){
        if(arr[i][j]==1){
          s[i][j]=min(s[i][j-1],min(s[i-1][j],s[i-1][j-1]))+1;
                 
        }
        else
          s[i][j]=0;          
      }
    }
    
    int max=s[0][0];
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        if(max<s[i][j])
          max=s[i][j];
      }
    }
    
    return max;
  }
  public static void main(String args[]){
    int arr[][]={{0,1,1,0,1},
                {1,1,0,1,0},
                {0,1,1,1,0},
                {1,1,1,1,0},
                {1,1,1,1,1},
                {0,0,0,0,0}};
    
    Test t=new Test();
    int ans=t.maxsizesq(arr);
    
    System.out.println(ans);
  }
}