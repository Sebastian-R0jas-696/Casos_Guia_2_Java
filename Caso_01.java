import java.util.Scanner;
//Creado por Sebastian Rojas
public class Caso_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int edad = 0;
		System.out.print("Ingrese una Edad: ");
		edad = sc.nextInt();
		
		if (edad >= 18)
			System.out.println("Mayor de edad");
		else
			System.out.println("Menor de edad");

	}

}
