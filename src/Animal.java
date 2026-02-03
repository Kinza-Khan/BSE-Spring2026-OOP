public class Animal {
String name ;
int age ;
String species;

// constructor
    Animal(String AnimalName , int AnimalAge , String AnimalSpecies){
            this.age = AnimalAge;
            this.name = AnimalName;
            this.species = AnimalSpecies;
    }
    void  displayInfo(){
        System.out.println("Name "+ name);
        System.out.println("Age "+ age);
        System.out.println("Species " + species);


    }
    void makeSound(){
        if(species.equalsIgnoreCase("Dog")){
            System.out.println(name +" says  Woof Woof");
        }
        else if(species.equalsIgnoreCase("cat")){
            System.out.println(name +" says  Meaow Meaow");
        }
        else{
            System.out.println("Make Sound!");
        }
    }
    public  static  void main(String[] args){
            Animal a1 = new Animal("Max",2 , "dog" );
            a1.displayInfo();
            a1.makeSound();
        Animal a2 = new Animal("Mano",2 , "CAT" );
        a2.displayInfo();
        a2.makeSound();
    }
}
