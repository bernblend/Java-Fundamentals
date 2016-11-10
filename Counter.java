//Author: bernblend       11/02/16     Java
/*When you declare a variable or a method as static, it belongs to the class,
rather than to a specific instance (object). This means that only one instance 
of a static member exists, even if you create multiple objects of the class, 
or if you don't create any. It will be shared by all objects.*/

public class Counter{
    public static int COUNT=0;
    Counter(){
        COUNT++;
    }
}
    

/*The 'COUNT' variable will be shared by all objects of that class. Now we can create 
objects of our Counter class in main, AND ACCESS THE STATIC VARIABLE.*/


class MyClass{
    public static void main(String[] bErNbLeNd){
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        System.out.println(Counter.COUNT);
        
        System.out.println(c1.COUNT);
        System.out.println(c2.COUNT);
        System.out.println(c3.COUNT);
    }
}   

/*The output is 3, because the COUNT variable is static and gets incremented by one 
each time a new object of the Counter class is created. In the code above, we created 
two objects.

You can also access the static variable using amy object class, such as c1.COUNT
You will get 3 as the output 4 times from the above code, because 'COUNT' is a static variable.*/