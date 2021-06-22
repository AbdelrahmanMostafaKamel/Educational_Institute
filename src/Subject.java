public class Subject {
    private String subjectName;
    private int grade;
    public Subject(String subjectName,int grade){
        this.subjectName=subjectName;
        this.grade=grade;
    }
    public Subject(){
        subjectName=null;
        grade=0;
    }
    public void setSubjectName(String subjectName){
        this.subjectName=subjectName;
    }
    public String getSubjectName(){
        return subjectName;
    }
    public void setGrade(int grade){
        this.grade=grade;
    }
    public int getGrade(){
        return grade;
    }
}
