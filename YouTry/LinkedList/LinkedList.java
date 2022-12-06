class LinkedList<T> implements LinkedListADT<T> {
    private ListNode<T> front = null;
    private int numberOfNodes = 0; 
    
    // Returns true if the linked list has no nodes, or false otherwise.
    @Override
    public boolean isEmpty() {
        return (front == null);
    }
    
    // Deletes all of the nodes in the linked list.
    // Note: ListNode objects will be automatically garbage collected by JVM.
    @Override
    public void clear() {
        front = null;
        numberOfNodes = 0;
    }
    
    // Returns the number of nodes in the linked list
    @Override
    public int size() {
        return numberOfNodes;
    }
    
    // Adds a node to the front of the linked list.
    @Override
    public void addFirst( T element ) {
        front = new ListNode<T>( element, front );
        numberOfNodes++;
    }
    
    // Returns a reference to the data in the first node, or null if the list is empty.
    @Override
    public T peekFirst() {
        if ( isEmpty() ) 
            return null;
        
        return front.getData();
    }
    
    // Removes a node from the front of the linked list (if there is one).
    // Returns a reference to the data in the first node, or null if the list is empty.
    @Override
    public T removeFirst() {
        T tempData;
        
        if ( isEmpty() ) 
            return null;
        
        tempData = front.getData();
        front = front.getNext();
        numberOfNodes--;
        return tempData;
    }

    // Add an element to the end of the linked list
    public void addLast( T element ) {
        if (front == null) {
            front = new ListNode<T>(element, null);
            return;
        }
        ListNode<T> last = front;
        while(last.getNext() != null) {   
            last = last.getNext();
        }
        last.setNext(new ListNode<T>(element, null));
        numberOfNodes++;
    }

    // Returns true if the linked list contains a certain element, or false otherwise.
    @Override
    public boolean contains( T key ) {
        ListNode<T> searchNode;
        searchNode = front;
        while ( ( searchNode != null ) && ( !key.equals( searchNode.getData() ) ) ) {
            searchNode = searchNode.getNext();
        }
        return ( searchNode != null );
    }
    
    // Return String representation of the linked list.
    @Override
    public String toString() {
        ListNode<T> node;
        String linkedList = "FRONT ==> ";
        
        node = front;
        while (node != null) {
            linkedList += "[ " + node.getData() + " ] ==> ";
            node = node.getNext();
        }
        
        return linkedList + "NULL";
    }


}