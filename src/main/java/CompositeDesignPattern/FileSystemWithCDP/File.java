package CompositeDesignPattern.FileSystemWithCDP;

public class File implements FileSystem {

    private String filename;

    public File(String filename) {
        this.filename = filename;
    }

    @Override
    public void ls() {
        System.out.println("Filename : "+filename);
    }
}
