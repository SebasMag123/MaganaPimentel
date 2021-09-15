public class App {
    public static void main(String[] args) throws Exception {
        int valor1=0;
        int valor2=1;
        int temp;
        int ciclos=10;
        int i=0;
while (i<ciclos) {
            temp=valor1+valor2;
            valor1=valor2;
            valor2=temp;
            i++;
            System.out.println(valor2);
        }

    }
}
