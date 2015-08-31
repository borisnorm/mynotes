# Java Usage
## LinkedList & Queue
* Throw Exception
  * add(): throws exception
  * add(int index, E element)
	* remove()
	* element()

* Not Throw Exception
  * offer()
  * poll(): returns null if this list is empty
	* peek()

* Personally prefer to use add(), remove(), and peek()

## ArrayList
* remove()
* Replace at certain place: set(index, ele)

## Stack
* push(), pop(), peek()





* How to override equals() method?
See example below,

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

* Access Levels
	Modifier	Class	Package	Subclass	World
	public		Y	Y	Y		Y
	protected	Y	Y	Y		N
	no modifier	Y	Y	N		N
	private		Y	N	N		N

* StringBuilder:
	deleteCharAt()
	length() NOT size()

* PriorityQueue: The head of this queue is the least element with respect to the specified ordering.
	Constructor:
		PriorityQueue(),
		PriorityQueue(int initialCapacity, Comparator<? super E> comparator)

	Operations:
		add(),
		clear(),
		peek(),
		poll() - Retrieves and removes the head of this queue, or returns null if this queue is empty,
		size()

* Queue:
	Initialize: Queue<T> queue = new LinkedList<T>();
	queue.offer(obj);	// Add
	queue.pull();		// Remove

* Convert String to Int
	Integer.parseInt(str);

* How to make a comparator?

        Comparator<ListNode> comp = new Comparator<ListNode>() {
            @Override
            public int compare(ListNode n1, ListNode n2) {
                if (n1.val < n2.val) {
                    return -1;
                }
                else if (n1.val == n2.val) {
                    return 0;
                }
                else {
                    return 1;
                }
            }
        };

	Note: The override method is: int compare(T t1, T t2).
	Note: Don’t forget the last semicolon mark.

* String vs. StringBuilder vs. StringBuffer
	String is immutable, while StringBuilder and StringBuffer are mutable.
	StringBuffer is synchronized so it is thread safe, StringBuilder is not.

* Vector vs. ArrayList
	Vector is synchronized (and thus slow), ArrayList is not
	Vector is not part of Collection
	Vector is old implementation, avoid

* Hashtable vs. HashMap
	HashMap is non synchronized and not thread safe.On the other hand, HashTable is thread safe and synchronized.

	HashMap allows one null key and any number of null values, while Hashtable does not allow null keys and null values.

	HashMap is faster than Hashtable.

	Hashtable is a subclass of Dictionary class which is obsolete in Jdk 1.7.

	It is better off externally synchronizing a HashMap or using ConcurrentHashMap.

	HashMap is the subclass of the AbstractMap class.

	But both Hashtable and HashMap both implements Map interface.


* Hashtable vs. ConcurrentHashMap
	Both are thread safe, but ConcurentHashMap has better performance. When you read from a ConcurrentHashMap using get(), there are no locks, contrary to the HashTable for which all operations are simply synchronized.

	HashMap is the best thing to use in a single threaded application.

	Hashtable is old, ConcurrentHashMap in Java 5+.


* Thread pool: a number of threads are created to perform a number of tasks. Typically, there are many more tasks than threads. As soon as a thread completes its task, it will request the next task from the queue until all tasks have been completed. The thread can then terminate, or sleep until there are new tasks available.

* Database connection pool: a cache of database connections maintained so that the connections can be reused when future requests to the database are required.

* Final vs. Finally vs. Finalize
	Final: 1) for primitive variable, it means the variable cannot change; 2) for reference variable, it means it cannot point to any other object on the heap; 3) for a method, it means it cannot be overridden; 4) for a class, it means it cannot be subclassed.

	Finally: try, catch, finally blocks. The finally block will always be executed (except if JVM exits from the try block). It is used to write the clean up code.

	Finalize: called by garbage collector thread before reclaiming the memory allocated to the object, but it is not guaranteed. Do not use it.

* Java stack and heap

* Java GC

* JVM 优化
