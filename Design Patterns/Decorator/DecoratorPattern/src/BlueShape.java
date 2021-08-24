public class BlueShape extends ShapesDecorator{

    BlueShape(Shapes shape){
        super(shape);
    }

    @Override
    public void drawShape(){
        shape.drawShape();
        fillShape();
        fillOutline();
    }

    public void fillShape(){
        System.out.println("Filling with blue!");
    }

    public void fillOutline(){
        System.out.println("Outlining in blue!");
    }
}
