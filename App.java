import java.util.Scanner;



public class App{

    static Coffee coffee = new Coffee( 400, 540, 120, 10 , 500);
    final static Scanner scanner = new Scanner(System.in);

    static void elegirCafe(){
        String elegirCafe;
        TipoCafe tipoCafe;
        do {
        System.out.println("Elegir tipo cafe : 1 - Espresso, 2 - Latte, 3 - Cappuccino, regresar - a menu principal");
        elegirCafe = scanner.next();

        if(elegirCafe.equals("regresar")){
            return;
        }
        tipoCafe = TipoCafe.encontrarPorId(Integer.parseInt(elegirCafe));

        switch (tipoCafe) {
            case ESPRESSO:
                Coffee espresso = new Espresso();
                coffee.prepararCafe(espresso);
                break;
            case LATTE:
                Coffee latte = new Latte();
                coffee.prepararCafe(latte);
                break;
            case CAPPUCINO:
                Coffee Cappuccino = new Cappuccino();
                coffee.prepararCafe(Cappuccino); 
                break;
            default:
                break;
        }

        } while (tipoCafe.name().equals("NOT_FOUND"));
    }

    static void llenarIngredientes(){
        System.out.println("Ingresar cantidad de agua");
        int water = scanner.nextInt();
        System.out.println("Ingresar cantidad de leche");
        int milk = scanner.nextInt();
        System.out.println("Ingresar cantidad de granos de cafe");
        int coffeeBains = scanner.nextInt();
        System.out.println("Ingresar cantidad de vasos");
        int cups = scanner.nextInt();
        coffee.llenarCafetera(water, milk, coffeeBains, cups);
        
    }


    public static void main(String[] args){
        System.out.println(coffee.toString());
        String opcion;
        do {
            System.out.println("Escribir accion a realizar : comprar, llenar, retirar, verificar, salir");
            opcion = scanner.next();
            switch(opcion){
                case "comprar":
                    elegirCafe();
                    break;
                case "llenar":
                    llenarIngredientes();
                    break;
                case "retirar":
                    coffee.takeMoney();
                    break;
                case "verificar":
                    System.out.println(coffee.toString());
                    break;
                case "salir":
                break;
                default:
                System.out.println("Opcion no valida");
            }
        } while (!opcion.equals("salir"));
        System.out.println(coffee.toString());
    }
}
