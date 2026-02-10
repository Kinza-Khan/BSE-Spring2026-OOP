package Constructors;

public class CopyConstructor {
                int id ;
                String name ;
            CopyConstructor(int sId, String sName){
                this.id =  sId;
                this.name = sName;
            }
            CopyConstructor(CopyConstructor c){
                this.id = c.id;
                this.name = c.name;

            }
            void display(){
                System.out.println("id of student is " + id + " and name of the student is "+ name);
            }
    static void main(String[] args) {
            CopyConstructor obj = new CopyConstructor(1,"sana");
            obj.display();
            CopyConstructor obj2 = new CopyConstructor(obj);
            obj2.display();
    }
}
