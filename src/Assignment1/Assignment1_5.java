package Assignment1;

public class Assignment1_5 {
    public static void main(String[] args){
        String[] patient_age={"90","98","50","12","34","6","2","39","67","24"};
        int child=0,teen=0,adult=0,senior=0;
        for(String ages:patient_age){
            int age=Integer.parseInt(ages);
            if (age < 18) {
                child++;
            } else if (age>=18 && age <30) {
                teen++;
            } else if (age >=30 && age <60) {
                adult++;
            } else {
                senior++;
            }
        }
        double child_percentage=((double) child / patient_age.length)*100;
        double teen_percentage = ((double)teen / patient_age.length) * 100;
        double adult_percentage=((double)adult/ patient_age.length)*100;
        double senior_percentage=((double)senior/ patient_age.length)*100;
        System.out.println("Number of patients is "+patient_age.length);
        System.out.println("Number of children in the hospital is "+child);
        System.out.println("Number of teenager in the hospital is "+teen);
        System.out.println("Number of adult in the hospital is "+adult);
        System.out.println("Number of senior citizen in the hospital is "+senior);
        System.out.println("Child percentage is "+child_percentage);
        System.out.println("Teen percentage is "+teen_percentage);
        System.out.println("Adult percentage is "+adult_percentage);
        System.out.println("Senior percentage is "+senior_percentage);
        }
    }

