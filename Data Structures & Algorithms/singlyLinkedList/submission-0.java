class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this(val, null);
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
class LinkedList {

    private ListNode head;
    private ListNode tail;

    public LinkedList() {
        this.head = new ListNode(-1);
        this.tail = this.head;
    }

    public int get(int index) {
        int counter = 0;
        ListNode temp = head.next;
        while (temp !=null) {
            if (counter == index){
                return temp.val;
            }
            temp = temp.next; 
            counter++;
        }
        return -1;
    }

    public void insertHead(int val) {
        ListNode node = new ListNode(val);
        node.next = head.next;
        head.next = node;
        if (node.next == null) {
            tail = node;
        }
    }

    public void insertTail(int val) {
        this.tail.next = new ListNode(val);
        this.tail = this.tail.next;
    }

    public boolean remove(int index) {
        int i = 0;
        ListNode cur = head;
        while (i < index && cur !=null) {
            i++;
            cur = cur.next;
        }
        if (cur != null && cur.next != null) {
            if (cur.next == this.tail) {
                this.tail = cur;
            }
            cur.next = cur.next.next;
            return true;
        }
        return false;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> res = new ArrayList<>();
        ListNode curr = this.head.next;
        while(curr != null ) {
            res.add(curr.val);
            curr = curr.next;
        }
        return res;
    }
}
