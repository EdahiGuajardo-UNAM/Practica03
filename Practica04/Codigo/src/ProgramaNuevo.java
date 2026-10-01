public class ProgramaNuevo{	
	public static void main(String[] args) {
	//variables
	String producto = "Laptop para la carrera";
	int precio = 15000;
	int descuento = 3000;
	double meses = 18.0;
       // Esta función imprime la ficha de información del pago del producto, se le pasan dos args, el primero el la cadena de texto con los caracteres de formato
       // y el segundo son las variables en orden de uso
    System.out.printf("=== Ficha de compra === %n - Precio con descuento : %d %n - Plazo de pago en anios : %.1f %n -Pago mensual: %.2f %n === Fin de la ficha === ",
    (precio - descuento), (meses / 12.0),  ((precio - descuento) / meses));

	}
}