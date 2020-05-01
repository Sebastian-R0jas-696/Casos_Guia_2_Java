import java.util.Scanner;
//Creado por Sebastian Rojas
public class Caso_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float sueldo = 0, impuesto;
		System.out.print("Ingrese un sueldo: ");
		sueldo = sc.nextFloat();
		if (sueldo > 2800)
			impuesto = (float)(sueldo * 0.05);
		else
			impuesto = (float)(sueldo * 0.02);
		System.out.println("Impuesto Calculado: " + impuesto);

	}

}
