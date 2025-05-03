public class DesignPortfolio {
    private String theme;
    private int designCount;
    private double rating; // dari 1.0 sampai 10.0

    public DesignPortfolio() {
        this.theme = "Default Theme";
        this.designCount = 0; 
        this.rating = 5.0;
    }

    public DesignPortfolio(String theme, int designCount, double rating) {
        this.theme = theme; 
        this.designCount = designCount;
        this.rating = rating;
    }

    public void displayPortfolio() { 
        System.out.println("Theme: " + theme); 
        System.out.println("Designs: " + designCount);
        System.out.println("Rating: " + rating);
    }

    public double getRating() {
        return rating; 
    }
}
