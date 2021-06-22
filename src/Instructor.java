public class Instructor extends Person{
    private int hour;
    private Subject[] courses;
    public Instructor(String name,int hour,Subject[] courses){
        super(name);
        this.hour=hour;
        this.courses=courses;
    }
    public Instructor(){
        name=null;
        hour=0;
        courses=null;
    }
    public void setOfficeHours(int hour){
        this.hour=hour;
    }
    public int getOfficeHours(){
        return hour;
    }
    public  Subject[] getCourses(){
        return courses;
    }
    public void displayInfo(){
        System.out.println("The instructor name is "+name);
        System.out.println("Subjects he teaches are:");
        Subject[] courses;
        courses=getCourses();
        int total=0;
        for(Subject course:courses){
            total+=course.getGrade();
            System.out.println(course.getSubjectName());
        }
        System.out.println("Instructor office hours is "+hour+"PM");
        System.out.println("Students total grade is "+total);
    }
}
