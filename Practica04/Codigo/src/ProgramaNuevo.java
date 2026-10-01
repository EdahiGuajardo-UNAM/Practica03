public class ProgramaNuevo{	
	public static void main(String[] args) {
	//variables
	String producto = "Laptop para la carrera";
	int precio = 15000;
	int descuento = 3000;
	double meses = 18.0;
       // Encabezado
	System.out.println("=== Ficha de compra ===");
    // Se imprime la variable producto
	System.out.println("- Producto : " + producto);	
    //  como quedaría el precio final del producto con el descuento
	System.out.println("- Precio con descuento : " + (precio - descuento));
    // se divide el número de meses entre 12 para determinar en cuantos años se termina de pagar
	System.out.println("- Plazo de pago en anios : " + (meses / 12.0));
    // se divide el precio con descuentro entre los 18 meses para saber la mensualidad
    System.out.printf("-Pago mensual: %.2f %n", ((precio - descuento) / meses));
	System.out.println("=== Fin de la ficha ===");

	}
}