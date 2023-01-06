import java.util.Scanner;

class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        next = null;
    }
}

public class q {
    node f;
    node r;

    q() {
        f = null;
        r = null;
    }

    void addqueue(int n) {
        node new1 = new node(n);
        if (r == null) {
            r = f = new1;
        } else {
            r.next = new1;
            r = new1;
        }
    }

    void deletequeue() {
        if (f == null)
            System.out.println("Queue is empty");
        else {
            System.out.println("Element " + f.data + "is deleted");
            f = f.next;
        }
    }

    void display() {
        node temp = f;
        if (r == null) {
            System.out.println("Queue is empty");
            return;
        }
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        int n;
        q q = new q();
        Scanner ob = new Scanner(System.in);
        do {
            System.out.println("1.Add queue,2.Delete queue,3.Display");
            System.out.println("Enter your choice:");
            int ch = ob.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter a number:");
                    int i = ob.nextInt();
                    q.addqueue(i);
                    break;
                case 2:
                    q.deletequeue();
                    break;
                case 3:
                    q.display();
            }
            System.out.println("Do you wish to continue 1:yes 2:no");
            n = ob.nextInt();
        } while (n == 1);
    }
}
