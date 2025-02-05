public class client {
public static void main(String[] args) {
        laptop laptop = new inspironLaptop();

        RAM ramAddOn = new RAM(laptop);
        ramAddOn.with8GB().with16GB(); 
        laptop = ramAddOn;

        storage storageAddOn = new storage(laptop);
        storageAddOn.with256GB().with512GB(); 
        laptop = storageAddOn; 

        graphicCard graphicsCardAddOn = new graphicCard(laptop); 
        laptop = graphicsCardAddOn; 

        System.out.println("Laptop Specifications:");
        System.out.println(laptop.getSpecs());
        System.out.println("Model Type: " + laptop.getModelType());
}
}