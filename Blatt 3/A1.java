public class A1 {
    public static void main(String[] args) {
        Konto myGiro = new GiroKonto("231415425", 250);
        System.out.println(myGiro.getSaldo());
        myGiro.auszahlen(300);
        System.out.println(myGiro.getSaldo());

        Konto mySpar = new SparKonto("412312412", 250);
        System.out.println(mySpar.getSaldo());
        mySpar.auszahlen(300);
    }
}

class Konto {
    private String kontoNummer;
    private double saldo;

    public Konto(String kontoNummer,double saldo){
        this.kontoNummer = kontoNummer;
        this.saldo = saldo;
    }
    public String getKontonummer() {
        return kontoNummer;
    }

    public void setKontonummer(double kontoNummer) {
        this.kontoNummer = kontoNummer;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void einzahlen(double betrag) {
        this.saldo += betrag;
    }
    public void auszahlen(double betrag){
        this.saldo -= betrag;
    }
}

class GiroKonto extends Konto {
    public GiroKonto(String kontoNummer,double saldo){
        super(kontoNummer,saldo);
    }
}

class SparKonto extends Konto {
    public SparKonto(String kontoNummer,double saldo){
        super(kontoNummer,saldo);
    }
    public void auszahlen(double betrag){
        if(this.getSaldo()-betrag<0){
            System.out.println("Konto darf nicht überzogen werden");
        }
        else{
            super.auszahlen(betrag);
        } 
    }
}