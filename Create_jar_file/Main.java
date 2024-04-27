//creating_a_excutable_jar_file
// 1. Create a java file with your code
// 2. creating a .class file - termina: javac Main.java
// 3. Creating a Manifest.txt for the compiler: ex.: Main-class: Main
// 4. Compile code, terminal: jar -cfvm Main.jar Manifest.txt Main.class // 
// 5. to open, terminal: java -jar Main.jar
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World\n");
        int a = 5;
        int b = 10;
        int sum = a + b;
        
        System.out.println ("The sum of " + a + " and " + b+ " is: "+ sum); 
    } 
};