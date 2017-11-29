import java.util.Random;
public class BankAcc{
  public String accNum;
  public double chekBal;
  public double savBal;
  public static int numAccs =0;
  public static long Total=0;
  private String r;
  private String genAccNum(){
    for(int i =0; i <11; i++){
      r+=Math.floor(Math.random()*10+1);
    }
    return r;
  }
  public BankAcc(){
    accNum=genAccNum();
    chekBal=0;
    savBal=0;
    numAccs++;
  }
  public double getchek(){
    return chekBal;
  }
  public double getsav(){
    return savBal;
  }
  public  double depo(double dep, boolean C){
    Total+=dep;
    if(C){
      savBal+=dep;
      return savBal;
    }
    else{
      chekBal+=dep;
      return chekBal;
    }
  }
  public double withd(double draw, boolean S){
    Total-=draw;
    if(S && savBal>draw){
      savBal-=draw;
      return savBal;
    }
    else if(!S && chekBal>draw){
      chekBal-=draw;
      return chekBal;
    }
    else{
      System.out.println("error-not enough funds");
      return -1;
    }
  }
  public double checkTot(){
    return savBal+chekBal;
  }
}
