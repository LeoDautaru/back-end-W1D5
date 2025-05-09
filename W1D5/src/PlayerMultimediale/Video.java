package PlayerMultimediale;

public class Video implements ElementoMultimediale, Riproducibile {
    private String titolo;
    private int durata;
    private int volume;
    private int luminosita;

    public Video(String titolo, int durata, int volume, int luminosita) {
        this.titolo = titolo;
        this.durata = durata;
        this.volume = volume;
        this.luminosita = luminosita;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getLuminosita() {
        return luminosita;
    }

    public void setLuminosita(int luminosita) {
        this.luminosita = luminosita;
    }

    public void aumentaLuminosita() {
        luminosita++;
    }


    public void diminuisciLuminosita() {
        if (luminosita > 0) {
            luminosita--;
        }
    }


    @Override
    public void esegui() {
        play();
    }


    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println(titolo + " " + "!".repeat(volume) + "*" .repeat(luminosita));
        }
    }
}
