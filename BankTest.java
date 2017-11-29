public class BankTest{
  public static void main(String[] args){
    BankAcc Acc1=new BankAcc();
    BankAcc Acc2=new BankAcc();
    BankAcc Acc3=new BankAcc();
    BankAcc Acc4=new BankAcc();
    System.out.println(Acc1.depo(200, true));
    System.out.println(Acc1.getchek());
    System.out.println(Acc1.withd(150, true));
    System.out.println(Acc1.getchek());
    System.out.println(Acc1.checkTot());
    System.out.println(Acc1.numAccs);
  }
}
