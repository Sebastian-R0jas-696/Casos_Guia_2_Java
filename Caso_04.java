import java.util.Scanner;
//Creado por Sebastian Rojas
public class Caso_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = 0, n2 = 0;
		System.out.print("Primer numero: ");
		n1 = sc.nextInt();
		System.out.print("Segundo numero: ");
		n2 = sc.nextInt();
		if (n1 == n2)
		System.out.println("Los numero son Iguales");
		else
			if (n1 < n2)
				System.out.println("El Primer numero es menor");
			else
				System.out.println("El Segundo numero es menor");
		

	}

}
