public class inspironLaptop implements laptop {
    private String modelType = "Inspiron";

    @Override
    public String getSpecs() {
        return "Inspiron Laptop - 16GB RAM, 512GB SSD, 15.6\" Display, 60Hz";
    }

    @Override
    public String getModelType() {
        return modelType;
    }

}