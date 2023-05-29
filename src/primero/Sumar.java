package primero;
import java.io.*;

public class Sumar {
	public static void main(String[]args) throws IOException{
		System.out.println("El resultado de la suma es: "+suma());
	}
	
	public static int suma()throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		System.out.println("Ingrese 3 numeros: ");
		for(int i = 1; i <= 3; i++) {
			System.out.print(i+". numero: ");
			sum += Integer.parseInt(br.readLine());
		}
		return sum;
	}
}
