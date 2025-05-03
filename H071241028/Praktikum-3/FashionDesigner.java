public class FashionDesigner { 
    private String name;
    private String style; // contoh: "Chic", "Boho", "Minimalist"
    private DesignPortfolio portfolio; 

    public FashionDesigner() {
        this.name = "Anonymous";
        this.style = "Unknown";
        this.portfolio = new DesignPortfolio(); //objeck default portofolio dibuat secara otomatis
    }

    public FashionDesigner(String name, String style, DesignPortfolio portfolio) {
        this.name = name; 
        this.style = style;
        this.portfolio = portfolio;
    }

    public void showDesigns() { 
        System.out.println("Designer: " + name + " (" + style + ")");
        portfolio.displayPortfolio(); 
    }

    public void fashionShow(FashionDesigner rival) { 
        System.out.println("Fashion Show Battle!");
        System.out.println(this.name + " VS " + rival.name);

        double myScore = this.portfolio.getRating();
        double rivalScore = rival.portfolio.getRating();


        if (myScore > rivalScore) { 
            System.out.println(this.name + " wins the fashion show!");
        } else if (myScore < rivalScore) {
            System.out.println(rival.name + " wins the fashion show!");
        } else {
            System.out.println("It's a tie!");
        }
    }
}
