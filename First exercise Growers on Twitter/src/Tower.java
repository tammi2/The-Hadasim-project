abstract class Tower {
    int height;
    int width;

    public Tower(int height, int width) {
        this.height = height;
        this.width = width;
        NormalTowerHeight(this.height);

    }

    //חישוב היקיף נדרס במחלקות היורשות
abstract void perimeter();
//בודק אם גובה המגדל תקין

public boolean NormalTowerHeight(int height) {
    if (height >= 2)

        return true;
    return false;
}

    abstract void print();
}
