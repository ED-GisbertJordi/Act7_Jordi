package pares;

public class main {
    public static void main(String[] args) {
    	imprimirNumeros(2, 20);
    	imprimirNumeros(2, 2, 20);
    }
    private static void imprimirNumeros(int numeroIncrementativo, int max) {
    	int principio = 0;
    	for(int i = principio; i<=max; i+=numeroIncrementativo) {
    		System.out.println(i);
    	}
    }
    private static void imprimirNumeros(int numePrincipio, int numeroIncrementativo, int max) {
    	for(int i = numePrincipio; i<=max; i+=numeroIncrementativo) {
    		System.out.println(i);
    	}
    }
}
