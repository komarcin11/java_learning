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
        //print() method will not move to the next line
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


//___________VARIABLES TYPES________________
// as in other programing languages there are couple of Variable types
class Variable_types { 
    public static void main(String[] args) {
        int i = 1; // ints (full nubmers) ex. -2 0 20
        double d = 25.2; // double which is a floating point number like 2.5
        float f = 25.2f; // float is a the same as a double but needs to be writen with a "f" ant the end
        //float takes up half the memory but is less precise/ if speed is the key use float if percision use double 
        char c = 'c'; //chars - single letters need to wreinten in single '*' not "*"
        boolean b = false; // can only have false or true value to be use in conditions 
    } 
};


//__________________MATH______________________
// math operator that are standart and available are + - / * and % below some examples
class Math_Operator{ 
    public static void main(String[] args) {
        int a = 8;
        int b = 3;
        double c = 25.2;
        double d = 256.1;

        //addition
        double e = d + c; // addition that can be stored in another variable 
        System.out.println(a+b); 

        // concatinnation
        String f = "tom";
        String g = " bob";
        System.out.println(f+g); // concatination is a proces to connect two string 

        // multiplicaiton
        System.out.println(a*0.2); // if you multiply by a double (which is the default variable type for floating points) the resault will be a dobule 

        // diviion 
        System.out.println(a/b); // if you divide two int the resaul would be a int
        System.out.println(a/c); // if you divide by at least one double

        // modulo % return the amount waht is left from the division
        System.out.println(a%b);
    } 
};


//_______________COMMENTS____________________
// if you want to inser a single line comment u use // 
/*if you want tu use a multiple line comment 
 * u can use as shown */


//_________________INPUT_____________________
//input_from_user.java
import java.util.Scanner; // to use impot it is essencial to import the Scanner class
class input_from_user{ 
    public static void main(String[] args) {
        Scanner sc = new // after importing the Scanner class we need to create a Scanner obj. // no need for ; at the end of the line
        Scanner(System.in);
        Scanner ss = new Scanner(System.in); // you can combine the lines in to one line the above

        //inputing a string 
        System.out.print("what is your name : ");
        String name = sc.nextLine();
        System.out.println("hello, "+ name+".");

        //inputing a int 
        System.out.print("what is your age : ");
        int age = sc.nextInt();
        System.out.println("good to know that your age is: "+ age+".");
        // as you can see one Scanner obj. can be used for multiple imputs
    } 
};


//____________CONDITIONALS_________________
// if (conditions) // the following comparison operators can be used for conditions == >= <= > < !=
//first_conditionlas.java
import java.util.Scanner;
class first_conditionlas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("what is your age : ");
        int age = sc.nextInt();

        if(age < 18){ // here is the conditionals statement 
            System.out.println("you are underaged"); // and here is the code block that is executed when the if statement is true 
        }
        else if (age >= 18 && age<80){
            System.out.println("you are of age");
        }
        else{
            System.out.println("you are a senior");
        }
    }
}


//_____________SWITCH_______________
//switch_statement.java
//is a conditional that compare the variable to values and if the values are equal it will execute the code block in the indent and up to a break keyword
class switch_statement{
    public static void main(String[] args) {
        int day = 2;
        switch(day){// here we assinge in the () what variable is commpared
            case 1:// here is the first case that the variable is compared to 
                System.out.println("First case");
                break;// essential if you would not the code block in other case code indents to execute
            case 2:
                System.out.println("second case");
                break;
            case 3:
                System.out.println("third case");
                break;
            default: // you can define a default case if that would be executed if other cases wouldnt
                System.out.println("default case");
                break;
        }
    }
}


//_______________MULTIPLE CONDITIONS__________________
// to put in one if statement multiple conditions you need to used ands and ors
// && is and, || id or, ! is not
//multiple_conditions.java
class multiple_conditions{
    public static void main(String [] args){
        String country = "US";
        int age = 43;
        if((country=="US" || country == "GB") && ((age>0 && age < 100)) && (!(age<18))){// u can use () to compartmentalise your conditions
            System.out.println(" Allowed");
        }
    }
}


//________________WHILE LOOPS______________
//while_loops.java
class while_loops{
    public static void main(String [] args){
      int x = 10;
      while(x>0){//the folowing syntax is appled to executed

        System.out.println(x);
        x--; // is the same as x=x-1 or x-=1
      }
    }
}


//__________________FOR LOOP___________
//for_loops.java
class for_loops{
    public static void main(String [] args){
        for (int i=1; i<10;i++){ // for loop syntaX
            if(i==4){
                continue;// continue will move one to the begining of the while loop// in resault number 4 will not be printed
            }
            else if (i==9){
                break; // break key word will break the while loop// therefore the 1 number will not printed
            }
            System.out.println(i);
        }
    }
}