public class Chocolate extends Product{
    private double tezina;

    public Chocolate(String nazivProizvoda,String barkod, double osnovnaCena,double tezina) {
        super(nazivProizvoda, barkod,osnovnaCena);
        this.tezina = tezina;
    }

    @Override
    protected void izracunavanjeCene(){
        cenaSaPDV  = getOsnovnaCena()+(getOsnovnaCena() *PDV);
        System.out.println("Cena Cokolade "+getNazivProizvoda()+" sa PDV iznosi "+cenaSaPDV);
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "tezina=" + tezina +
                ", nazivProizvoda='" + nazivProizvoda + '\'' +
                ", barkod='" + barkod + '\'' +
                ", osnovnaCena=" + osnovnaCena +
                "} " ;
    }
}
