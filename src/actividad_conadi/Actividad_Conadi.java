
package actividad_conadi;

public class Actividad_Conadi {

    public static void main(String[] args) {
        int numEscalones = 2;//asiganamos valores a las variables
        int alturaEscalon = 13;
        int pendiente = 7;
        Rampa rampa1 = new Rampa(numEscalones,alturaEscalon,pendiente);//creamos un obejto de la clase rampa
                                                                     //colocacmos los parametros para la rampa 1
        rampa1.verLongitud();//llamamos al metodo para ver el valor de la longitud de la rampa
    } 
}
     