public class P7_FinalVariable {
    public static void main(String[] args) {
        Exam e = new Exam();

        e.showMaxMarks();
        //e.MAX_MARKS =200; //java: cannot assign a value to final variable MAX_MARKS
        // we cannot change final variable because it defines it self as that i am final thats it no one can change me
    }
}

class Exam{
    final int MAX_MARKS = 100;

    void showMaxMarks(){
        System.out.println(MAX_MARKS);
    }
}

/*
## `Program 7: Final Variable`

Create a class Exam with:
	final variable MAX_MARKS = 100
	method showMaxMarks()

Try to change MAX_MARKS and write the error reason in comments.
 */
