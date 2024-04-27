// ALL THE CJAVA CODE I KNOW //
// to run code just click run (or with compile) or in terminal insert "java <filenale.java>"

// ________INTRO_______________
public class All_Java_syntaX { // main class (the main function needs to have the same name as the .java file name to work ) if public if not does not need to be
}

//hello_world_statements.java
public class hello_world_statements { // publi
    public static void main(String[] args) {// here we declare a new public class (more later)
        System.out.println("Hello, World\n"); // that is print() function
        // as u can see above JAVA is case sensitive so you need to be mindefull about lowe/upper case letters
        int a = 5; // every statement needs to eneded with ;
        int b = 10;
        int sum = a + b;
        
        System.out.println ("The sum of " + a + " and " + b+ " is: "+ sum); 
    } 
};

//using_quots.java
class using_quots { 
    public static void main(String[] args) {
        System.out.println("Points"); //text needs to be in ""
        System.out.println(500); // nubmers (int) does not need ""
        System.out.println(500.2); // folating point is a .
    }
}

//println_method.java
class println_method { 
    public static void main(String[] args) {
        System.out.println("hello"); // println method is used to output line of text/numers 
    }
}


//_______JAVA PROGRAM STRUCTURE__________
//java_program_structure.java
class demo { // every elemtnst of the java code needs to be inside of a class, classes code needs to be within { <code> }
    public static void main (String[] args){ // a main method is a entry/start point of a application // the same as a class it needs { at star and end}
        // for the aplication to run a main method needs to be declared as writen above 
        System.out.println ("hello");
    }

}


//______________VARIABLES_______________
class Variables { 
    public static void main(String[] args) {
        String name; // Variables can be declared as show here
        name = "James"; // you can assingne the varibels values as so 
        String name1 = "Tom";// you can assigne values to a variables while declaring a variable  

        System.out.println (name); 
        System.out.println (name1); 
    } 
};