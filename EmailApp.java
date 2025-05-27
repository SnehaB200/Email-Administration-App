public class EmailApp{
    public static void main(String args[]){
        Email email1 = new Email("Snehang", "Behera");
        Email email2 = new Email("Subhasmita", "Panda");
        System.out.println(email1.showInfo());
        System.out.println(email2.showInfo());
    }
}