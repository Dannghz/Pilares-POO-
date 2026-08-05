public class MainVeterinaria {
    public static void main(String[] args) {
        
        Animal firulais = new Perro("Firulais", 4);
        Animal michi = new Gato("Michi", 2);
        Animal pajaro = new Pajaro("Pajaro", 1);

        firulais.comer();
        firulais.hacerSonido();
        firulais.perseguirCola();

        System.out.println("---");

        michi.dormir();
        michi.hacerSonido();
        michi.ronronear();
        michi.comer();

        System.out.println("---");

        pajaro.comer();
        pajaro.hacerSonido();
        pajaro.volar();
        pajaro.dormir();
    }

}
