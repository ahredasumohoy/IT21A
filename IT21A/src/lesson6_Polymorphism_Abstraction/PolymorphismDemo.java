
package lesson6_polymorphism_abstraction;

// Parent class
class Notification {

    public void sendNotification() {
        System.out.println("Sending a general notification...");
    }
}

// Child class 1
class EmailNotification extends Notification {

    @Override
    public void sendNotification() {
        System.out.println("Sending an email notification to the customer.");
    }
}

// Child class 2
class SMSNotification extends Notification {

    @Override
    public void sendNotification() {
        System.out.println("Sending an SMS notification to the customer.");
    }
}

// Main class
public class PolymorphismDemo {

    public static void main(String[] args) {

        Notification notification;

        notification = new EmailNotification();
        notification.sendNotification();

        notification = new SMSNotification();
        notification.sendNotification();
    }
}
