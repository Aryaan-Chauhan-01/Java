import java.io.*;
import java.util.*;  
class atm {
    static void Withdrawal(int withdrawamount,int  balanceamount, int dailylimit)
    {
        if(withdrawamount> balanceamount)
        {
            throw new ArithmeticException("Low Balance");
        }
        if(withdrawamount>dailylimit)
        {
            throw new ArithmeticException("Limit Exceed");
        }
        else
        {
            System.out.println("Amount withdrawn");
        }
    }
    static void Deposit(int deposit)
    {
        if(deposit<=0)
        {
            throw new ArithmeticException("Not a Valid Amount");
        }
        else
        {
            System.out.println("Amount deposited:");
        }
    }
    
  public static void main(String[] args) 
  {
    int dailylimit=10000;
    Withdrawal(5000,3000,dailylimit);
  }
}
