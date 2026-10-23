public class PrecisionPi {
    public static void main(String[] args) {
        //Límite de tolerancia
        double tolerancia =  0.1;
        // Inicializamos el margen de error
        double error = 1.0;
        //variable de lanzamientos
        int dardos_lanzados=0;
        //variable  de tiros adentro de la circunferencia
        int conteo_tiros_acertados=0;

        double aprox_pi = 0.0;
            
        // mientras el margen de error sea mayor a la tolerancia se ejecuta el código
        while(error>tolerancia){
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

            //Cálculo de de aproximación de PI

            aprox_pi= 4.0*conteo_tiros_acertados/dardos_lanzados;

            //Se actualiza el margen de error

            error=Math.abs(Math.PI-aprox_pi);
          
        }

            //Se imprime número de intentos
       System.out.printf("intentos: %d ",dardos_lanzados );

       System.out.printf(" Estimación de pi: %.6f",aprox_pi);



    }
}