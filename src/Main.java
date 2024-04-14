public class Main {
    public static void main(String[] args) {

    Chocolate chocolate=new Chocolate("Milka","123456456456",110,80);
    Wine wine= new Wine("Merlot","156456456456",450,1.5);

    chocolate.izracunavanjeCene();
        System.out.println(chocolate);
        wine.izracunavanjeCene();
        System.out.println(wine);
    }
}