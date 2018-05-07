public class Test{

  public int makechange(int coins[],int money, int index){
   if(money==0)
    return 0;
  
  if(index>=coins.length)
    return 1;

    int amountwithcoin=0;
    int ways=0;

    while(amountwithcoin<=money){
      int remaining=money-amountwithcoin;
      amountwithcoin=amountwithcoin+coins[index];
      ways=ways+makechange(coins,remaining,index+1);
      
    }

    return ways;
  }
  public static void main(String args[]){
    Test t= new Test();
    int coins[]={1,2,3};
    int money=4;

    int ans=t.makechange(coins,money,0);
    System.out.println(ans);
  }
}