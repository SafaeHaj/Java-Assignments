package practice.inheritance.contentmanagementsystem;

public class Article extends Content {
    private String textBody;
    private String summary;

    public Article(int contentId, String title, String author, String textBody, String summary) {
        super(contentId, title, author);
        this.textBody = textBody;
        this.summary = summary;
    }

    @Override
    public void publish() {
        System.out.println("Publishing article: " + title);
    }

    @Override
    public void edit() {
        System.out.println("Editing article: " + title);
    }

    @Override
    public void delete() {
        System.out.println("Deleting article: " + title);
    }

    @Override
    public void display() {
        System.out.println("Article Title: " + title + "\nSummary: " + summary + "\nBody: " + textBody);
    }
}
