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
        // Código del hilo      
    }  
}
