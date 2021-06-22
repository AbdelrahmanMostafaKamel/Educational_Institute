public class Student extends Person{
    private int id;
    private Subject[] courses;
    public Student(String name,int id,Subject[] courses){
        super(name);
        this.id=id;
        this.courses=courses;
    }
    public Student(){
        name=null;
        id=0;
        courses=null;
    }
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public  Subject[] getCourses(){
        return courses;
    }
    public int totalGrades(){
        Subject[] courses;
        courses=getCourses();
        int total=0;
        for(Subject course:courses){
            total+=course.getGrade();
        }
        return total;
    }
}
