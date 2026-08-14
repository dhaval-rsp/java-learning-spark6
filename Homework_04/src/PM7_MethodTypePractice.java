public class PM7_MethodTypePractice {
    public static void main(String[] args) {
        AllType at = new AllType();
        at.age=18;

        // 1. No parameter and no return value
        at.message();

        // 2. Parameters and no return value
        at.goodMorning("Dhaval");

        // 3. No parameter and a return value
        System.out.println(at.isEligible());

        // 4. Parameters and a return value
        System.out.println(at.add(4,3));
    }
}

class AllType{

    int age;

    // 1. No parameter and no return value
    void message(){
        System.out.println("This is No params + No return type");
    }

    // 2. Parameters and no return value
    void goodMorning(String name){
        System.out.println("This is with Params + No return type, Good Morning " + name);
    }

    // 3. No parameter and a return value
    String isEligible(){

        if(age>=18){
            return "Eligible for vote";
        }
        else {
            return "Note Eligible for vote";
        }
    }

    // 4. Parameters and a return value
    int add(int a, int b){
        return a+b;
    }

}

/*
# Part G: Method-Type Practice

Write one example for each type:
	1. No parameter and no return value
	2. Parameters and no return value
	3. No parameter and a return value
	4. Parameters and a return value

Use a Calculator , Student , or Message class.
 */