package AbstractFactoryPattern.factory;

public class FactoryGenerator {

    public AbstractShapeFactory getFactory(boolean rounded) {
        if(rounded) {
            return new RoundedShapeFactory();
        }
        return new NormalShapeFactory();
    }

}
