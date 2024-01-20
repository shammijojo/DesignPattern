package CompositeDesignPattern.FileSystemWithCDP;

import java.util.List;

public class Directory implements FileSystem{

    private String name;
    private List<FileSystem> files;


    public Directory(String name, List<FileSystem> files) {
        this.name = name;
        this.files = files;
    }


    @Override
    public void ls() {
        System.out.println("Directory name : "+name);

        for(FileSystem file : files) {
            file.ls();
        }
    }
}
