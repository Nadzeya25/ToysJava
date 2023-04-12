package toystore;

import java.util.Objects;
import java.util.UUID;
public class Toy {

    private final UUID id;
    private String nameToy;
    private int weightToy;
    private int countToy;

    public Toy(UUID id, String nameToy, int weightToy, int countToy) {
        this.id = id;
        this.nameToy = nameToy;
        this.weightToy = weightToy;
        this.countToy = countToy;
    }


    public UUID getId() {
        return id;
    }
    public String getNameToy() {
        return nameToy;
    }
    public void setNameToy(String nameToy) {
        this.nameToy = nameToy;
    }



    public int getWeightToy() {
        return weightToy;
    }
    public void setWeightToy(int weightToy) {
        this.weightToy = weightToy;
    }
    public int getCountToy() {
        return countToy;
    }
    public void setCountToy(int countToy) {
        this.countToy = countToy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Toy toy)) return false;
        return getWeightToy() == toy.getWeightToy() && getCountToy() == toy.getCountToy() && Objects.equals(getId(), toy.getId()) && Objects.equals(getNameToy(), toy.getNameToy());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNameToy(), getWeightToy(), getCountToy());
    }

    @Override
    public String toString() {
        return "игрушка № " + id + ", наименование: " + nameToy + ", категория розыгрыша: " + weightToy + ", количество: " + countToy;

    }

    public void printInfo(){
        System.out.println(this);
    }
}