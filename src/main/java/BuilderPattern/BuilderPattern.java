package BuilderPattern;

class User{

    //Required Parameters
    String name;
    int age;

    //Optional Parameter
    String city;

    User(UserBuilder userBuilder){
        this.name= userBuilder.name;
        this.age= userBuilder.age;
        this.city= userBuilder.city;
    }

    /** Only getters as setters could be exposed and that will cause objects to be mutable**/
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    /** Can create a different class as well **/
    public static class UserBuilder{

        //Required Parameters
        String name;
        int age;

        //Optional Parameter
        String city;

        /** Builder Constructor to set required fields
             No return type
         **/
        UserBuilder(String name, int age){
            this.age=age;
            this.name=name;
        }
        /** Builder setter to set optional fields
            builder return type
         **/
        UserBuilder setCity(String city) {
            this.city = city;
            return  this;
        }

        /** returns builder object by calling its constructor
            user return type**/
        User builder(){
            return new User(this);
        }
    }

}

public class BuilderPattern {

    public void func() {
        User user = new User.UserBuilder("shammi", 26).setCity("ranchi").builder();
        System.out.println(user.getName()+" "+user.getCity());
    }

}

/**
 * Useful when too many fields in the constructor and only few are required
 */
