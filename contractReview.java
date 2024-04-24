import java.io.IOException;
import java.util.Scanner;

//Exercício 1120
public class contractReview {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        int n1 = -1;
        String n2 = new String();
        
        while (n1 != 0){
            n1 = entrada.nextInt();
            n2 = entrada.next();
        
            for (int i = 0; i < n2.length(); i++) {
                n2 = n2.replace(Integer.toString(n1), "");
                if(n2 == "") n2 = "0";
                if(n2.startsWith("0")) n2 = "0";
            }
    
            System.out.println(n2);
        }

        entrada.close();
    }
}