package PlayerMultimediale;

import java.util.Scanner;

public class LettoreMultimediale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ElementoMultimediale[] elementi = new ElementoMultimediale[5];

        for (int i = 0; i < 5; i++) {
            int tipo;
            do {
                System.out.println("Inserisci tipo di elemento (1 = Immagine, 2 = Audio, 3 = Video): ");
                tipo = scanner.nextInt();
                if (tipo < 1 || tipo > 3) {
                    System.out.println("Tipo non valido. Riprova.");
                }
            } while (tipo < 1 || tipo > 3);
            scanner.nextLine();

            System.out.println("Inserisci il titolo:");
            String titolo = scanner.nextLine();

            switch (tipo) {
                case 1:
                    System.out.println("Inserisci la luminosità:");
                    int luminosita;
                    do {
                        System.out.println("Inserisci la luminosità (0-100):");
                        luminosita = scanner.nextInt();
                        if (luminosita < 0 || luminosita > 100) {
                            System.out.println("Valore non valido. Riprova.");
                        }
                    } while (luminosita < 0 || luminosita > 100);
                    elementi[i] = new Immagine(titolo, luminosita);
                    break;
                case 2:
                    System.out.println("Inserisci la durata:");
                    int durataAudio = scanner.nextInt();
                    System.out.println("Inserisci il volume:");
                    int volumeAudio;
                    do {
                        System.out.println("Inserisci il volume (0-100):");
                        volumeAudio = scanner.nextInt();
                        if (volumeAudio < 0 || volumeAudio > 100) {
                            System.out.println("Valore non valido. Riprova.");
                        }
                    } while (volumeAudio < 0 || volumeAudio > 100);

                    elementi[i] = new RegistrazioneAudio(titolo, durataAudio, volumeAudio);
                    break;
                case 3:
                    System.out.println("Inserisci la durata:");
                    int durataVideo = scanner.nextInt();
                    System.out.println("Inserisci il volume:");
                    int volumeVideo;
                    do {
                        System.out.println("Inserisci il volume (0-100):");
                        volumeVideo = scanner.nextInt();
                        if (volumeVideo < 0 || volumeVideo > 100) {
                            System.out.println("Valore non valido. Riprova.");
                        }
                    } while (volumeVideo < 0 || volumeVideo > 100);

                    int luminositaVideo;
                    do {
                        System.out.println("Inserisci la luminosità (0-100):");
                        luminositaVideo = scanner.nextInt();
                        if (luminositaVideo < 0 || luminositaVideo > 100) {
                            System.out.println("Valore non valido. Riprova.");
                        }
                    } while (luminositaVideo < 0 || luminositaVideo > 100);
                    elementi[i] = new Video(titolo, durataVideo, volumeVideo, luminositaVideo);
                    break;
                default:
                    System.out.println("Tipo non valido, ripeti.");
                    i--;
            }
        }

        int scelta;
        do {
            System.out.println("\nQuale elemento vuoi eseguire? (1-5, 0 per uscire):");
            scelta = scanner.nextInt();
            if (scelta >= 1 && scelta <= 5) {
                elementi[scelta - 1].esegui();
            } else if (scelta != 0) {
                System.out.println("Scelta non valida.");
            }
        } while (scelta != 0);

        scanner.close();
        System.out.println("Programma terminato.");
    }
}

