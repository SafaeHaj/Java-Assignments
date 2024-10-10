package practice.inheritance.contentmanagementsystem;

public class Podcast extends Content {
    private String audioFile;
    private String[] hosts;

    public Podcast(int contentId, String title, String author, String audioFile, String[] hosts) {
        super(contentId, title, author);
        this.setAudioFile(audioFile);
        this.hosts = hosts;
    }

    @Override
    public void publish() {
        System.out.println("Publishing podcast: " + title);
    }

    @Override
    public void edit() {
        System.out.println("Editing podcast: " + title);
    }

    @Override
    public void delete() {
        System.out.println("Deleting podcast: " + title);
    }

    @Override
    public void display() {
        System.out.println("Podcast Title: " + title + "\nHosts: " + String.join(", ", hosts));
    }

	public String getAudioFile() {
		return audioFile;
	}

	public void setAudioFile(String audioFile) {
		this.audioFile = audioFile;
	}
}
