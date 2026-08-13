class StudentNew{
    String name;
    int marks;

    String getResult(){
        if (marks >= 40){
            return "You scored " + marks + ", You are Pass";
        }
        else{
            return "You scored " + marks + ", You are Fail, Score at-least 40 to Pass";
        }
    }
}

public class PM6_PassOrFailMethod {
    public static void main(String[] args) {
        StudentNew s1 = new StudentNew();
        StudentNew s2 = new StudentNew();

        s1.name = "Rahul";
        s1.marks = 39;

        s2.name = "Akash";
        s2.marks = 69;

        String ress1 = s1.getResult();
        String ress2 = s2.getResult();

        System.out.println(ress1);
        System.out.println(ress2);

    }
}
