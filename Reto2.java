package reto2;
import java.util.Scanner;
/**
 *
 * @author alejandro.becerraa
 */
public class Reto2 {


    public static void main(String[] args) {
       
        //punto1();
        //punto2();
        punto4();
    }
////////////////////////////////   Punto 1   /////////////////////////////////
   
    public static void punto1(){
        Scanner leer = new Scanner(System.in);
        int N,impar,acumulador=0;
       
        System.out.println("Ingrese un numero entero para calcular su cuadrado: ");
        N = leer.nextInt();
       
        for (int i = 0; i < N; i++){
            impar = 2*i+1;
            acumulador = acumulador + impar;
        }
       
        System.out.println("El cuadrado del numero ingrsado es:   " + acumulador);        
    }

////////////////////////////////////////////////////////////////////////////////
    
    
/////////////////////////////////    Punto 2   /////////////////////////////////
    
    public static void punto2(){
        Scanner leer = new Scanner(System.in);
        
        int N,primo=0,acumulador=0,contador;
       
        System.out.println("Ingrese un numero entero para calcular la suma de sus numeros primos: ");
        N = leer.nextInt();
        
        
        for(int i = 1; i <= N; i++){
            contador = 0;
            for(int j = 2; j <= i; j++){
                if (i % j == 0){
                    contador = contador+1;
                }                
            }
            if(contador == 1){
                primo = i;
                acumulador = acumulador + primo; 
            }
                       
        }
        System.out.println("La suma de los primos es:   " + acumulador);
    }
    
////////////////////////////////////////////////////////////////////////////////
    
/////////////////////////////////////     punto 3   ////////////////////////////
    
    public static void punto3(){
    
    
        Scanner leer = new Scanner(System.in);

            int[] platosD = new int[2];

            int[] platosT = new int[12];

            int opcion;

            double mt;

            int m=1;
            int dimension = 0;


            for (int l = 0; l <= 1; l++){
                System.out.println("Ingrese la cantidad de dientes del plato " + (l+1) + " delatero \"");
                platosD[l] = leer.nextInt();            
            }
            for (int n = 0; n <= 11; n++){
                System.out.println("Ingrese la cantidad de dientes del piñon " + (n+1) + " trasero \"");
                platosT[n] = leer.nextInt();    

                while (platosT[n] == 0){
                    System.out.println("El numero ingresado no debe ser cero ingrese denuevo los dientes de este piñon: ");
                    platosT[n] = leer.nextInt();
                }

            }    


            while (m == 1){
                m = 0;

                System.out.println("Ingrese la dimension de las llantas:"
                        + "Ingrese 1 si dimension de la llanta es 2288"
                        + "Ingrese 2 si dimension de la llanta es 2298"
                        + "Ingrese 3 si dimension de la llanta es 2326");

                opcion = leer.nextInt();

                switch (opcion){

                    case 1:

                        System.out.println("Usted eligió la opcion 1.");
                        dimension=2288;
                    break;       

                    case 2:

                        System.out.println("Usted eligió la opcion 2.");
                        dimension=2298;
                    break;

                    case 3:

                        System.out.println("Usted eligió la opcion 3.");
                        dimension=2326;
                    break;

                    default: 

                        System.out.println("Opcion incorrecta");
                        m = 1;
                    break;
                }
            }


            for(int i=0; i<=1; i++){

                if(platosD[i]!=0){

                    for(int j=0; j<=11; j++){

                        mt=((platosD[i]/platosT[j])*dimension);

                        System.out.println("con " + platosD[i] + "dientes en plato delantero y " + platosT[j] + "dientes"
                        + "en piñones traseros, el desarrollo es " + mt + "metros");
                    }

                }else{
                    break;   
                }
            }
    }
    
    
    
    
////////////////////////////////////////////////////////////////////////////////
    
    
    
/////////////////////////////////////     Punto 4   ////////////////////////////
    
    public static void punto4(){
        int opcPpal;

        do {
            opcPpal = Validaciones.leerEntero(Reto2.MenuPpal());
            switch (opcPpal)
            {
                case 1:
                    punto1();
                break;
                case 2:
                    punto2();
                break;
                case 3:
                    punto3();             
                break;     
            }         
        
        }while (opcPpal < 4 || opcPpal > 4);        
    }
    
    public static String MenuPpal() 
            
    {
        return "** MENÚ PRINCIPAL **\n\n"
                + "1. Calculo de cuadrados de numeros enteros\n"
                + "2. Sumatoria de primos\n"
                + "3. Metros recorridos en bisicleta por paso de pedal\n"
                + "4. # para termiar";
    }


////////////////////////////////////////////////////////////////////////////////  
   
}