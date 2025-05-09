package PlayerMultimediale;

public class RegistrazioneAudio implements ElementoMultimediale, Riproducibile {
    private String titolo;
    private int durata;
    private int volume;


    public RegistrazioneAudio(String titolo, int durata, int volume) {
        this.titolo = titolo;
        this.durata = durata;
        this.volume = volume;
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

    public void abbasaVolume() {
        if (volume > 0) {
            volume--;
        }
    }


    public void alzaVolume() {
        volume++;
    }

    @Override
    public void esegui() {
        play();
        }

        @Override
                public void play () {
            for (int i= 0; i < durata; i++) {
                System.out.println(titolo + " " + "!".repeat(volume));
        }
    }
}
