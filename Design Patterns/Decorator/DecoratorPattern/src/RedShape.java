public class RedShape extends ShapesDecorator{
    
    RedShape(Shapes shape){
        super(shape);
    }

    @Override
    public void drawShape(){
        shape.drawShape();
        fillShape();
        fillOutline();
    }

    public void fillShape(){
        System.out.println("Filling with Red!");
    }

    public void fillOutline(){
        System.out.println("Outlining in Red!");
    }
}
