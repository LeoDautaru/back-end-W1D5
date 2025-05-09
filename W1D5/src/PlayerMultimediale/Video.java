package PlayerMultimediale;

public class Video implements ElementoMultimediale, Riproducibile {
    private String titolo;
    private int durata;
    private int volume;
    private int luminosita;

    public Video(String titolo, int durata, int volume, int luminosita) {
        this.titolo = titolo;
        this.durata = durata;
        this.volume = Math.min(volume, 100);
        this.luminosita = Math.min(luminosita, 100);
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

    public void alzaVolume() {
        if (volume < 100) volume++;
    }

    public void aumentaLuminosita() {
        if (luminosita < 100) luminosita++;
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
