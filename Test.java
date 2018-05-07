//Longest Increasing Sequence in an ArrayList
// Using Normal logic(Non DP)

import java.util.*;
class Test{
  void PrintArray(int arr[]){
    int len=arr.length;
    for(int i=0;i<len;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
  
  void PrintArrayList(ArrayList<Integer> list){
    Iterator<Integer> itr=list.iterator();
    while(itr.hasNext()){
      System.out.print((int)itr.next()+" ");
    }
    System.out.println();
  }
  
  ArrayList<Integer> LongIncSequence(int in_arr[]){
    int len=in_arr.length;
    int max_len=1;
    ArrayList<Integer>max_list=new ArrayList<Integer>();
    ArrayList<Integer>list=new ArrayList<Integer>();
    for(int i=0;i<len;i++){
      
      int lis=1;
     
      list.add(in_arr[i]);
      for(int j=i+1;j<len;j++){
        if(in_arr[i]<in_arr[j]){
          list.add(in_arr[j]);
          lis++;
        }
          
      }
      //System.out.println(list);
      
      if(max_len<lis){
        max_len=lis;
        max_list=new ArrayList<Integer>(list);
      }
       list.clear();
    }
    
    
    return max_list;
  }
  public static void main(String args[]){
    int in_arr[]={50, 3, 10, 7, 40, 80};
    Test t=new Test();
    t.PrintArray(in_arr);
    
    ArrayList<Integer> ar=t.LongIncSequence(in_arr);
//    t.PrintArrayList(ar);
    System.out.println(ar);
    
  }
}