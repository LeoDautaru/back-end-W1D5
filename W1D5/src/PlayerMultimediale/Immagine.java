package PlayerMultimediale;

public class Immagine  implements ElementoMultimediale {
    private String titolo;
    private int luminosita;

    public Immagine(String titolo, int luminosita) {
        this.titolo = titolo;
        this.luminosita = luminosita;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getLuminosita() {
        return luminosita;
    }

    public void setLuminosita(int luminosita) {
        this.luminosita = luminosita;
    }

    public void diminuisciLuminosita() {
        if (luminosita >0) luminosita--;
    }

    public void show() {
        System.out.println(titolo + " " + "*".repeat(luminosita));
    }

    @Override
    public void esegui() {
        show();
    }
}
