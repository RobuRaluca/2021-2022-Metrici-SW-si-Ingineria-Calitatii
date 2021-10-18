public abstract class Food {
    private Integer cantitate;

    protected Food(Integer cantitate) {
        this.cantitate = cantitate;
    }

    protected Integer obtineCantitatea() {
        return cantitate;
    }

    protected void setQuantity(Integer cantitate) {
        this.cantitate = cantitate;
    }
}
