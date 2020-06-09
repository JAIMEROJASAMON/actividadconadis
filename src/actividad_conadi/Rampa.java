
package actividad_conadi;

public class Rampa {    //public con acceso desde cualquier parte del programa aqui definimos los atributos y los metodos 
    private int numEscalones,alturaEscalon,pendiente;//encapsulamos los atributos para qeu no sean modificados
    private float longitudRampa;
//Definimos el constructor
    public Rampa(int numEscalones, int altuaEscalon, int pendiente) {
        this.numEscalones = numEscalones;   // a la variable de la clase numEscalones asignele el valor que esta llegando en este caso con el mismo nombre 
        this.alturaEscalon = altuaEscalon;   //a la variable de la clase altuaEscalon asignele el valor que esta llegando en este caso con el mismo nombre 
        this.pendiente = pendiente;          //a la variable de la clase pendiente asignele el valor que esta llegando en este caso con el mismo nombre 
          }

    //definimos los metodos 
    public void longitudCalculo(){  //metodo para calcular la longitud de la rampa no devuelve valor
        longitudRampa = ((float)numEscalones*alturaEscalon/pendiente*100);
    }
   
    public void verLongitud(){      //metodo para mostrar en pantalla el valor de la longitud previamente calculada
        longitudCalculo();          //llamamos al metodo que calcula el largo de la rampa
        System.out.println("Usted tiene "+numEscalones+" escalones, cada uno de  "+alturaEscalon+" cm, para tener una pendiente del "+pendiente+" %");
        System.out.println("El valor de la longitud de la rampa es : "+longitudRampa+" cm ");
    }
    
}
