public class graphicCard extends laptopDecorator{
   private String graphicsCardModel;

    public graphicCard(laptop laptop) {
        super(laptop);
        this.graphicsCardModel = selectGraphicsCard(laptop.getModelType());
    }

    private String selectGraphicsCard(String modelType) {
        switch (modelType) {
            case "Inspiron":
                return "NVIDIA GTX 1650";
            case "Latitude":
                return "NVIDIA Quadro T1000";
            default:
                return "Integrated Graphics";
        }
    }

    @Override
    public String getSpecs() {
        return decoratedlaptop.getSpecs() + " + " + graphicsCardModel + " Graphics Card";
    }
}