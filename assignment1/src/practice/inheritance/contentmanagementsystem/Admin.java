package practice.inheritance.contentmanagementsystem;

public class Admin extends User {
    public Admin(int userId, String username) {
        super(userId, username);
    }

    @Override
    public void viewProfile() {
        System.out.println("Admin Profile: " + username);
    }

    public void deleteContent(Content content) {
        content.delete();
        System.out.println("Content deleted by admin: " + content.getTitle());
    }
}
