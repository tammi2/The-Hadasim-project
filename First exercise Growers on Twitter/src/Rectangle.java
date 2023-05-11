import java.util.Scanner;

public class Rectangle extends Tower{
    public Rectangle(int height, int width) {
        super(height, width);
    }
//היקיף
    void perimeter(){
        System.out.println((this.height*2)+(this.width*2));
    }
    //בודק אם ריבוע או מלבן
     void rectangleOrSquare(){
        if(NormalTowerHeight(this.height)) {
            if (this.height == this.width || this.height < this.width + 5)
                area();
            else
                perimeter();
        }
        else {
            System.out.println("גובה לא תקין");
        }
    }
    //שטח
    public void area() {
        System.out.println(this.height * this.width);
    }
     void print(){

     }
}