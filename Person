//Author: bernblend       11/02/16
/*This program shows a variable being passed by reference 
(the change is being done to the variable, not just the 
value, like when 'passing by value')*/
public class Person{
    private String name;
    private int age;
    
    Person(String n){
        this.name = n;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int a){
        this.age = a;
    }
    
}




class MyClass{
    public static void main(String[] args){
        Person j;
    	  j = new Person("John");
		  j.setAge(20);
		  celebrateBirthday(j);
		  System.out.println(j.getAge());
    }
    static void celebrateBirthday(Person p){
	     p.setAge(p.getAge()+1);    //get the age, increment, then set it.
    }	
    
}
