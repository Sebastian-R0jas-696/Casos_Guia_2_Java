import java.util.Scanner;
//Creado por Sebastian Rojas
public class Caso_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sueldo = 0;
		float impuesto = 0;
		System.out.print("Ingrese Sueldo: ");
		sueldo = sc.nextInt();
		
		if (sueldo <= 1500)
			impuesto = (float)(sueldo * 0.03);
		else
			if (sueldo >1500 & sueldo <= 3000)
				impuesto = (float)(sueldo * 0.08);
			else
				if (sueldo > 3000)
					impuesto = (float)(sueldo * 0.12);
		System.out.println("Impuesto Calculado: " + impuesto);
	
	}

}
