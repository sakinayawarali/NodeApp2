public class latitudeLaptop implements laptop{
    private String modelType = "Latitude";

    @Override
    public String getSpecs() {
        return "Latitude Laptop - 32GB RAM, 1TB SSD, 14\" Display, 60Hz";
    }

    @Override
    public String getModelType() {
        return modelType;
    }

      
}