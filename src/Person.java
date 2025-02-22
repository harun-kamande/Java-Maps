public class Person<T> {
    public int id;
    public String name;

    public Person(int id,String name){
        this.name=name;
        this.id=id;
    }

    @Override
    public String toString() {
        return "Person{id=" + id + ", name='" + name + "'}";
    }
}
