class Account
{
    private long Accountnum;
    private String Name,Email;
    private int amount;

    //getter and setters for each data members
    public long getAccountnum()
    {
        return Accountnum;
    }

    public void setAccountnum(long Accountnum) {

        this.Accountnum = Accountnum;
    }

    public String getName() {

        return Name;
    }

    public void setName(String Name) {

        this.Name = Name;
    }
    public String getEmail()
    {

        return Email;
    }
    public void setEmail(String Email)
    {

        this.Email=Email;
    }
    public int getAmount()
    {

        return amount;
    }
    public void setAmount(int amount)
    {

        this.amount= amount;
    }
}
public class Encapdemo
{
    public static void main(String[] args)
    {
        Account details= new Account();
        details.setAccountnum(84563928463L);
        details.setName("Yamaha");
        details.setEmail("yamahabikes@yamaha.com");
        details.setAmount(25000);
        System.out.println("Account number: "+ details.getAccountnum());
        System.out.println("Holder Name: "+ details.getName());
        System.out.println("Holder Email: "+details.getEmail());
        System.out.println("Amount: "+ details.getAmount());

    }

}
