
public class BroascaTestoasa extends Animal{
    public BroascaTestoasa(String numeAnimal, String tipAnimal, Double greutateAnimal, String habitat) {
        super(numeAnimal, tipAnimal, greutateAnimal);
    }

    @Override
    protected void sunetProdus() {
        System.out.println("oac!");
    }

    @Override
    protected void mananca(Food mancare) {
        this.seteazaAlimentatiaAnimalului(this.obtineAlimentatiaAnimalului() + mancare.obtineCantitatea());
    }
}

