package ejercicios2;

class Rectangle
{
    int length, width;
    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    int getLength () {
        int getLength;
        return getLength = length;
    }

    int getWidth () {
        int getWidth;
        return getWidth = width;
    }

    void setLength (int setLength) {
        this.length = setLength;
    }

    void setWidth (int setWidth) {
        this.width = setWidth;
    }

    int getArea () {
        int getArea;
        return getArea = length *width;
    }

    int getPerimeter() {
        int getPerimeter;
        return getPerimeter = 2*(length+width);
    }
}

public class Ejercicios2 {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 20);
        Rectangle r2 = new Rectangle(100, 200);
        
        System.out.print("get: ");
        if(r1.getLength() == 10 && r1.getWidth() == 20
                && r2.getLength() == 100 && r2.getWidth() == 200)
        {
            System.out.println("pass");
        }else
        {
            System.out.println("fail");            
        }
        
        System.out.print("set: ");
        r1.setLength(2);
        r1.setWidth(3);
        r2.setLength(20);
        r2.setWidth(30);
        if(r1.getLength() == 2 && r1.getWidth() == 3
                && r2.getLength() == 20 && r2.getWidth() == 30)
        {
            System.out.println("pass");
        }else
        {
            System.out.println("fail");            
        }
        
        System.out.print("area: ");
        if(r1.getArea() == 6 && r2.getArea() == 600)
        {
            System.out.println("pass");
        }else
        {
            System.out.println("fail");            
        }
        
        System.out.print("perimeter: ");
        if(r1.getPerimeter() == 10 && r2.getPerimeter() == 100)
        {
            System.out.println("pass");
        }else
        {
            System.out.println("fail");            
        }
    }
    
}
