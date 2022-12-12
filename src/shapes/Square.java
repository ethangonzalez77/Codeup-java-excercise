package shapes;

// extends quadrilateral
public class Square extends Quadrilateral {

    public Square(double num) {
        super(num, num);
    }

    @Override
    public double getPerimeter() {
        return (2*this.length) + (2*this.width);
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public void setLength(double num) {
        this.length = num;
    }

    @Override
    public void setWidth(double num) {
        this.width = num;
    }
}