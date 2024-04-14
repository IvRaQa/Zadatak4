public class Wine extends Product{

    private double zapreminaBoce;
    final double porezNaVino= 0.1;
    private double cenaVinaSaPDV=0;

    public Wine(String nazivProizvoda,String barkod,double osnovnaCena, double zapreminaBoce) {
        super(nazivProizvoda,barkod,osnovnaCena);
        this.zapreminaBoce = zapreminaBoce;
    }

    @Override
    protected void izracunavanjeCene(){
        cenaSaPDV  = getOsnovnaCena()+(getOsnovnaCena() *PDV);
        double cenaVinaSaPDV =cenaSaPDV +(cenaSaPDV*porezNaVino);
        System.out.println("Cena Vina tipa "+ getNazivProizvoda() +" sa dodatnim PDV-om iznosi "+cenaVinaSaPDV);
    }

    @Override
    public String toString() {
        return "Wine{" +
                "zapreminaBoce=" + zapreminaBoce +
                ", nazivProizvoda='" + nazivProizvoda + '\'' +
                ", barkod='" + barkod + '\'' +
                ", osnovnaCena=" + osnovnaCena +
                "} " ;
    }
}
