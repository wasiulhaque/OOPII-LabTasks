public class Rectangle {
    private double height;
    private double width;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    double calculateArea(){
        return height * width;
    }

    double calculatePerimeter(){
        return 2 * (height + width);
    }
}
