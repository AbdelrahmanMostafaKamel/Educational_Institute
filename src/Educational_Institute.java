public class Educational_Institute {
    private String name;
    private Student[] students;
    private Instructor[] instructors;
    private Administrator[] admins;

    public Educational_Institute(String name, Student[] students, Instructor[] instructors, Administrator[] admins) {
        this.name = name;
        this.students = students;
        this.instructors = instructors;
        this.admins = admins;
    }

    public Educational_Institute() {
        name = null;
        students = new Student[500];
        instructors = new  Instructor[100];
        admins = new Administrator[500];
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Student[] getStudents() {
        return students;
    }

    public Instructor[] getInstructors() {
        return instructors;
    }

    public Administrator[] getAdmins() {
        return admins;
    }
}