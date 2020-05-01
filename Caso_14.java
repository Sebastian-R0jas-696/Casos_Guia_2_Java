import java.util.Scanner;
//Creado por Sebastian Rojas
public class Caso_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String alumno = "",carrera = "", turno = "";
		float monto, dsct, total, dolares;
		
		System.out.print("Alumno: ");
		alumno = sc.nextLine();
		System.out.print("Carrera: ");
		carrera=sc.nextLine();
		System.out.print("Turno: ");
		turno=sc.nextLine();
		
		switch(carrera){
		case "DS":
			monto = 1500;
			break;
		case "RC":
			monto = 1400;
			break;
		case "DG":
			monto = 1300;
			break;
		default:
			monto = 0;
			break;			
		}
		
		switch(turno){
		case "Mañana":
			dsct =(float)(monto * 0.1);
			break;
		case "Tarde":
			dsct =(float)(monto * 0.2);
		case "Noche":
			dsct = (float)(monto * 0.15);
		default:
			dsct = 0;
		}
		
		total = monto - dsct;
		dolares = (float)(total / 3.33);
		
		System.out.println("Monto: "+ monto);
		System.out.println("Turno: "+ turno);
		System.out.println("Descuento: " + dsct);
		System.out.println("Total a pagar: " + total);
		System.out.println("Dolares: " + dolares);
	}

}
