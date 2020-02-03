import org.w3c.dom.css.Rect;

public class Square {
    private Rectangle r = new Rectangle();

    public double getLength() {
        return r.getHeight();
    }
    public void setLength(double length) {
        r.setHeight(length);
        r.setWidth(length);
    }
    double calculateArea(){
        return r.calculateArea();
    }
    double calculatePerimeter(){
        return r.calculatePerimeter();
    }

}
