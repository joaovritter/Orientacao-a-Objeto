package Atividades;

public class J9primo {
    public static void main(String[] args) {
        for (int n = 1; n <= 50; n++) {
            int cont = 0;
            
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    cont++;
                    break;
                }
            }
            
            if (cont == 0 && n > 1) {
                System.out.println(n + " eh primo");
            } else {
                System.out.println(n + " nao eh primo");
            }
        }
    }
}
