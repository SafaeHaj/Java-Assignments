package practice.inheritance.contentmanagementsystem;

public class Viewer extends User {
    public Viewer(int userId, String username) {
        super(userId, username);
    }

    @Override
    public void viewProfile() {
        System.out.println("Viewer Profile: " + username);
    }
    
    public void viewContent(Content content) {
        System.out.println(username + " is viewing content:");
        content.display(); 
    }
}
