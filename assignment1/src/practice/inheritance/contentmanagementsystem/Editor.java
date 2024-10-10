package practice.inheritance.contentmanagementsystem;

public class Editor extends User {
    public Editor(int userId, String username) {
        super(userId, username);
    }

    @Override
    public void viewProfile() {
        System.out.println("Editor Profile: " + username);
    }

    public void editContent(Content content) {
        content.edit();
        System.out.println("Content edited by editor: " + content.getTitle());
    }
}
