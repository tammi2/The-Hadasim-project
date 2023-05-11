import java.util.Scanner;
public class Program {
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);
boolean is=true;
        while (is) {
        System.out.println("תפריט:");
        System.out.println("1. בחירת מגדל מלבן");
        System.out.println("2. בחירת מגדל משולש");
        System.out.println("3. יציאה");
        System.out.println("אנא בחר את מספר האפשרות הרצויה: ");
        int choice = scanner.nextInt();

        if (choice==1) {
            System.out.println("הקש גובה");
            int height= scanner.nextInt();
            System.out.println("הקש רוחב");
            int width=scanner.nextInt();
             Tower t=new Rectangle(height,width) ;
             ((Rectangle) t).rectangleOrSquare();
        }
         else if (choice==2) {
            System.out.println("הקש גובה");
            int height= scanner.nextInt();
            System.out.println("הקש רוחב");
            int width=scanner.nextInt();
            Tower t=new Triangular(height,width) ;
            System.out.println("1.הדפסת היקף משולש");
            System.out.println("2. הדפסת המשולש");
            int choice2 = scanner.nextInt();
               if(choice2==1)
                   ((Triangular) t).perimeter();
               else
                   ((Triangular) t).print();
        }
         else if (choice==3) {
            is=false;
        }
         else  {
            System.out.println("אפשרות לא תקינה. אנא בחר מספר 1, 2 או 3.");
        }
    }
}
 }









