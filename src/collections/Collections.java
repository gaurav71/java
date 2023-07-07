package collections;

import java.util.*;

public class Collections {
    /*
    *   --------Collection Framework's Interface Hierarchy-------
    *
    *                            List
    * Iterable <-- Collection <-- Queue <-- Deque
    *                             Set   <-- SortedSet <-- NavigableSet
    *
    * Map <-- SortedMap <-- NavigableMap
    */

    /*
    *   -------Collection Framework's Interface implementations------
    *
    * List  <-- Vector, ArrayList, Stack, LinkedList (also implements Dequeue)
    * Queue <-- PriorityQueue
    * Set   <-- HashSet, LinkedHashSet
    * Dequeue <-- ArrayDequeue
    * NavigableSet <-- TreeSet
    * Map <-- HasMap, LinkedHashMap, HashTable
    * NavigableMap <-- TreeMap
    */

    // Iterable interface is implemented for making the collections iterable
    // Collection interface provides some common methods to be implemented by the implementing classes

    //Programming to an interface is saying, "I need this functionality and I don't care where it comes from."
    //We usually need only methods mentioned in the list interface for our functionality
    //Later we can easily change our mind and replace ArrayList with LinkedList if required (new LinkedList<>() on RHS)

    public static void main(String[] args) {
        /* Collection interface methods:
        *   boolean containsAll(Collection<?> c)
        *   boolean addAll(Collection<? extends E> c)
        *   boolean removeAll(Collection<?> c)
        *   boolean retainAll(collection<?> c)
        *   boolean isEmpty()
        *   int size()
        *   void clear()
        * */

        /*************************************    LIST    *****************************************/

        /* List interface methods
        *   E get(int index)
        *   E set(int index, E element)
        *   void add(int index, E element)
        *   boolean addAll(int index, Collection<? extends E> c)
        *   E remove(int index)
        * */

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        
        for (int i = 0; i<arrayList.size(); i++) {
           arrayList.set(i, arrayList.get(i));
        }


        List<Integer> arrayListCopy = new ArrayList<>(arrayList); // creates new array in memory
        arrayListCopy.add(30);

        // compiler converts Integer type to int (unboxing)
        for (int x : arrayList) {
            System.out.print(x);
        }

        List<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(0);
        arrayList2.add(1);
        arrayList2.add(2);
        arrayList2.addAll(arrayList);

        int firstIndex = arrayList2.indexOf(20);
        int lastIndex = arrayList2.lastIndexOf((30));

        // shallow copy (changes to contents to subList will change the underlying list)
        List<Integer> subList = arrayList2.subList(1, 3);

        List<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ListIterator<Integer> iterator = ll.listIterator();
        System.out.print(iterator.next());
        System.out.print(iterator.next());
        System.out.print(iterator.previous());

        Integer[] arr = arrayList2.toArray(new Integer[0]);

        List<List<Integer>> list = new ArrayList<>();
        List<Integer> inner = new ArrayList<>();
        list.add(inner);

        /***************************************   QUEUE   ***********************************/

        /* Queue Interface methods
        *   // throws error if q is full/empty
        *   boolean add(E element)
        *   E remove()
        *   E element()
        *
        *   // does not throw error if q is full/empty (returns null)
        *   boolean offer(E element)
        *   E poll()
        *   E peek()
        * */

        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);

        while (q.isEmpty() == false) {
            System.out.println(q.peek());
            q.poll();
        }

        /******************************************   STACK   ***********************************/

        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);

        while (stack.isEmpty() == false) {
            System.out.println(stack.peek());
            stack.pop();
        }

        /********************************************   DEQUE   ************************************/

        /* Dequeue Interface methods
        *   void push(E element)
        *   E pop()
        *
        *   void addFirst(E element)
        *   E removeFirst()
        *   E getFirst()
        *   void addLast(E e element)
        *   E getLast()
        *   E getLast()
        *
        *   boolean offerFirst(E element)
        *   E pollFirst()
        *   E peekFirst()
        *   boolean offerLast(E element)
        *   E pollLast()
        *   E peekLast()
        * */

        Deque<Integer> dq = new ArrayDeque<>();
        dq.offerFirst(10);
        dq.offerLast(20);
        dq.offerFirst(30);
        dq.offerLast(40);

        while (dq.isEmpty() == false) {
            System.out.println(dq.peekFirst());
            System.out.println(dq.peekLast());
            dq.pollFirst();
            dq.pollLast();
        }

        /******************************************   PRIORITY QUEUE   *******************************/

        Queue<Integer> pq = new PriorityQueue<>(); // minHeap
        pq.offer(10);
        pq.offer(20);
        pq.offer(30);

        while (pq.isEmpty() == false) {
            System.out.println(pq.peek());
            pq.poll();
        }

        class Student implements Comparable<Student> {
            int marks;

            Student(int marks) { this.marks = marks; }

            @Override
            public int compareTo(Student o) {
                // -1 this is smaller than o (placed before in the queue)
                // 1 this is bigger than o (placed after in the queue)
                // 0 this is equal to o

                // higher the marks, greater the priority
                if (this.marks > o.marks) return -1;
                else return 1;
            }
        }

        List<Student> students = new ArrayList<>();

        for (int i=0; i<5; i++) {
            students.add(new Student(70 + (int) (Math.random() * 10)));
        }

        Queue<Student> sq = new PriorityQueue<>(students);

        while (sq.isEmpty() == false) {
            System.out.println(sq.poll().marks);
        }

        class Instructor {
            double rating;
            Instructor(double rating) {
                this.rating = rating;
            }
        }

        class InstructorComparator implements Comparator<Instructor> {

            @Override
            public int compare(Instructor o1, Instructor o2) {
                if (o1.rating > o2.rating) return -1;
                return 0;
            }
        }

        List<Instructor> instructors = new ArrayList<>();

        for (int i=0; i<5; i++) {
            instructors.add(new Instructor(Math.random() * 10));
        }

        // comparators have more precedence than Comparable
        Queue<Instructor> iq = new PriorityQueue<>(new InstructorComparator());
        iq.addAll(instructors);

        Queue<Instructor> iq2 = new PriorityQueue<>((o1, o2) -> (int) (o1.rating - o2.rating));
        iq2.addAll(instructors);

        while (iq2.isEmpty() == false) {
            System.out.println("IQ2 = " + iq2.poll().rating);
        }


        /****************************************   SET   ***************************************/

        Set<Integer> mySet = new HashSet<>();
        mySet.add(1);
        mySet.add(18);
        mySet.add(18);

        mySet.remove(987);

        if (mySet.contains(2)) {
            mySet.remove(2);
        }

        Set<Integer> linkedSet = new LinkedHashSet<>();
        linkedSet.add(69);
        linkedSet.retainAll(mySet);

        class Employee {
            int id;

            Employee(int id) {
                this.id = id;
            }
            // By Default hasCode will be created from address.
            @Override
            public int hashCode() {
                return this.id;
            }

            // By Default equals will check double equals (reference of objects)
            @Override
            public boolean equals(Object obj) {
                Employee other = (Employee) obj;
                return this.id == other.id;
            }
        }

        Set<Employee> employeesSet = new HashSet<>();

        for (int i = 0; i < 5; i++) {
            employeesSet.add(new Employee(i));
        }

        employeesSet.add(new Employee(3));
        System.out.println(employeesSet.size());

        // sorted keys
        TreeSet<Integer> sortedSet = new TreeSet<>(mySet);
//        int first = sortedSet.first();
//        int last = sortedSet.last();
//        int removeFirst = sortedSet.pollFirst();
//        int removeLast = sortedSet.pollLast();
//        int justGreaterOrEquals = sortedSet.ceiling(5);
//        int justLessOrEquals = sortedSet.floor(5);
//        int justGreater = sortedSet.higher(5);
//        int justLess = sortedSet.lower(5);


        TreeSet<Employee> employeeTreeSet = new TreeSet<>((o1, o2) -> o1.id - o2.id);

        for (Employee val : employeeTreeSet) System.out.println(val.id);

        /*****************************************   MAP   *******************************************/

        Map<Integer, Integer> myMap = new HashMap<>();
        myMap.put(10, 20);
        myMap.put(null, 40);
        myMap.put(null, 50);
        myMap.remove(10);
        int val1 = myMap.get(10);
        int val2 = myMap.getOrDefault(77, 0);
        // returns value for key (20) if present else run the lambda function and
        // store what is returned at the key then return
        int val3 = myMap.computeIfAbsent(20, key -> 30);
        int val4 = myMap.get(null);

        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);

        Set<Integer> keys = myMap.keySet();
        Collection<Integer> values = myMap.values();
        Set<Map.Entry<Integer, Integer>> entries = myMap.entrySet();

        for (Map.Entry<Integer,Integer> entry : entries) {
            int key = entry.getKey();
            int value = entry.getValue();
        }

        TreeMap<Integer, Integer> sortedMap = new TreeMap<>();
        sortedMap.put(10, 20);
        sortedMap.put(30, 40);
        int firstKey = sortedMap.firstKey();
        int lastKey = sortedMap.lastKey();
        Map.Entry<Integer, Integer> fisrtEntry = sortedMap.firstEntry();
        Map.Entry<Integer, Integer> lastEntry = sortedMap.lastEntry();
        Map.Entry<Integer, Integer> removeFirst = sortedMap.pollFirstEntry();
        Map.Entry<Integer, Integer> removeLast = sortedMap.pollLastEntry();
        Map.Entry<Integer, Integer> justGreaterOrEqual = sortedMap.ceilingEntry(10);
        Map.Entry<Integer, Integer> justLesserOrEqual = sortedMap.floorEntry(10);
        Map.Entry<Integer, Integer> greater = sortedMap.higherEntry(10);
        Map.Entry<Integer, Integer> lesser = sortedMap.lowerEntry(10);

    }
}
