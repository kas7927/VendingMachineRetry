public class Main {
    public static void main(String[] args){
        VendingMachine vendingMachine = new VendingMachine(6, 6, 6);
        vendingMachine.addProduct(0,0,6);
        vendingMachine.addProduct(0,1,6);
        vendingMachine.addProduct(0,2,6);
        vendingMachine.addProduct(0,3,6);
        vendingMachine.addProduct(0,4,6);
        vendingMachine.addProduct(0,5,6);
        vendingMachine.addProduct(1,0,6);
        vendingMachine.addProduct(1,1,6);
        vendingMachine.addProduct(1,2,6);
        vendingMachine.addProduct(1,3,6);
        vendingMachine.addProduct(1,4,6);
        vendingMachine.addProduct(1,5,6);
        vendingMachine.addProduct(2,0,6);
        vendingMachine.addProduct(2,1,6);
        vendingMachine.addProduct(2,2,6);
        vendingMachine.addProduct(2,3,6);
        vendingMachine.addProduct(2,4,6);
        vendingMachine.addProduct(2,5,6);
        vendingMachine.addProduct(3,0,6);
        vendingMachine.addProduct(3,1,6);
        vendingMachine.addProduct(3,2,6);
        vendingMachine.addProduct(3,3,6);
        vendingMachine.addProduct(3,4,6);
        vendingMachine.addProduct(3,5,6);
        vendingMachine.addProduct(4,0,6);
        vendingMachine.addProduct(4,1,6);
        vendingMachine.addProduct(4,2,6);
        vendingMachine.addProduct(4,3,6);
        vendingMachine.addProduct(4,4,6);
        vendingMachine.addProduct(4,5,6);
        vendingMachine.addProduct(5,0,6);
        vendingMachine.addProduct(5,1,6);
        vendingMachine.addProduct(5,2,6);
        vendingMachine.addProduct(5,3,6);
        vendingMachine.addProduct(5,4,6);
        vendingMachine.addProduct(5,5,6);
        vendingMachine.addProduct(6,0,6);
        vendingMachine.addProduct(6,1,6);
        vendingMachine.addProduct(6,2,6);
        vendingMachine.addProduct(6,3,6);
        vendingMachine.addProduct(6,4,6);
        vendingMachine.addProduct(6,5,6);

        System.out.println("Welcome to the Vending Machine!");
        System.out.println("Available items: ");

        Product constants[] = Product.values(); //how to call me Enum here?
        double[] price = {2.00};

        System.out.println("\n Getting products from vending machine: ");
    }
}
