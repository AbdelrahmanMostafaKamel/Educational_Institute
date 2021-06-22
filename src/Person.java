public class Person {
    protected String name;
    public Person(String name){
        this.name=name;
    }
    public Person(){
        name=null;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
