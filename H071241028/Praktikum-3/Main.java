public class Main {
    public static void main(String[] args) {
        DesignPortfolio port1 = new DesignPortfolio("Futuristic", 10, 8.7);
        DesignPortfolio port2 = new DesignPortfolio("Retro 80s", 8, 7.9);

        FashionDesigner des1 = new FashionDesigner("Zahra", "Minimalist", port1);
        FashionDesigner des2 = new FashionDesigner("Vina", "Vintage", port2);

        des1.showDesigns();
        System.out.println(); 

        des2.showDesigns();
        System.out.println();

        des1.fashionShow(des2);
    }
}
