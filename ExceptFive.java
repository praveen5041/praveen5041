package javalab;
 class Bank{
    private int balance;
    public int balance(){
        return balance;
    }
    public void withdraw(int amount) throws NotSufficientFundException{
        if(amount>balance){
            throw new NotSufficientFundException( 
                String.format("Current balance %d is less than requested amount %d", balance, amount));
        }
        balance=balance-amount;
    }
    public void deposit(int amount){
        if(amount<=0){
            throw IllegalArgumentException(String.format("invalid deposit amount", amount))
        }
    }
    
}
 class NotSufficientFundException extends RuntimeException { 
    private String message; 
    public NotSufficientFundException(String message) {
         this.message = message; 
        } 
        public NotSufficientFundException(Throwable cause, String message) {
             super(cause); this.message = message; 
            } 
            public String getMessage() {
                 return message; 
                } 
            }

//Read more: https://www.java67.com/2014/11/how-to-create-user-defined-exception-java-example.html#ixzz7XWLdcsNL
public class ExceptFive {
    public static void main(String[] args) {
        Bank obj=new Bank();

    }
}
