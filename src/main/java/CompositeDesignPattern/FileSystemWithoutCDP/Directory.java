package CompositeDesignPattern.FileSystemWithoutCDP;

import java.util.List;

public class Directory {

    private String name;
    private List<Object> objects;

    public Directory(String name, List<Object> objects) {
        this.name = name;
        this.objects = objects;
    }


    public void ls() {
        System.out.println("Directory name : " + name);
        for (Object object : objects) {
            /**
            This design pattern removes if-else condition and need of instance of
             **/
            if (object instanceof File) {
                ((File) object).ls();
            } else if (object instanceof Directory) {
                ((Directory) object).ls();
            }
        }
    }


}
