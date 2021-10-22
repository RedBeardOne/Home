package lessomsix.someclasses;

public class Human {
    int weight;
    String color;
    String species;

    public Human(int weight, String color, String species) {
        this.weight = weight;
        this.color = color;
        this.species = species;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Human human = (Human) o;

        if (weight != human.weight) return false;
        if (color != null ? !color.equals(human.color) : human.color != null) return false;
        return species != null ? species.equals(human.species) : human.species == null;
    }

    @Override
    public int hashCode() {
        int result = weight;
        result = result + (color != null ? color.hashCode() : 0);
        result = result + (species != null ? species.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Human  weight: " + weight + " color of skin: " + color + " species: " + species;
    }
}
