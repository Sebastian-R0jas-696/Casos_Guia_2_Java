import java.util.Scanner;
//Creado por Sebastian Rojas
public class Caso_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nota = 0;
		String mensaje = " ";
		
		System.out.print("Ingrese nota: ");
		nota = sc.nextInt();
		
		if (nota <= 7)
			mensaje = "Sin Palabras";
		else
			if (nota > 7 & nota <= 10)
				mensaje = "Malo";
			else
				if (nota > 10 & nota <= 14)
					mensaje = "Regular";
				else
					if (nota > 14 & nota <= 17)
						mensaje = "Notable";
					else
						if (nota >= 18 & nota <= 20)
							mensaje = "Excelente";
		System.out.println("Estado obtenido: " + mensaje);
	}

}
