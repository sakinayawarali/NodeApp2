public class RAM extends laptopDecorator {
    private int additionalRAM = 0; 

    public RAM(laptop laptop) {
        super(laptop);
    }

    public RAM with8GB() {
        this.additionalRAM += 8;
        return this;
    }

    public RAM with16GB() {
        this.additionalRAM += 16; 
        return this;
    }

    public RAM with32GB() {
        this.additionalRAM += 32;
        return this;
    }

    @Override
    public String getSpecs() {
        return decoratedlaptop.getSpecs() + " + " + additionalRAM + "GB RAM";
    }
}
