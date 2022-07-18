public class Account {

    private int accountNo;
    private int amount;
    private int nationalId;

    public Account(){}
    public void deposit(int amount){
        this.amount += amount;
    }

        //TODO: Define the NotEnoughMoneyException
    public void withdraw(int amount){
        //TODO: Use the notEnoghMoneyException
        this.amount -= amount;
    }
        //TODO: Define InvalidNationalIdException
    public void linkToNationalId(int nationalId){

        this.nationalId = nationalId;
    }



}
