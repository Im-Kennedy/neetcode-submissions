class MyHashSet {
    Node[] buckets;
    int size = 1000;

    public MyHashSet() {
        buckets = new Node[size];//make new hash of size size
    }

    public int hash(int key){
        return key % size;
    }
    
    public void add(int key) {
        int index = hash(key);//get hash
        Node bucket = buckets[index];//find current bucket

        Node current = bucket;//make iterator
        while(current != null){
            if(current.val == key){
                return;
            }
            current = current.next;
        }

        Node newNode = new Node(key);//make new node
        newNode.next = buckets[index];//add t o front
        buckets[index] = newNode;//make head
    }
    
    public void remove(int key) {
        int index = hash(key);
        Node dummy = new Node(-1);//fake node before head/
        dummy.next = buckets[index];

        Node prev = dummy;
        Node current = buckets[index];

        while(current != null){
            if(current.val == key){
                prev.next = current.next;
                break;
            }
            prev= current;
            current = current.next;
        }
        buckets[index] = dummy.next;
        
    }
    
    public boolean contains(int key) {
        int index = hash(key);
        Node bucket = buckets[index];

        Node current = bucket;
        while(current != null){
            if(current.val == key){
                return true;
            }
            current = current.next;
        }
        return false;
    }
}

class Node{
    int val;
    Node next;

    public Node(int val){
        this.val = val;
        this.next = null;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */