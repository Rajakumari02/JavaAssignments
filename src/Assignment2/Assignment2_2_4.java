package Assignment2;

public class Assignment2_2_4 {
    public static void main(String[] args) {
        char[][] attendance= {
                {'P' , 'P' , 'A' , 'P' , 'L' , 'P' , 'P'},
                {'P' , 'A' , 'A' , 'P' , 'P' , 'P' , 'L'},
                {'P' , 'P' , 'P' , 'P' , 'P' , 'P' , 'P'}
        };
        int employee_no=1;
        for(char[] employee_log:attendance){
            int present=0,absent=0,leave=0;
            for(char employee_attendance:employee_log) {
                if (employee_attendance == 'P') {
                    present++;
                } else if (employee_attendance == 'A') {
                    absent++;
                } else if (employee_attendance == 'L') {
                    leave++;
                }
            }
                System.out.println("Employee" + employee_no + "->" + "P: " + present + "," + "A: " + absent + "," + "L: " + leave);
                employee_no++;
            }
        }

    }

