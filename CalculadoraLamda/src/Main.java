import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declarar una expresion lambda
		// SINTAXIS
		// NombreInterfaceFuncional nombreExpresionLambda = (parametros) operador lambda
		// "->" {Instrucciones}

		/* Sin parametros
		InterfaceMetods mensajeBienve = () -> System.out.println("Bienvenido al sistema de ventas");
		//Mostrar
		mensajeBienve.mensaje();*/
		
		
		/*Con parametros
		InterfaceMetods mensajeBienveUsu = (n) -> System.out.println("Bienvenido al sistema de ventas " + n);
		//Mostrar
		mensajeBienveUsu.mensaje("Angy");*/
		
		/*InterfaceMetods calcular = (n1, n2) -> {
			float resul = n1 + n2;
			System.out.println("La suma es: " + resul);
		};*/
		
		/*Mostrar
		calcular.operacionesArit(45.6f, 34.5f);*/
		
		
		
		Scanner sc = null;
		float n1, n2;
		
		int menuP;
		
		        
        do {
            System.out.println("*** BIENVENIDO AL MENU PRINCIPAL OPERACIONES ARITMETICAS ***");
            System.out.println("1.- SUMA");
            System.out.println("2.- RESTA");
            System.out.println("3.- MULTIPLICACION");
            System.out.println("4.- DIVISION");
            System.out.println("5.- SALIR");
            sc = new Scanner(System.in);
            menuP = sc.nextInt();
            
            switch (menuP) {
                case 1:
                    System.out.println("INGRESE EL PRIMER NUMERO: ");
                    sc = new Scanner(System.in);
                    n1 = sc.nextFloat();

                    System.out.println("INGRESE EL SEGUNDO NUMERO: ");
                    sc = new Scanner(System.in);
                    n2 = sc.nextFloat();
                    
                    InterfaceMetods calcular = (float num1, float num2) -> {
                        float resul = num1 + num2;
                        System.out.println("El resultado de la suma es: " + resul);
                    };
                    
                    calcular.operacionesArit(n1, n2);
                    break;

                case 2:
                    System.out.println("INGRESE EL PRIMER NUMERO: ");
                    sc = new Scanner(System.in);
                    n1 = sc.nextFloat();

                    System.out.println("INGRESE EL SEGUNDO NUMERO: ");
                    sc = new Scanner(System.in);
                    n2 = sc.nextFloat();
                    
                    InterfaceMetods calcular2 = (float num1, float num2) -> {
                        float resul = num1 - num2;
                        System.out.println("El resultado de la resta es: " + resul);
                    };
                    
                    calcular2.operacionesArit(n1, n2);
                    break;
                    
                case 3:
                    System.out.println("INGRESE EL PRIMER NUMERO: ");
                    sc = new Scanner(System.in);
                    n1 = sc.nextFloat();

                    System.out.println("INGRESE EL SEGUNDO NUMERO: ");
                    sc = new Scanner(System.in);
                    n2 = sc.nextFloat();
                    
                    InterfaceMetods calcular3 = (float num1, float num2) -> {
                        float resul = num1 * num2;
                        System.out.println("El resultado de la multiplicacion es: " + resul);
                    };
                    
                    calcular3.operacionesArit(n1, n2);
                    break;

                case 4:
                    System.out.println("INGRESE EL PRIMER NUMERO: ");
                    sc = new Scanner(System.in);
                    n1 = sc.nextFloat();

                    System.out.println("INGRESE EL SEGUNDO NUMERO: ");
                    sc = new Scanner(System.in);
                    n2 = sc.nextFloat();
                    
                    InterfaceMetods calcular4 = (float num1, float num2) -> {
                        float resul = num1 / num2;
                        System.out.println("El resultado de la divicion es: " + resul);
                    };
                    
                    calcular4.operacionesArit(n1, n2);
                    break;
            }
            
        } while (menuP < 5);
    }
}

