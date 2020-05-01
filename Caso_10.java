import java.util.Scanner;
//Creado por Sebastian Rojas
public class Caso_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String empleado = "";
		int H_T = 0, T_H = 0, tardanza = 0;
		float importe, bono, dsct, Palcanzado, meta = 70;
		
		System.out.print("Trabajador: ");
		empleado = sc.nextLine();
		System.out.print("Horas Trabajadoas: ");
		H_T = sc.nextInt();
		System.out.print("Tarifa por Horas: ");
		T_H = sc.nextInt();
		System.out.print("Minutos de Tardanza: ");
		tardanza = sc.nextInt();
		
		importe = H_T * T_H;
		if (H_T > 60)
			bono = (float)(importe * 0.13);
		else
			bono = (float)(importe * 0.04);
		
		if (tardanza > 15)
			dsct = (float)(importe * 0.03);
		else
			dsct = 0;
		Palcanzado = (100 * H_T) / meta;
		
		System.out.println("Iporte: " + importe);
		System.out.println("Bono: " + bono) ;
		System.out.println("Descuento: " + dsct);
		System.out.println("Meta alcanzada: " + Palcanzado + "%");

	}

}
