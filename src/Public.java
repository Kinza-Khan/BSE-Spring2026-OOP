
//public Access Modifier
//Visible everywhere: inside the class, package, subclass, and any other class.
//Commonly used for methods that must be accessible globally.
public class Public

{
        public String name;

        public void showName() {
            System.out.println("Name: " + name);
        }

        public static void main(String[] args) {
            Public obj = new Public();
            obj.name = "Kinza";
            obj.showName();  // Works anywhere
        }


}
