class LRUCache {
    class Node{
        int key;
        int val;
        Node prev;
        Node next;

        Node(int key,int val){
            this.key = key;
            this.val = val;
        }
    }

    Node head;
    Node tail;

    HashMap<Integer,Node> map;
    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;

        head = null;
        tail = null;
        map = new HashMap<>();
    }

    public int get(int key) {
        if(head == null){
            return -1;
        }

        if(map.containsKey(key)){
            Node node = map.get(key);

            if(head.next == null){
                tail = head;
            }
            else if(head == node){
                // already at head
            }
            else if(tail == node){
                Node newTail = node.prev;
                Node oldTail = node;

                newTail.next = null;
                tail = newTail;

                oldTail.prev = null;
                oldTail.next = head;
                head.prev = oldTail;
                head = oldTail;
            }
            else{
                node.prev.next = node.next;
                node.next.prev = node.prev;

                node.prev = null;
                node.next = head;
                head.prev = node;
                head = node;
            }

            return node.val;
        }

        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node = map.get(key);
            node.val = value;

            if(head == node){
                return;
            }

            if(tail == node){
                tail = node.prev;
                tail.next = null;
            }
            else{
                node.prev.next = node.next;
                node.next.prev = node.prev;
            }

            node.prev = null;
            node.next = head;
            head.prev = node;
            head = node;

            return;
        }

        Node newNode = new Node(key, value);

        if(map.size() < capacity){
            if(head != null){
                head.prev = newNode;
                newNode.next = head;
                newNode.prev = null;
                head = newNode;
            }
            else if(head == null){
                head = newNode;
                tail = newNode;
            }

            map.put(key,newNode);
        }
        else if(map.size() >= capacity){

            if(head == tail){
                map.remove(tail.key);

                head = newNode;
                tail = newNode;
            }
            else{
                Node oldTail = tail;
                Node newTail = tail.prev;

                newTail.next = null;
                tail = newTail;

                map.remove(oldTail.key);

                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }

            map.put(key,newNode);
        }
    }
}