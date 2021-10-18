public class Tiger extends Felime {
    protected Tiger(String numeAnimal, String tipAnimal, Double greutateAnimal, String habitat) {
        super(numeAnimal, tipAnimal, greutateAnimal, habitat);
    }

    @Override
    protected void sunetProdus() {
        System.out.println("Roar!!!");
    }

    @Override
    protected void mananca(Food mancare) {
        this.seteazaAlimentatiaAnimalului(this.obtineAlimentatiaAnimalului() + mancare.obtineCantitatea());
    }
}
