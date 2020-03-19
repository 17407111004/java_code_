package word13.shape;

public class Text {
    public static void main(String[] args) {
        drawShapes2();
    }

    public static void drawShapes2() {
        String[] shapes = {"cicre", "rect", "cicre", "rect", "flower"};
        for (String shape : shapes) {
            if (shape.equals("cicre")) {
                Circle cicre = new Circle();
                cicre.draw();
            } else if (shape.equals("rect")) {
                Rect rect = new Rect();
                rect.draw();
            } else if (shape.equals("flower")) {
                Flower flower = new Flower();
            }
        }
    }
    /*
    public static void drawShapes2(){
        Shape[] shapes={new Circle(),new Rect(),new Circle(),new Rect(),new Circle(),new Rect(),new Flower()};
        for(Shape shape:shapes){
            shape.draw();
        }
    }
   
     */
}


