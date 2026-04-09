// Throwable--> Exception --> RuntimeTimeError
// try catch throw throws and finally
class InsufficentBalanceException extends RuntimeException{
    InsufficentBalanceException(String message){
        super(message);
    }

}
class SavingAccount{
    private int accountNumber; //aNumber;
    private int balance;//b
    public int withdraw(int balance)throws InsufficentBalanceException{
        log.debug("")
        if(this.balance<1000){
            throw new InsufficentBalanceException("Money is less than 1000");
        }
        return this.balance;
    }
    SavingAccount(int accountNumber, int balance){
        this.accountNumber=accountNumber;
        this.balance= balance;
    }
}
class ExceptionMain{
    public static void main(String args[]){
        //try{
            SavingAccount rahulAccount= new SavingAccount(1,2000);
            System.out.println(rahulAccount.withdraw(500));
            SavingAccount prashantAccount= new SavingAccount(2, 500);
            System.out.println(prashantAccount.withdraw(200));
        // }catch(Exception exception){
        //     exception.printStackTrace();
        // }
       
    }
}