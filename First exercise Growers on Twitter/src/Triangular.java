import java.util.Scanner;
public class Triangular extends Tower{

    public Triangular(int height, int width) {
        super(height, width);
    }

    //חישוב היקף משולש
     void perimeter(){
         System.out.println((double) this.width+(ribTriangular()*2));
     }
    //חישוב אורך צלע המשולש
    public double ribTriangular(){

        int rib=(this.height*this.height)+(((this.width/2)+(this.width%2))*((this.width/2)+(this.width%2)));
        double root = Math.sqrt(rib);
     return root;

    }
    //הדפסת המשולש
    void print(){
        if (this.width % 2 == 0 || this.width > this.height * 2) {
            System.out.println("לא ניתן להדפיס את המשולש.");
        }
        else{
            printTriangle(this.width,this.height);

        }
    }
    public static void printTriangle(int width, int height) {
        int num=0;
        for (int i =width-2; i>1; i-=2) {
            num++;
        }
        //כמה פעמים להוסיף לשורה האחרונה
        int howManyTimesToAddToTheLastLine=(height-2)%num;
        //כמה פעמים ללעשות כל שורה
        int howManyTimesEachLine=(height-2)/num;
        //כמה כוכבים בכל שורה
        int howManyStars=3;
        //כמה רווח
        int howMuchProfit=width/2;
        printProfit(howMuchProfit);
        howMuchProfit-=1;
        System.out.println("*");

        printStars(howManyTimesEachLine+howManyTimesToAddToTheLastLine,howManyStars,howMuchProfit);
        howMuchProfit-=1;
        for (int i = 0; i <num-1; i++) {
            howManyStars+=2;

            printStars(howManyTimesEachLine,howManyStars,howMuchProfit);
            howMuchProfit-=1;
        }
        printStars(1,width,howMuchProfit);
    }
    //פונקציה שמדפיסה שורות של כוכבים
    public static void printStars(int howManyLines,int howManyStars,int howMuchProfit){

        for (int i = 0; i <howManyLines; i++) {
            printProfit(howMuchProfit);
            for (int j = 0; j < howManyStars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //פונקציה שמדפיסה רווח

    public static void printProfit(int howMuchProfit) {
        for (int l = 0; l <= howMuchProfit; l++) {
            System.out.print(" ");
        }
    }

    }
