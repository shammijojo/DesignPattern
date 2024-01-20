package SingletonPattern;

public class SingletonSynchronisedMethod {

    private static SingletonSynchronisedMethod object;

    //Make the method synchronised
    // But synchronised is an expensive method and if 100 threads are here, this method will
    //get locked 100 times
    public static synchronized SingletonSynchronisedMethod getInstance(){
        if(object==null){
            object=new SingletonSynchronisedMethod();
        }
        return object;
    }

    public void getObjectRef(){
        System.out.println(object);
    }

}
