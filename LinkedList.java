class ListNode {
    int value;
    ListNode next;

    public ListNode(int value) {
        this.value = value;
        this.next = null;
    }
}

class LinkedList {
    private ListNode head;

    public void append(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void deleteLast() {
        if (head == null) return;

        if (head.next == null) { 
            head = null;
            return;
        }

        ListNode current = head;
        while (current.next.next != null) { 
            current = current.next;
        }
        current.next = null; 
    }

    public void printList() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        list.printList(); 
        list.deleteLast();
        list.printList(); 
    }
}
