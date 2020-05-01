import java.util.Scanner;
//Creado por Sebastian Rojas
public class Caso_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float n = 0;
		System.out.print("Ingrese numero: ");
		n = sc.nextFloat();
		if (n % 2 == 0)
			System.out.println("El numero es Par");
		else
			System.out.println("El numero es Impar"); 

	}

}
