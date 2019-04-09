package interviewquestions;

import java.util.Collection;
import java.util.HashSet;
/*how overloaded methods in java are bonded during compile time using Type information ie. Static binding.*/

/*In above example of static binding in Java we have overloaded sort() method, one of which accept Collection and other accept HashSet.
we have called sort() method with HashSet as object but referenced with type Collection and when we run method with collection as
argument type gets called because it was bonded on compile time based on type of variable (Static binding)  which was collection.*/

public class StaticBindingMethodOverloading {

        public static void main(String args[])  {
            Collection c = new HashSet();
            StaticBindingMethodOverloading et = new StaticBindingMethodOverloading();
            et.sort(c);

        }

        //overloaded method takes Collection argument
        public Collection sort(Collection c){
            System.out.println("Inside Collection sort method");
            return c;
        }


        //another overloaded method which takes HashSet argument which is sub class
        public Collection sort(HashSet hs){
            System.out.println("Inside HashSet sort method");
            return hs;
        }

    }


