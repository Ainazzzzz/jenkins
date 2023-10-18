public class Animal {
    private long id;
    private String name;

    public Animal(long id, String name) {
        this.id = id;
        this.name = name;
    }

  

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
