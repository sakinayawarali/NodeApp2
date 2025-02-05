public class storage extends laptopDecorator {
    private String storageOption = ""; 

    public storage(laptop laptop) {
        super(laptop);
    }

    public storage with256GB() {
        this.storageOption += (this.storageOption.isEmpty() ? "" : ", ") + "256GB SSD"; 
        return this;
    }

    public storage with512GB() {
        this.storageOption += (this.storageOption.isEmpty() ? "" : ", ") + "512GB SSD"; 
        return this;
    }

    public storage with1TB() {
        this.storageOption += (this.storageOption.isEmpty() ? "" : ", ") + "1TB SSD"; 
        return this;
    }

    @Override
    public String getSpecs() {
        String specs = decoratedlaptop.getSpecs();
        return specs + (storageOption.isEmpty() ? "" : " + " + storageOption);
    }
}
