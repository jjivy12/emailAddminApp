import java.util.Scanner;

public class email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "Company.com";

//Constructor to recieve first name and last name 
    public email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

// call a method asking for the dept = return dept
        this.department = setDepartment();
//Call a method that will return randomn password
        this.password = randomPassword(defaultPasswordLength);
  
// Combine elements to generate email 
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
    }

// ask for department 

private String setDepartment(){
    System.out.println("New Wroker:"+ firstName + ".Department Code: \n1 Sales\n2 Devlopment\n3 for Accounting\n0 for none\nEnter Department Code Here:");
    Scanner in = new Scanner(System.in);
    int deptChoice = in.nextInt();
    if (deptChoice == 1){
        return "sales";
    }
    else if (deptChoice == 2){
        return "Dev";
    }
    else if (deptChoice == 3){
        return "Acct";
    }

    else{
        return "";
    }
}

// generate a random password
    private String randomPassword( int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$%";
        char[] password = new char [length];
        for (int i=0; i<length;i++){
            int rand = (int)(Math.random() * passwordSet.length());
            password [i] = passwordSet.charAt(rand);                
        }
        return new String (password);
    }

// Set the mailbox capacity
 public void setMailboxCapacity ( int capacity){
     this.mailboxCapacity = capacity;
 }
// set alternate email 
public void setAlternateEmail(String altEmail){
    this.alternateEmail = altEmail;
}
// change the password
public void changePassword(String password){
    this.password = password; 

    }

//Getters 

public int getMailboxCapacity () { 
    return mailboxCapacity; 
    }   
public String getAlternateEmail() {
    return alternateEmail;
    }
public String getPassword(){
    return password;
    }

public String showInfo(){
    return "Display Name:" + firstName + " " + lastName + 
            "\nCompany Email: " + email +
            "\nMailbox Capacity:" + mailboxCapacity + "mb";
}

}

