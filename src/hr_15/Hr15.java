package hr_15;


import java.util.Scanner;

public class Hr15 {


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }

    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static Node insert(Node head,int data) {

        Node temp = head;
        Node lastnode = new Node(data);
        if (temp == null) {
            head = lastnode;
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = lastnode;
        }
        return head;
    }
}
