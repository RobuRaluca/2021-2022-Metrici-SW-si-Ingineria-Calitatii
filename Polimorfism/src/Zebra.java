public class Zebra extends Mammal {
    public Zebra(String numeAnimal, String tipAnimal, Double greutateAnimal, String habitat) {
        super(numeAnimal, tipAnimal, greutateAnimal, habitat);
    }

    @Override
    protected void sunetProdus() {
        System.out.println("zizizi");
    }

    @Override
    protected void mananca(Food mancare) {
        this.seteazaAlimentatiaAnimalului(this.obtineAlimentatiaAnimalului() + mancare.obtineCantitatea());
    }
}
