## Hilos (threads) en Java

### ¿Que son?

Los hilos son una forma de crear la posibilidad de concurrencia de actividades; sin embargo, los hilos comparten el código y el acceso a algunos datos en forma similar a como un objeto tiene acceso a otros objetos. 
En Java un hilo es un objeto con capacidad de correr en forma concurrente el método “run()”. En cierta manera es como tener dos "program counters" para un mismo código.

### Implementacion:

En Java los hilos están encapsulados en la clase Thread. Para crear un hilo tenemos dos posibilidades:

* Heredar de Thread redefiniendo el método run().
* Crear una clase que implemente la interfaz Runnable que nos obliga a definir el método run().

En ambos casos debemos definir un método run() que será el que contenga el código del hilo. Desde dentro de este método podremos llamar a cualquier otro método de cualquier objeto, pero este método run() será el método que se invoque cuando iniciemos la ejecución de un hilo. El hilo terminará su ejecución cuando termine de ejecutarse este método run().

    public class EjemploHilo extends Thread  
    {      
        public void run()() 
        {
        // Código del hilo*      
        }  
    }    

Una vez definida la clase de nuestro hilo deberemos instanciarlo y ejecutarlo de la siguiente forma:

    Thread t = new EjemploHilo();
    t.start();

Al llamar al método start del hilo, comenzará ejecutarse su método run. Crear un hilo heredando de Thread tiene el problema de que al no haber herencia múltiple en Java, si heredamos de Thread no podremos heredar de ninguna otra clase, y por lo tanto un hilo no podría heredar de ninguna otra clase.

Este problema desaparece si utilizamos la interfaz Runnable para crear el hilo, ya que una clase puede implementar varios interfaces. Definiremos la clase que contenga el hilo como se muestra a continuación:

    public class EjemploHilo implements Runnable
    {
        public void run() 
        {          
        // Código del hilo      
        }  
    }

Para instanciar y ejecutar un hilo de este tipo deberemos hacer lo siguiente:

    Thread t = new Thread(new EjemploHilo());  
    t.start();

Esto es así debido a que en este caso EjemploHilo no deriva de una clase Thread, por lo que no se puede considerar un hilo, lo único que estamos haciendo implementando la interfaz es asegurar que vamos a tener definido el método run(). Con esto lo que haremos será proporcionar esta clase al constructor de la clase Thread, para que el objeto Thread que creemos llame al método run() de la clase que hemos definido al iniciarse la ejecución del hilo, ya que implementando la interfaz le aseguramos que esta función existe.