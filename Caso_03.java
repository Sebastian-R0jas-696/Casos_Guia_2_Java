import java.util.Scanner;
//Creado por Sebastian Rojas
public class Caso_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = 0, n2 = 0;
		System.out.print("Ingrese el primer numero: ");
		n1 = sc.nextInt();
		System.out.print("Ingrese el segundo numero: ");
		n2 = sc.nextInt();
		if (n1 == n2)
			System.out.println("Son iguales");
		else
			if (n1 > n2)
				System.out.println("El primero es mayor");
			else
				System.out.println("El segundo es mayor");

	}

}
