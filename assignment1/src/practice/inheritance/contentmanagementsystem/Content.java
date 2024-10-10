package practice.inheritance.contentmanagementsystem;

public abstract class Content {
 protected int contentId;
 protected String title;
 protected String author;

 public Content(int contentId, String title, String author) {
     this.contentId = contentId;
     this.title = title;
     this.author = author;
 }

 public int getContentId() {
	return contentId;
}

public void setContentId(int contentId) {
	this.contentId = contentId;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}

public abstract void publish();
 public abstract void edit();
 public abstract void delete();
 public abstract void display();
}
