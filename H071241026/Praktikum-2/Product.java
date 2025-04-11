public class Product {
    private String productId;
    private String name;
    private int stock;
    private double price;

    // Getter: mengambil data
    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public double getPrice() {
        return price;
    }

    // Setter: mengubah data
    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Menampilkan semua informasi produk
    public void displayProductInfo() {
        System.out.println("ID Produk     : " + productId);
        System.out.println("Nama Produk   : " + name);
        System.out.println("Stok          : " + stock);
        System.out.println("Harga         : Rp" + price);

        if (stock > 0) {
            System.out.println("Ketersediaan  : Tersedia");
        } else {
            System.out.println("Ketersediaan  : Habis");
        }
    }
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.setProductId("P001");
        p1.setName("Laptop");
        p1.setStock(5);
        p1.setPrice(799.99);

        Product p2 = new Product();
        p2.setProductId("P002");
        p2.setName("Mouse");
        p2.setStock(0);
        p2.setPrice(19.99);

        p1.displayProductInfo();
        System.out.println();
        p2.displayProductInfo();
    }
}