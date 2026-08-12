class P9_LoginCheck {
    public static void main(String[] args) {

		// username & password input
		String username = "admin";
		String password = "Testing@1234";

		// checking username first if tru then password validation
		if (username == "adminn") {

			if(password == "Testing@1234"){
				System.out.println("Login Successfully");
			}

			else{
				System.out.println("Incorrect Credentials");
			}
		}
		else{
			System.out.println("User does not exists");
		}
    }
}

/*
Program 9: Login Check
Create:
String username = "admin";
String password = "1234";
If both are correct, print:
Login successful
Otherwise print:
Invalid login
Note: For now, you may use == . Later we will learn .equals() for String comparison.
 */
