import java.util.*;

public class Email{
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    int defaultPasswordLength = 8;
    private String department;
    private int mailBoxCapacity = 500;
    private String altEmail;
    private String companySuffix = "company.com";

    //constructor for first and last name

    public Email(String firstNames, String lastNames){
        this.firstName = firstNames;
        this.lastName = lastNames;
        // System.out.println("Email created " + this.firstName + " " + this.lastName);

        //call a method asking for department
        this.department = setDepartment();

        //method to generate a random password

        this.password = randomPassword(defaultPasswordLength);

        //combine element to create an email
        email = firstNames.toLowerCase()+ "." + lastNames.toLowerCase() +"@" + department + companySuffix;

    }

    //ask for departmet

    private String setDepartment(){
        System.out.println("Enter department code:\n1. for Sales\n2. for Development\n3. for Accounting\n0. for none\n");
        Scanner dpt = new Scanner(System.in);
        int dptChoice = dpt.nextInt();
        if(dptChoice == 1){
            return "sales";
        } else if(dptChoice == 2){
            return "development";
        } else if(dptChoice == 3){
            return "accounting";
        } else {
            return "None";
        }
    }

    //generate random password
    
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+";
        char[] passWord = new char[length];
        for(int i=0; i<length; i++){
            int random = (int) (Math.random()*passwordSet.length());
            passWord[i] = passwordSet.charAt(random);
        }
        return new String(passWord);
    }

    //set mailbox capacity

    public void setMailBoxCap(int capacity){
        this.mailBoxCapacity = capacity;
    }

    //set alternate email  
     
    public void setAltEmail(String altMail){
        this.altEmail = altMail;
    }

    //change password

    public void changePassword(String passWords){
        this.password = passWords;
    }

    public int getMailBoxCapicity(){
        return mailBoxCapacity;
    }

    public String getAltEmail(){
        return altEmail;
    }
    public String getPassword(){
        return password;
    }
    
    public String showInfo(){
        return " Name:" + firstName + " "+ lastName +"\n Email: "+ email + "\n Mailbox Capacity:"+ mailBoxCapacity; 
    }
}