public class EstimacionPi {
    public static void main(String[] args) {
        //Variable de número de dardos
        int dardos_totales = 100000000;
        //variable de lanzamientos
        int dardos_lanzados=0;
        //variable  de tiros adentro de la circunferencia
        int conteo_tiros_acertados=0;

            
        // mientras haya más dardos que lanzamientos el código se ejecuta
        while(dardos_totales>dardos_lanzados){
            //establecemos las variables aleatorias de las coordenadas
            double coord_x=Math.random();
            double coord_y=Math.random();
            

            //Se calcula distancia al centro

            double distancia_al_centro=Math.sqrt(Math.pow(coord_x,2)+Math.pow(coord_y,2));

            // Validación si el dardo entra
   
            if(distancia_al_centro<=1.0){
                //Si el dardo entra se agrega al contador de tiros acertados y de tiros lanzados
                conteo_tiros_acertados++;
                dardos_lanzados++;
            }
            // Si el dardo no entra se lleva el conteo de dardos lanzados
            else {
                dardos_lanzados++;
            }

           
        }

        //Se establece la aproximación de pi a partir de los tiros acertados y los fallados

        double aprox_pi= 4.0*conteo_tiros_acertados/dardos_totales;

       System.out.printf("Estimación de pi: %.6f",aprox_pi);


    }
}