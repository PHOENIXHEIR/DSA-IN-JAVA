import java.util.Scanner;

public class ll {

    static class node {
        int data;
        node next;

        public node(int number) {
            data = number;
            next = null;
        }
    }

    static class Demo {
        node create(node head, int number) {
            node temp = head;
            node new1 = new node(number);
            if (head == null) {
                head = new1;
                temp = new1;
            } else {
                temp.next = new1;
                temp = new1;
            }

            return head;
        }

        void display(node head) {
            node temp;
            temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }

        node insert_front(int no, node head) {
            node new1 = new node(no);
            if (head == null)
                head = new1;
            else {
                new1.next = head;
                head = new1;
            }
            return head;
        }

        node insertpos(node head, int pos, int no) {
            node new1 = new node(no);
            if (head == null) {
                return head = new1;
            }
            if (pos == 0) {
                new1.next = head;
                head = new1;
                return head;
            } else {
                node temp = head;
                for (int i = 1; i <= pos - 1 && temp != null; i++)
                    temp = temp.next;
                new1.next = temp.next;
                temp.next = new1;
            }
            return head;
        }

        node delete(node head, int position) {
            node temp = head;
            if (position == 1)
                head = temp.next;
            else {
                for (int i = 1; i <= position - 1 && temp != null; i++)
                    temp = temp.next;
                temp.next = temp.next.next;
            }
            return head;
        }

        public static void main(String[] args) {
            Demo d = new Demo();
            node head = new node(0);
            head = null;
            Scanner ob = new Scanner(System.in);
            int n;
            do {
                System.out.println("1.Create 2.Display 3.Insert front 4.Insert at Position 5.Delete");
                System.out.println("Enter your choice");
                int ch = ob.nextInt();
                switch (ch) {
                    case 1:
                        System.out.println("Enter a number:");
                        int i = ob.nextInt();
                        head = d.create(head, i);
                        d.create(head, i);
                        break;
                    case 2:
                        d.display(head);
                        break;
                    case 3:
                        System.out.println("enter a number to insert");
                        int h = ob.nextInt();
                        head = d.insert_front(h, head);
                        break;
                    case 4:
                        System.out.println("enter a number to insert at position");
                        System.out.println("enter a position");
                        int pos = ob.nextInt();
                        System.out.println("Enter a number:");
                        int k = ob.nextInt();
                        head = d.insertpos(head, pos, k);
                        break;
                    case 5:
                        System.out.println("enter a position to delete element:");
                        int position = ob.nextInt();
                        head = d.delete(head, position);
                }
                System.out.println("Do you wish to continue 1:yes 2:no");
                n = ob.nextInt();

            } while (n == 1);
        }
    }

}
