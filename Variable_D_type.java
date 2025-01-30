 public class Variable_D_type{//In java variables should be described
 public static void main(String[]args){
//2 steps to creating a variable
//1st declaration 
//2.assignment

int age=20;
int year=2025;
System.out.println(age);
System.out.println(year);
System.out.println(" The year is "  +year);
System.out.println(" The year is " +"year");
 
/* "+" is used to add the two strings 
if it is under double quotes it will print the character which is under
 double quotes ,if it is not under double quotes 
 it will print the value which is assigned to it */
 
int percentage=95;
long population = 7800000000L; 


double price=25.5;//even the num is there in a int type the num is stored in the for of double
//we can convert the double to int or int to double through type casting.
System.out.println( price);
System.out.println ("$:"+price);
System.out.println("Total population in india:"+population);
 
System.out.println(percentage);/*we didnt get any error by changing sequence .
but the of printing will change*/

float cake_price = 19.99f;   // Float
System.out.println("price of cake: "+cake_price);

char grade ='A';
/*char stores only single character.it will throw an error when 
we store multiple character like name eg:srinadh ,
for multiple characters string d_type will be used*/
System.out.println( grade);

char C_1='H';    /*In Java, when you use the + operator with char data types, it does not perform string concatenation.   
                   Instead, it adds the Unicode values (or ASCII values) of the characters.*/
char C_2='I';
System.out.println(C_1+C_2);

char Ch_1 = 'H';
char Ch_2 = 'I';
System.out.println("Wish:"+Ch_1 + Ch_2);//string concetination method:adding two or more string as a  single string by using "" and + operator

String name="Srinadh";
String Fav_food="chicken";
System.out.println(Fav_food);
System.out.println("my fav food is "+ Fav_food);
System.out.println( "wish:"+Ch_1 + Ch_2 +" Iam " +name+" my age is " +age+" and i got a percentage of "+percentage+" in the year "+year+" and my grade is "+grade+ ".I buyed a thumps up for "+price+" Rs and my fav curry is "+Fav_food );
 //this is string concetination means adding two or more string as a  single string by using "" and + operator
 boolean is_Student=false;
 boolean  is_a_Bike=true;
  
    System.out.println("He is Student: " +is_Student);
 
 System.out.println("its a bike: "+is_a_Bike);
}
}

