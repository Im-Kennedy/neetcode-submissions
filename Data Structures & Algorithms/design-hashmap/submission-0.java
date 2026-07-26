class MyHashMap {
    Node[] buckets;
    int size = 1000;

    public MyHashMap() {
        buckets = new Node[size];
    }

    public int hash(int key){
        return key % size;
    }
    
    public void put(int key, int value) {
        int index = hash(key);//get hash
        Node current = buckets[index];//get current

        while(current != null){
            if(current.key == key){
                current.val = value;
                return;
            }
            current = current.next;
        }

        //if key is not found
        Node newnode = new Node(key, value);
        newnode.next = buckets[index];
        buckets[index] = newnode;
    }
    
    public int get(int key) {
        int index = hash(key);
        Node current = buckets[index];

        while(current != null){
            if(current.key == key){
                return current.val;
            }
            current = current.next;
        }
        return -1;
    }
    
    public void remove(int key) {
        int index = hash(key);
        Node prev = new Node(-1, -1);
        prev.next = buckets[index];

        Node dummy = prev;
        Node current = buckets[index];

        while(current != null){
            if(current.key == key){
                prev.next = current.next;
                break;
            }
            prev = current;
            current = current.next;
        }
        buckets[index] = dummy.next;        
    }
}

class Node{//node class
    int val;
    int key;
    Node next;

    public Node(int key, int val){
        this.key = key;
        this.val = val;
        next = null;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */