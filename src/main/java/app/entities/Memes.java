package app.entities;

public class Memes {
    private Long id;
    private String name;
    private byte[] imageData;
    private String imageFileName;

    public Memes() {

    }


    public Memes(Long id, String name, byte[] imageData, String imageFileName) {
        this.id = id;
        this.name = name;
        this.imageData = imageData;
        this.imageFileName = imageFileName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public byte[] getImageData() {
        return imageData;
    }

    public void setImageData(byte[] imageData) {
        this.imageData = imageData;
    }

    public String getImageFileName() {
        return imageFileName;
    }

    public void setImageFileName(String imageFileName) {
        this.imageFileName = imageFileName;
    }
}
