public abstract class laptopDecorator implements laptop{
    protected laptop decoratedlaptop;

    public laptopDecorator(laptop decoratedlaptop) {
        this.decoratedlaptop = decoratedlaptop;
    }

    @Override
    public String getSpecs() {
        return decoratedlaptop.getSpecs();
    }

    @Override
    public String getModelType() {
        return decoratedlaptop.getModelType(); 
    }

}