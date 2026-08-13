class AllType{
    int age;
    void message(){
        System.out.println("This is No params + No return type");
    }
    void goodMorning(String name){
        System.out.println("This is with Params + No return type, Good Morning " + name);
    }
    String isEligible(){

        if(age>=18){
            return "Eligible for vote";
        }else {
            return "Note Eligible for vote";
        }
        //return "This is No params + Return";
    }
    int add(int a, int b){
        return a+b;
    }

}

public class PM7_MethodTypePractice {
    public static void main(String[] args) {
        AllType at = new AllType();
        at.age=18;

        at.message(); // 1. No parameter and no return value
        at.goodMorning("Dhaval"); // 2. Parameters and no return value
        System.out.println(at.isEligible()); // 3. No parameter and a return value
        System.out.println(at.add(4,3)); // 4. Parameters and a return value
    }
}
