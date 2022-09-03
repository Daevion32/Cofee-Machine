public class Coffee {
    
    private int water;
    private int milk;
    private int coffeeBeans;
    private int cups;
    private int money;

    public Coffee(int water, int milk,  int coffeeBeans, int cups, int money ){
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
        this.cups  = cups;
        this.money = money;
    }

    public Coffee(int water, int milk, int coffeeBeans , int money){
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
        this.money = money;
    }

    public void llenarCafetera(int water, int milk,int coffeeBeans, int cups){
        this.water += water;
        this.milk += milk;
        this.coffeeBeans += coffeeBeans;
        this.cups += cups;
    }

    public void prepararCafe(Coffee coffee){
        if(verificarIngredientes(coffee)){
            System.out.println("Estoy preparando tu cafe");
            this.water -= coffee.water;
            this.milk -= coffee.milk;
            this.coffeeBeans += coffee.coffeeBeans;
            this.cups -= 1;
            this.money += coffee.money;
        }
    }
    public boolean verificarIngredientes(Coffee coffee){
        if(this.water - coffee.water < 0 ){
            System.out.println("Disculpa, no hay agua suficiente para prepara cafe");
            return false;
        }
        if(this.milk - coffee.milk < 0 ){
            System.out.println("Disculpa, no hay leche suficiente para preparar cafe");
            return false;
        }
        if(this.coffeeBeans - coffee.coffeeBeans < 0 ){
            System.out.println("Disculpa, no hay granos de café suficiente para preparar cafe");
            return false;
        }
        if(this.cups == 0 ){
            System.out.println("Disculpa, no hay vasos suficientes para preparar cafe");
            return false;
        }
        return true;
    }

    public void takeMoney(){
        System.out.println("Estas retirando  : " + money + " euros ");
        this.money = 0;  
    }

    @Override
    public String toString() {
        return "\nLa maquina de cafe tiene :\n" +
                water + " ml de agua\n" + 
                milk + " ml de leche\n " + 
                coffeeBeans + " g granos de cafe\n " + 
                cups + " vasos\n " + 
                money + " euros\n ";
    }

 
}

class Espresso extends Coffee{
    public Espresso(){
        super(250, 0, 16, 4);
    }
}
class Latte extends Coffee{
    public Latte(){
        super(350, 75, 20 ,7);
    }
}
class Cappuccino extends Coffee{
    public Cappuccino(){
        super(200, 100, 12, 6);
    }
}