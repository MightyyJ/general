public abstract class ShapesDecorator implements Shapes{
    
    Shapes shape;

    ShapesDecorator(Shapes shape){
        this.shape = shape;
    }

    public void drawShape(){
        shape.drawShape();
    }
}
