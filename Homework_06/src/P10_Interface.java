public class P10_Interface {
    public static void main(String[] args) {

        NotificationService emailService = new EmailService();
        NotificationService smsService = new SmsService();

        emailService.send("Hello via Email!");
        smsService.send("Hello via SMS!");
    }
}


// Interface
interface NotificationService {
    void send(String message);
}

class EmailService implements NotificationService {

    @Override
    public void send(String message) {
        System.out.println("Sending Email: " + message);
    }
}

class SmsService implements NotificationService {

    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

