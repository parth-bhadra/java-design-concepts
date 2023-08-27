package dependencyInversionPrinciple;

public class Client {
    public static void main(String[] args) {
        Tata myTata = new Tata(100, 1000, 4);
        Mahindra myMahindra = new Mahindra(120, 1500, 4);
        Travel t = new Travel(myMahindra);
        t.startTravelling();
    }


}
