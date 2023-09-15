public class VendingMachine {
    private String[][][] products;

    public VendingMachine(int rows, int columns, int depth) {
        products = new String[rows][columns][depth];

    }
    public void addProduct(int row, int column, int depth) {
        if (row >= 0 && row < products.length && column >= 0 && column < products[0].length && depth >= 0) {
        } else {
            System.out.println("Invalid location for adding a product.");
        }

    }

    public String getProduct(int row, int column, int depth) {
        if (row >= 0 && row < products.length && column >= 0 && column < products[0].length){
            String product = products[row][column][depth];
            if (product != null) {
                products[row][column][depth] = null;
                return product;
            } else {
                return "Empty slot";
            }
        } else {
            return "Invalid location";
        }

    }

    public void display() {

    }

}

