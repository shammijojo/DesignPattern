package CompositeDesignPattern.FileSystemWithoutCDP;

public class File {

    private String filename;

    public File(String filename) {
        this.filename = filename;
    }

    public void ls() {
        System.out.println("Filename : " + filename);
    }

}
