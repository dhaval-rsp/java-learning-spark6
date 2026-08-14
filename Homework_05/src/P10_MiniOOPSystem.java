public class P10_MiniOOPSystem {
    public static void main(String[] args) {

        User s1 = new StudentN("Rahul", "rahul@gmail.com", "MBA");
        User t1 = new Trainer("Akash", "akash@kadam.com", "Math");

        s1.showProfile();
        t1.showProfile();


    }
}

class User{
    private String name;
    private String email;

    User(String name, String email){
        this.name = name;
        this.email = email;
    }

    void showProfile(){
        System.out.println("Your user name is: " + name + " & Your email is: " + email );
    }
}

class StudentN extends User{

    private String courseName;

    StudentN(String name, String email, String courseName) {
        super(name, email);
        this.courseName = courseName;
    }

    @Override
    void showProfile() {
        super.showProfile();
        System.out.println("You are enrolled in course: " + courseName);
    }
}

class Trainer extends User{

    private String subject;

    Trainer(String name, String email, String subject) {
        super(name, email);
        this.subject = subject;
    }

    @Override
    void showProfile() {
        super.showProfile();
        System.out.println("You are taking subject of " + subject);
    }
}

/*
## `Program 10: Mini OOP System`

Create an online learning system.
Parent class:
	User
	- name
	- email
	- constructor
	- showProfile()

Child class 1:
Student extends User
	- courseName
	- constructor
	- showProfile()

Child class 2:
Trainer extends User
	- subject
	- constructor
	- showProfile()

Requirements:
	1. Use super() in child constructors.
	2. Use super.showProfile() inside child showProfile() .
	3. Create one Student object and one Trainer object.
	4. Print both profiles.
 */