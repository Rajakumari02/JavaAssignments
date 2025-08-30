package Assignment3_4;

public class Main {
        public static void main(String[] args) {
            System.out.println("University Course Registration System");

            Professor professor1= new Professor("rK", "rk@gmail.com", 23,"1","EEE");
            Professor professor2=new Professor("Rajakumari", "raji@gmail.com", 45, "2", "Analog");

            Course eceCourse = new Course("Analog", "ANALOG90", professor1);
            Course signalCourse = new Course("DSP", "DSP1", professor2);
            System.out.println("--- Course Information ---");
            eceCourse.displayCourseInfo();
            signalCourse.displayCourseInfo();

            System.out.println("--- Professor Information ---");
            professor1.displayProfessorInfo();
            professor2.displayProfessorInfo();

            Student student1= new Student("Rajakumari", "rk@gmail.com",20,"1");
            Student student2= new Student("Rk", "rk1@gmail.com", 20,"2");
            Student student3= new Student("Raji","raji@gmail.com",21,"3");

            System.out.println("--- Student Registration ---");
            eceCourse.registerStudent(student1);
            signalCourse.registerStudent(student1);
            signalCourse.registerStudent(student2);
            eceCourse.registerStudent(student3);
            signalCourse.registerStudent(student3);
            System.out.println();

            System.out.println("--- Student Information ---");
            student1.displayInfo();
            student2.displayInfo();
            student3.displayInfo();

            System.out.println("Course Name: "+ eceCourse.getCourseName());
            System.out.println("Student count: "+ eceCourse.getStudentCount());
            System.out.println();
            System.out.println("Course Name: "+ signalCourse.getCourseName());
            System.out.println("Student count: "+ signalCourse.getStudentCount());
        }
    }

