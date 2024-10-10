package practice.inheritance.contentmanagementsystem;

public class CMSApp {
    public static void main(String[] args) {
        Admin admin = new Admin(1, "Leonardo da Vinci");
        Editor editor = new Editor(2, "Michelangelo");
        Viewer viewer = new Viewer(3, "Raphael");

        Content article = new Article(101, "The Evolution of RPGs: From Text-Based to Open World", 
                                      "Leonardo da Vinci", 
                                      "This article explores how RPGs have transformed over the years, highlighting iconic titles like 'Final Fantasy' and 'The Witcher'.", 
                                      "A deep dive into the world of role-playing games.");
        
        Content video = new Video(102, "Top 10 Video Game Soundtracks of All Time", 
                                  "Michelangelo", 
                                  600, 
                                  "1080p");

        Content podcast = new Podcast(103, "Gaming and Pop Culture: A Blend of Worlds", 
                                      "Raphael", 
                                      "gaming_and_pop_culture.mp3", 
                                      new String[]{"Leonardo da Vinci", "Michelangelo", "Raphael"});

        ContentRepository repository = new ContentRepository();

        repository.addContent(article);
        repository.addContent(video);
        repository.addContent(podcast);

        System.out.println("All content in the repository:");
        repository.displayAllContent();

        editor.editContent(article);
        admin.deleteContent(video);
        viewer.viewContent(podcast);

        System.out.println("Remaining content in the repository:");
        repository.displayAllContent();
    }
}
