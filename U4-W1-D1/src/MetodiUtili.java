public class MetodiUtili {

    public static int moltiplica(int a, int b) {
        return a * b;
    }

    public static String concatena(String s, int numero) {
        return s + numero;
    }

    public static String[] inserisciInArray(String[] array, String nuovaStringa) {
        if (array.length != 5) {
            throw new IllegalArgumentException("L'array deve contenere esattamente 5 elementi.");
        }

        String[] nuovoArray = new String[6];

        nuovoArray[0] = array[0];
        nuovoArray[1] = array[1];
        nuovoArray[2] = nuovaStringa;
        nuovoArray[3] = array[2];
        nuovoArray[4] = array[3];
        nuovoArray[5] = array[4];

        return nuovoArray;
    }

    public static void main(String[] args) {
        // 1. Moltiplicazione
        int risultatoMoltiplicazione = moltiplica(4, 5);
        System.out.println("Risultato moltiplicazione: " + risultatoMoltiplicazione);

        // 2. Concatenazione
        String risultatoConcatenazione = concatena("Risultato: ", risultatoMoltiplicazione);
        System.out.println("Risultato concatenazione: " + risultatoConcatenazione);

        // 3. Inserimento in array
        String[] arrayIniziale = {"uno", "due", "tre", "quattro", "cinque"};
        String[] arrayModificato = inserisciInArray(arrayIniziale, "NUOVA");

        System.out.println("Array modificato:");
        for (String elemento : arrayModificato) {
            System.out.println(elemento);
        }
    }
}
