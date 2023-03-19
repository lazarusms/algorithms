package sort;
public class Sorting {
    public static void main(String[] args) {
        Product products[] = {
                new Product("Car1", 30000),
                new Product("Car2", 4000),
                new Product("Car3", 60000),
                new Product("Car4", 80000),
                new Product("Car5", 10000),

        };

        selectionSort (products, products.length);
        insertSort(products, products.length);
        print(products);

    }
    private static void print(Product[] products){
        for (Product product : products) {
            System.out.println(product.getName() + " custa " + product.getPrice());
        }
    }

    // The method swap is responsible for swapping the positions of the array.
    private static  void swap(Product[] products, int i, int s){
        Product currentProduct = products[i];
        Product previousProduct = products[s];
        products[i] = previousProduct;
        products[s] = currentProduct;
    }
    // Creating a InsertionSort method
    private static void insertSort(Product[] products, int l) {
        for(int i = 1; i < l; i++){
            while(products[i].getPrice() < products[i - 1].getPrice()){
                swap(products, i, i - 1);
            }
        }
    }

    // Creating a SelectionSort method

    private static void selectionSort(Product[] products, int l) {
        for(int i = 0; i < l - 1; i++){
            int s =  cheapest(products, i, l - 1);
            swap(products, i, s);
        }
    }
    private static int cheapest(Product products[], int s, int e) {
        int c = s;
        for (int i = s; i <= e; i++) {
            if (products[i].getPrice() < products[c].getPrice()) {
                c = i;
            }
        }
        return c;
    }}

