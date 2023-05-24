public class Main {
    public static void main(String[] args) {
        int numeroVezes;
        int numeroVezesAnterior = 0;
        int[] vetor = { 1, 5, 2, 3, 1, 3, 1, 3,4, 4,4};
        int moda = 0;
        int[] vetorRes = new int[2];


        for (int i = 0; i < vetor.length; i++) {
            numeroVezes = 1;

            for (int j = 0; j < vetor.length; j++) {
                if (vetor[i] == vetor[j]) {
                    numeroVezes++;
                }
            }
            if (numeroVezes >= numeroVezesAnterior) {
                moda = vetor[i];
                // Ã‰ igual - Preenche posiÃ§Ã£o 1 e mantÃ©m posiÃ§Ã£o 0.

                if ((vetorRes[0] != moda) && (numeroVezes == numeroVezesAnterior)) {
                    vetorRes[1] = moda;
                } else {
                    // Ã‰ maior - Tem moda e zera a posiÃ§Ã£o 1
                    vetorRes[0] = moda;
                    vetorRes[1] = 0;
                }
                numeroVezesAnterior = numeroVezes;
            }
        }

        for (int k = 0; k < vetorRes.length; k++) {
            System.out.println("VetorRES: " + vetorRes[k]);
        }

        if (vetorRes[1] == 0) {

            System.out.println("O número " + vetorRes[0] + " é a moda.");
        } else {
            System.out.println("Não existe moda.");
        }

    }
}