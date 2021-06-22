public class Main {
    public static void main(String[] args) {
        Subject[] sub = new Subject[4];
        sub[0] = new Subject("Maths", 60);
        sub[1] = new Subject("English", 70);
        sub[2] = new Subject("French", 85);
        sub[3] = new Subject("Biology", 90);
        Student[] stu = new Student[3];
        Subject[] ahmedSubjects = new Subject[2];
        ahmedSubjects[0] = sub[0];
        ahmedSubjects[1] = sub[1];
        stu[0] = new Student("Ahmed", 1, ahmedSubjects);
        Subject[] alySubjects = new Subject[2];
        alySubjects[0] = sub[2];
        alySubjects[1] = sub[3];
        stu[1] = new Student("Aly", 2, alySubjects);
        Subject[] waelSubjects = new Subject[2];
        waelSubjects[0] = sub[1];
        waelSubjects[1] = sub[2];
        stu[2] = new Student("Wael", 3, waelSubjects);
        Administrator[] admins = new Administrator[2];
        admins[0] = new Administrator("Mr.Hamdy", "01145278641", "Accountant");
        admins[1] = new Administrator("Mr.Mohsen", "01293627761", "HR");
        Instructor[] insList = new Instructor[3];
        Subject[] medhatSubjects = new Subject[2];
        medhatSubjects[0] = sub[0];
        medhatSubjects[1] = sub[2];
        Subject[] sayedSubjects = new Subject[3];
        sayedSubjects[0] = sub[0];
        sayedSubjects[1] = sub[2];
        sayedSubjects[2] = sub[3];
        Subject[] samirSubjects = new Subject[2];
        samirSubjects[0] = sub[1];
        samirSubjects[1] = sub[2];
        insList[0] = new Instructor("Mr.Medhat", 2, medhatSubjects);
        insList[1] = new Instructor("Mr.Sayed", 1, sayedSubjects);
        insList[2] = new Instructor("Mr.Samir", 3, samirSubjects);
        Educational_Institute e1 = new Educational_Institute("Modern School", stu, insList, admins);
        System.out.println("The Educational Institute name is " + e1.getName());
        System.out.println("The number of students enrolled is: " + e1.getStudents().length);
        System.out.println("The students information is as follows:");
        Student[] stuEnrolled = e1.getStudents();
        for (int i = 0; i < stuEnrolled.length; i++) {
            System.out.println("The name of student is " + stuEnrolled[i].getName());
            System.out.println("Courses that student takes are:");
            Subject[] courses = stuEnrolled[i].getCourses();
            for (Subject course : courses) {
                System.out.println(course.getSubjectName());
            }
            System.out.println("The total grades of courses that he takes:" + stuEnrolled[i].totalGrades());
        }
        System.out.println("The number of administrators is: " + e1.getAdmins().length);
        System.out.println("The administrators information is as follows:");
        Administrator[] adminsWork = e1.getAdmins();
        for (int i = 0; i < adminsWork.length; i++) {
            System.out.println("The name of admin is: " + adminsWork[i].getName());
            System.out.println("The contact of admin is: " + adminsWork[i].getContact());
            System.out.println("The role of admin is: " + adminsWork[i].getRole());
        }
        System.out.println("The number of instructors is: " + e1.getInstructors().length);
        Instructor[] insWorks = e1.getInstructors();
        System.out.println("The instructors information is as follows:");
        for (int i = 0; i < insWorks.length; i++) {
            insWorks[i].displayInfo();
        }
    }
}
