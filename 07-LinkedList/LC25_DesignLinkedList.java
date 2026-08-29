class MyLinkedList {
    class Node{
        int val;
        Node next;
        Node prev;

        Node(int val){
            this.val = val;
        }
    }

    Node head;
    Node tail;

    public MyLinkedList() {
        head = null;
        tail = null;
    }
    
    public int get(int index) {
        int indices = 0;
        Node curr = head;
        while(curr != null){
            if(indices == index){
                return curr.val;
            }
            curr = curr.next;
            indices++;
        }
        return -1;
    }
    
    public void addAtHead(int val) {
        Node newHead = new Node(val);
        if(head == null){
            head = newHead;
            tail = newHead;
        }
        else{
            head.prev = newHead;
            newHead.next = head;
            head = newHead;
        }
    }
    
    public void addAtTail(int val) {
        Node newTail = new Node(val); 
        if(head == null){
            head = newTail;
            tail = newTail;
        }
        else{
            tail.next = newTail;
            newTail.prev = tail;
            tail = newTail;
        }
        
    }
    
    public void addAtIndex(int index, int val) {
        int indices = 1;

        if(index == 0){
            addAtHead(val);
            return;
        }

        int size = 1;
        Node traversal = head;

        while(traversal.next != null){
            size++;
            traversal = traversal.next;
        }

        if(index > size){
            return;
        }

        if(index == size){
            addAtTail(val);
            return;
        }
        Node newElement = new Node(val);    
        Node currr = head.next;
        Node curr2 = head;

        while(currr != null){
            if(indices == index){
                curr2.next = newElement;
                currr.prev = newElement;
                newElement.next = currr;
                newElement.prev = curr2;
                return;
            }

            curr2 = curr2.next;
            currr = currr.next;
            indices++;

        }
    }
    public void deleteAtIndex(int index) {
        int indices = 1;

        if(head == null){
            return;
        }

        int size = 0;
        Node traversal = head;

        while(traversal != null){
            size++;
            traversal = traversal.next;
        }

        if(index >= size){
            return;
        }

        if(index == 0){
            if(size == 1){
                head = null;
                tail = null;
            }
            else{
                head = head.next;
                head.prev = null;
            }
            return;
        }

        if(index == size - 1){
            tail = tail.prev;
            tail.next = null;
            return;
        }

        Node slow = head;
        Node fast = head.next;

        while(fast != null){
            if(indices == index){
                slow.next = fast.next;
                fast.next.prev = slow;
                return;
            }

            indices++;
            slow = slow.next;
            fast = fast.next;
        }
    }
}