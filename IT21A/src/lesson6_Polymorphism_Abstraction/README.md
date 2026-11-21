Lesson 6 – Polymorphism and Abstraction

-Polymorphism: Notification System
The Notification System demonstrates how polymorphism works in Java. It has one parent class called 'Notification' and two child classes named 'EmailNotification' and 'SMSNotification'.
Both child classes have their own version of the sendNotification() method. The email class displays a message about sending an email, while the SMS class displays a message about sending a text notification.

-How Polymorphism Works in My Code
In my program, the parent class is Notification, while the child classes are EmailNotification and SMSNotification.
I used 'extends' to allow both child classes to inherit from the parent class. I also used '@Override' to give each child class its own implementation of the sendNotification() method.
Polymorphism happens when I use a Notification reference to hold different child objects. For example, the same reference can point to an EmailNotification object and then an SMSNotification object. When I call sendNotification(), Java automatically executes the method belonging to the actual object.
This shows that one method can perform different actions depending on which object is using it.

-Abstraction: Banking System
The Banking System demonstrates abstraction using a bank account scenario. It has an abstract parent class called 'BankAccount' and two child classes named 'SavingsAccount' and 'CurrentAccount'.
The program calculates interest based on the type of account. The savings account uses a sample interest rate of 5%, while the current account uses a sample rate of 2%. Both accounts can also display the account holder's name and current balance.

-How Abstraction Works in My Code
In my program, BankAccount is the abstract class. It contains the abstract method calculateInterest() and the regular method displayBalance().
The abstract method does not have a body in the parent class because each type of account has its own way of calculating interest.
The child classes, SavingsAccount and CurrentAccount, extend BankAccount and provide their own implementations of calculateInterest().
The displayBalance() method is already complete in the parent class, so both child classes can use it without writing the same code again.
This makes the program more organized because the common features are placed in one class, while the specific calculations are handled by the child classes.

-Difference Between Polymorphism and Abstraction
For me, polymorphism and abstraction are both useful in organizing Java programs, but they have different purposes.
Polymorphism allows one method to behave differently depending on the object that calls it. In my Notification System, the sendNotification() method produces a different message for email and SMS notifications.
Abstraction focuses on hiding implementation details and showing only the important features. In my Banking System, the BankAccount class defines what an account should do, while the child classes decide how to calculate their interest.

-Following Questions:
1. Why is method overriding important in polymorphism? What happens if a child class does not override the parent's method?
Method overriding allows child classes to have their own actions using the same method name. If a child class does not override the method, it will just use the parent's method instead

2. Why can't we create an object directly from an abstract class? What is the purpose of this restriction?
We cannot create an object directly from an abstract class because it may contain methods that do not have complete implementations. The purpose of this restriction is to make sure that objects are created from child classes that provide the required implementations. In my Banking System, I create SavingsAccount and CurrentAccount objects instead of creating a BankAccount object directly.

3. If you need to add another child class to your polymorphism program, how would your existing code handle it?
I can add another child class that extends the parent class and overrides the same method. For example, I can add a PushNotification class without changing the existing email and SMS classes

4. Can polymorphism and abstraction work together in a single program? Explain how and provide an example.
Yes, they can work together. For example, an abstract Notification class can have a sendNotification() method. Its child classes, such as email and SMS, can implement the method differently. This uses abstraction and polymorphism in one program.

5. As a future programmer, when would you use polymorphism, and when would you use abstraction?
As a future programmer, I would use polymorphism when different objects need to perform different actions using the same method. 
I would use abstraction when I want to create a common structure for related classes and let each child class handle its own specific tasks
