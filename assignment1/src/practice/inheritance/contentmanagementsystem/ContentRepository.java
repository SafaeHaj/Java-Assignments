package practice.inheritance.contentmanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class ContentRepository {
    private List<Content> contentList;

    public ContentRepository() {
        this.contentList = new ArrayList<>();
    }

    public void addContent(Content content) {
        contentList.add(content);
        System.out.println("Added content: " + content.getTitle());
    }

    public void displayAllContent() {
        for (Content content : contentList) {
            content.display();
            System.out.println();
        }
    }
}
