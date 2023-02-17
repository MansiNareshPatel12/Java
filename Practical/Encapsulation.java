class BankAccount { 

private long accountno; 
private String name,email; 
private long amount;
 
//getter setter methods 
public long getAccountno() { 
    return accountno; 
} 
public void setAccountno(long accountno) { 
    this.accountno = accountno; 
} 
public String getName() { 
    return name; 
} 
public void setName(String name) { 
    this.name = name; 
} 
public String getEmail() { 
    return email; 
} 
public void setEmail(String email) { 
    this.email = email; 
} 
public long getAmount() { 
    return amount; 
} 
public void setAmount(long amount) { 
    this.amount = amount; 
} 
   
} 
public class Encapsulation{ 
public static void main(String[] args) { 
     
    Account acc=new Account(); 
    
    acc.setAccountno(6254382); 
    acc.setName("Mansi Patel"); 
    acc.setEmail("mansi@gmail.com"); 
    acc.setAmount(500000);
    System.out.println(acc.getAccountno()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount()); 
} 
}