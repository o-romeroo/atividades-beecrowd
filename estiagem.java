import java.io.IOException;
import java.util.Scanner;
import java.util.Map; 

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class estiagem {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int qtdImoveis = 0;
        int moradores = 0;
        int consumo = 0;
        Map<Integer, Integer> base;
        
        qtdImoveis = sc.nextInt();

        while(qtdImoveis != 0){
            int somaMoradores = 0;
            int somaConsumo = 0;
            int consumoMed[] = new int[qtdImoveis];
            
            for (int i = 0; i < qtdImoveis; i++) {
                moradores = sc.nextInt();
                consumo = sc.nextInt();

                consumoMed[i] = consumo/moradores;
            }
            
            for (int i = 0; i < consumoMed.length; i++) {
                int menor = i;
                for (int j = i+1; j < consumoMed.length; j++) {
                    if (consumoMed[j] < consumoMed[menor]) menor = j;
                }

                int aux = consumoMed[i];
                consumoMed[i] = consumoMed[menor];
                consumoMed[menor] = aux;
            }

            
            //UNFINISHED

            qtdImoveis = sc.nextInt();
        }

    }
 
}
