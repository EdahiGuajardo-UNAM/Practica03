public class Cotizador{
    public static void main(String[] args){
        //variables principales
        int precio = 12899;
        double tasa_interes = 0.15;
        int meses = 21;
        String nombre_estudiante = "Robbie Valentino";
        char clasificación = 'E';
        //se calcula el interes anual
        double interes_anual = (precio * tasa_interes)/(meses/12);
        // cuanto debe de pagar en total
        double pago_total = precio + interes_anual;
        // el pago mensual
        double mensualidad = pago_total/12;

        // se integra en un mismo método con printf para tener un string formateado
        System.out.printf("El interés anual del estudiante %s es de $%.2f MXN. %n Sumando el interés al precio de la computador nos da una cantidad total de $%.2f MXN. %n La mensualidad corresponiente es de $%.2f MXN"
        ,nombre_estudiante,interes_anual, pago_total, mensualidad);

        //se llama la función de clasificador y se le pasan 2 args: el nombre del estudiante y su clasificación
        clasificador(nombre_estudiante,clasificación);
    


    }

    //por ahora solo imprime un mennsaje 
    public static void clasificador(String nombre, char calificación){
        System.out.printf("%n La clasificación de %s es de %c  ", nombre, calificación);
    }




}