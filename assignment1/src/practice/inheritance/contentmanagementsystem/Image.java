package practice.inheritance.contentmanagementsystem;

public class Image {
    private String imageName; 
    private String imagePath; 
    private String description; 
    private String resolution;

    public Image(String imageName, String imagePath, String description, String resolution) {
        this.imageName = imageName;
        this.imagePath = imagePath;
        this.description = description;
        this.resolution = resolution;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public void displayImageDetails() {
        System.out.println("Image Name: " + imageName);
        System.out.println("Image Path: " + imagePath);
        System.out.println("Description: " + description);
        System.out.println("Resolution: " + resolution);
    }
}
