public abstract class Animal {
    private String numeAnimal;
    private String tipAnimal;
    private Double greutateAnimal;
    private Integer alimentatieAnimal;

    protected Animal(String numeAnimal, String tipAnimal, Double greutateAnimal) {
        this.numeAnimal = numeAnimal;
        this.tipAnimal = tipAnimal;
        this.greutateAnimal = greutateAnimal;
        this.alimentatieAnimal = 0;
    }

    protected String obtineNumeleAnimalului() {
        return numeAnimal;
    }

    protected void seteazaNumeleAnimalului(String numeAnimal) {
        this.numeAnimal = numeAnimal;
    }

    protected String obtineTipulAnimalului() {
        return tipAnimal;
    }

    protected void seteazaTipulAnimalului(String tipAnimal) {
        this.tipAnimal = tipAnimal;
    }

    protected Double obtineGreutateaAnimalului() {
        return greutateAnimal;
    }

    protected void seteazaGreutateaAnimalului(Double greutateAnimal) {
        this.greutateAnimal = greutateAnimal;
    }

    protected Integer obtineAlimentatiaAnimalului() {
        return alimentatieAnimal;
    }

    public void seteazaAlimentatiaAnimalului(Integer mancareConsumata) {
        this.alimentatieAnimal = mancareConsumata;
    }

    protected abstract void sunetProdus();

    protected abstract void mananca(Food mancare);
}
