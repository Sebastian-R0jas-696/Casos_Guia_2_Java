import java.util.Scanner;
//Creado por Sebastian Rojas
public class Caso_09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre ="";
		float nota1 = 0, nota2 = 0;
		float asistencia = 0;
		
		System.out.print("Nombre del Alumno: ");
		nombre = sc.nextLine();
		System.out.print("Ingrese nota1: ");
		nota1 = sc.nextFloat();
		System.out.print("Ingrese nota2: ");
		nota2 = sc.nextInt();
		System.out.print("Numero de Asistencia: ");
		asistencia = sc.nextFloat();
		
		nota1 = (float)(nota1 * 0.3);
		nota2 = (float)(nota2 * 0.7);
		
		float promedio = 0;
		float porcentaje = 0;
		promedio = (float)(nota1 + nota2);
		porcentaje = (float)((100 * asistencia) / 12);
		String Estado ="";
		
		if (promedio > 12 && promedio <= 20 && porcentaje >=70)
			Estado = "Aprobado";
		else
			Estado ="Desaprobado";
		System.out.println("Alumno: "+ nombre);
		System.out.println("Promedio: " + promedio);
		System.out.println("Asistencia: " + porcentaje + "%");
		System.out.println("Estado: " + Estado );
		

	}

}
