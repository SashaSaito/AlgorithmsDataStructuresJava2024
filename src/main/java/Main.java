public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Приклад 1
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode mergedList1 = solution.mergeTwoLists(list1, list2);
        printList(mergedList1);  // Output: [1,1,2,3,4,4]

        // Приклад 2
        ListNode emptyList1 = null;
        ListNode emptyList2 = null;

        ListNode mergedList2 = solution.mergeTwoLists(emptyList1, emptyList2);
        printList(mergedList2);  // Output: []

        // Приклад 3
        ListNode emptyList3 = null;
        ListNode list3 = new ListNode(0);

        ListNode mergedList3 = solution.mergeTwoLists(emptyList3, list3);
        printList(mergedList3);  // Output: [0]
    }

    // Метод для виведення списку
    private static void printList(ListNode head) {
        if (head == null) {
            System.out.println("[]");
            return;
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        ListNode current = head;

        while (current != null) {
            sb.append(current.val);
            if (current.next != null) {
                sb.append(",");
            }
            current = current.next;
        }
        sb.append("]");
        System.out.println(sb.toString());
    }
}
