import java.util.Random;
import java.util.Scanner;
public class optimizacion {
	public static void main(String[] args) {
		Scanner test = new Scanner(System.in);
		System.out.println("Introduce el tamaño del array:");
		int s = test.nextInt();
		int[] n= new int[s];
		int max = 50; int min =10;
		Random random = new Random();
		for (int a=0;a<n.length;a++) {
			int numr = random.nextInt(max+1-min)+min; n[a] = numr;
			System.out.println("Posición: " + a + " Valor: " + n[a]);
		}
		int suma=0;
		for (int b=0;b<n.length;b++) { suma = suma + n[b]; }
		System.out.println("La suma de todos los valores es: " + suma );
		int num = 0;
		double m = suma/n.length;
		System.out.println("La media es: " + m);
		for (int c=0;c<n.length;c++) { if (n[c] > m) num++; }
	System.out.println("Cantidad de números superiores a la media:"+num);
	num = 0;
		for (int c=0;c<n.length;c++) { if (n[c] < m) num++; }
	System.out.println("Cantidad de números inferiores a la media:"+num);
	}
}
