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
        Account A1= new Account();
        A1.setAccountnum(84563928463L);
        A1.setName("Yamaha");
        A1.setEmail("yamahabikes@yamaha.com");
        A1.setAmount(25000);
        System.out.println("Account number: "+ A1.getAccountnum());
        System.out.println("Holder Name: "+ A1.getName());
        System.out.println("Holder Email: "+A1.getEmail());
        System.out.println("Amount: "+ A1.getAmount());

    }

}
