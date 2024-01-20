package SingletonPattern;

public class SingletonLazy {

    private static SingletonLazy object;

    public static  SingletonLazy getInstance(){
        if(object==null){
            object=new SingletonLazy();
        }
        return object;
    }

    public void getObjectRef(){
        System.out.println(object);
    }
}
