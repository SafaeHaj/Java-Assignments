package practice.inheritance.contentmanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class ImageGallery extends Content {
    private List<Image> images; 
    public ImageGallery(int contentId, String title, String author) {
        super(contentId, title, author);
        this.images = new ArrayList<>();
    }

    public void addImage(Image image) {
        images.add(image);
    }

    @Override
    public void publish() {
        System.out.println("Publishing image gallery: " + title);
    }

    @Override
    public void edit() {
        System.out.println("Editing image gallery: " + title);
    }

    @Override
    public void delete() {
        System.out.println("Deleting image gallery: " + title);
    }

    @Override
    public void display() {
        System.out.println("Image Gallery Title: " + title);
        for (Image image : images) {
            System.out.println("Image: " + image.getImageName());
        }
    }
}
