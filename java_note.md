# Python Usage
* How to check if a directory exists and create it if necessary?
```
if not os.path.exists(directory):
    os.makedirs(directory)
```
[http://stackoverflow.com/questions/273192/how-to-check-if-a-directory-exists-and-create-it-if-necessary]

# Java Usage
## LinkedList & Queue
* Throw Exception
  * add(): throws exception
  * add(int index, E element)
	* remove()
	* element()

* Not Throw Exception
  * offer(): add
  * poll(): remove, returns null if this list is empty
	* peek()

* Use LinkedList to initialize Queue
```
Queue<T> queue = new LinkedList<T>();
```

* Personally prefer to use add(), remove(), and peek(), poll()

* PriorityQueue: The head of this queue is the least element with respect to the specified ordering.
	* Constructor:
		* PriorityQueue(),
		* PriorityQueue(int initialCapacity, Comparator<? super E> comparator)
	* Operations:
		* add()
    * remove()
		* peek()
		* poll() - Retrieves and removes the head of this queue, or returns null if this queue is empty,
    * clear()

## ArrayList
* remove()
* Replace at certain place: set(index, ele)

## Stack
* push(), pop(), peek()

## StringBuilder
* Get char: charAt()
* Set char: setCharAt(int index, char ch)
* Delete char: deleteCharAt()
* Get length: length() NOT size()

## Thread safe
* Hashtable is thread safe
* HashMap and HashSet is not thread safe

# Concepts and Comparison
## Abstract Class
* An abstract class is a class that is declared abstract.
* An abstract class does not have to include abstract methods.
* An abstract class can have concrete methods.
* If a class include any abstract methods, it has to be declared as abstract class.
* Abstract classes cannot be instantiated, but can be subclassed.
* The Subclasses can either implement the abstract methods or not. But if not, the subclasses have to be declared as abstract as well.
* A class must be declared abstract if any of the methods in that class are abstract.

## Interface
* Interface can have default method with a body.
* We can have an interface B extends another interface B, so that B can extends A's behaviors without force any classes implements A to implements the new behaviors. So the users of those classes can choose to implements A or B.
```
public interface DoItPlus extends DoIt {

   boolean didItWork(int i, double x, String s);

}
```

## Abstract Class vs. Interface
* Reference https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html
* Reference https://docs.oracle.com/javase/tutorial/java/concepts/interface.html
* Reference http://www.programmerinterview.com/index.php/java-questions/interface-vs-abstract-class/
### Similarities
* Both can have a number of abstract and concrete methods.
* Both cannot be instantiated.
### Differences
* In abstract classes we can declare fields that are not static and final, and define public, protected, and private concrete methods.
* In interface, all fields are automatically *public*, *static*, and *final*, and all methods that you declare or define (as default methods) are *public*. This means in interface there could be some final interface specific fields accessed by everyone, while in abstract class there could not be such things.
* The subclass derived from an abstract class can either implement all the abstract methods and make itself a concrete class, or not implement some or all abstract methods and declare itself as a abstract class as well.
* The class implements an interface has to implement all the methods in the interface.
### When to choose abstract class

### When to choose interface

## Final vs. Finally vs. Finalize
### _Final_
* For primitive variable, it means the variable cannot change.
* For reference variable, it means it cannot point to any other object on the heap.
* For a method, it means it cannot be overridden.
* For a class, it means it cannot be subclassed.

### _Finally_
* _try_, _catch_, _finally_ blocks. The finally block will always be executed (except if JVM exits from the try block). It is used to place the clean up code.

### _Finalize_
* It is called by garbage collector thread before reclaiming the memory allocated to the object, but it is not guaranteed. Do not use it.

## String vs. StringBuilder vs. StringBuffer
* String is immutable
* StringBuilder and StringBuffer are mutable.
* StringBuffer is synchronized so it is thread safe
* StringBuilder is not synchronized so it is not thread safe

## Hashtable vs. HashMap
* HashTable is synchronized and thread safe. Slow.
* HashMap is non synchronized and not thread safe. Fast.
* Hashtable does not allow null keys and null values.
* HashMap allows one null key and any number of null values, while
* Hashtable is a subclass of Dictionary class which is obsolete in Jdk 1.7. It is better off externally synchronizing a HashMap or using ConcurrentHashMap.
* But both Hashtable and HashMap implement _Map_ interface.

## Vector vs. ArrayList
* Vector is synchronized. Slow.
* ArrayList is not synchronized.
* Vector is not part of Collection. Old implementation, avoid.

# Code Snippets
## Three Ways to Compare in Java
* Define a comparator object
```
Comparator<ListNode> comp = new Comparator<ListNode>() {
    @Override
    // The override method is: int compare(T t1, T t2).
    public int compare(T t1, T t2) {
        if (t1.val < t2.val) {
            return -1;
        }
        else if (t1.val == t2.val) {
            return 0;
        }
        else {
            return 1;
        }
    }
}; // Don’t forget the last semicolon mark.
```

* Define a comparator class implements *Comparator* interface. Create a comparator of that class.
```
private class MyComparator implements Comparator<T> {
  	@Override
    public int compare(T t1, T t2) {
        if (t1.val < t2.val) {
            return -1;
        }
        else if (t1.val == t2.val) {
            return 0;
        }
        else {
            return 1;
        }
    }
}
```

* Let the elements implements *Comparable* interface
```
public class Element implements Comparable<T> {
    @Override
    public int compareTo(T t) {
        if (this == t) {
            return 0;
        }

        if (this.value > t.value) {
            return 1;
        }
        else if (this.value == t.value) {
            return 0;
        }
        else {
            return -1;
        }
    }
}
```


## Override _equals()_ method?
```java
@Override
public boolean equals(Object obj) {
  // Check shallow
  if (obj == this) {
    return true;
  }

  // Check class name
  if (obj == null || obj.getClass() != this.getClass()) {
    return false;
  }

  // Check deep
  Point2D myPoint2D = (Point2D) obj;
  return this.x == myPoint2D.x && this.y == myPoint2D.y;
}
```

# Table
## Access Levels
| Modifier    | Class | Package | Subclass | World |
| ----------- | ----- | ------- | -------- | ----- |
| public      | Y     | Y       | Y        | Y     |
| protected   | Y     | Y       | Y        | N     |
| no modifier | Y     | Y       | N        | N     |
| private     | Y     | N       | N        | N     |


* How to override hashCode() method?
	1. Store some constant nonzero value, say, 17, in an int variable called result.
	2. For each significant field f in your object (each field taken into account by the equals method, that is), do the following:
		a. Compute an int hash code c for the field:
			i. If the field is a boolean, compute (f ? 1 : 0).
			ii. If the field is a byte, char, short, or int, compute (int) f.
			iii. If the field is a long, compute (int) (f ^ (f >>> 32)).
			iv. If the field is a float, compute Float.floatToIntBits(f).
			v. If the field is a double, compute Double.doubleToLongBits(f), and then hash the resulting long as in step 2.a.iii.
			vi. If the field is an object reference and this class’s equals method compares the field by recursively invoking equals, recursively invoke hashCode on the field. If a more complex comparison is required, compute a “canonical representation” for this field and invoke hashCode on the canonical representation. If the value of the field is null, return 0 (or some other constant, but 0 is traditional).
			vii. If the field is an array, treat it as if each element were a separate field. That is, compute a hash code for each significant element by applying these rules recursively, and combine these values per step 2.b. If every element in an array field is significant, you can use one of the Arrays.hashCode methods added in release 1.5.
		b. Combine the hash code c computed in step 2.a into result as follows:
			result = 31 * result + c;
	3. Return result.

* Convert String to Int
	Integer.parseInt(str);

* Hashtable vs. ConcurrentHashMap
	Both are thread safe, but ConcurentHashMap has better performance. When you read from a ConcurrentHashMap using get(), there are no locks, contrary to the HashTable for which all operations are simply synchronized.

	HashMap is the best thing to use in a single threaded application.

	Hashtable is old, ConcurrentHashMap in Java 5+.


* Thread pool: a number of threads are created to perform a number of tasks. Typically, there are many more tasks than threads. As soon as a thread completes its task, it will request the next task from the queue until all tasks have been completed. The thread can then terminate, or sleep until there are new tasks available.

* Database connection pool: a cache of database connections maintained so that the connections can be reused when future requests to the database are required.



* Java stack and heap

* Java GC

* JVM 优化
