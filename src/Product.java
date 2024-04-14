public  abstract class Product {
    protected String nazivProizvoda;
    protected String barkod;
    protected double osnovnaCena;

    protected final double PDV = 0.2;
    protected double cenaSaPDV;

    public Product(String nazivProizvoda, String barkod,double osnovnaCena) {
        this.nazivProizvoda = nazivProizvoda;
        this.barkod = barkod;
        this.osnovnaCena= osnovnaCena;

    }

    public String getNazivProizvoda() {
        return nazivProizvoda;
    }

    public String getBarkod() {
        return barkod;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    protected void izracunavanjeCene(){
        cenaSaPDV  = osnovnaCena+(osnovnaCena *PDV);
        System.out.println("Cena proizvoda sa PDV iznosi "+cenaSaPDV);
    }

    @Override
    public String toString() {
        return "Product{" +
                "nazivProizvoda='" + nazivProizvoda + '\'' +
                ", barkod='" + barkod + '\'' +
                ", osnovnaCena=" + osnovnaCena +
                '}';
    }
}

