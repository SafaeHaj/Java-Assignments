package practice.inheritance.contentmanagementsystem;

public class Video extends Content {
    private int duration; 
    private String quality; 

    public Video(int contentId, String title, String author, int duration, String quality) {
        super(contentId, title, author);
        this.duration = duration;
        this.quality = quality;
    }

    @Override
    public void publish() {
        System.out.println("Publishing video: " + title);
    }

    @Override
    public void edit() {
        System.out.println("Editing video: " + title);
    }

    @Override
    public void delete() {
        System.out.println("Deleting video: " + title);
    }

    @Override
    public void display() {
        System.out.println("Video Title: " + title + "\nDuration: " + duration + " seconds\nQuality: " + quality);
    }
}
