public class sll {
    // stack usinglinked list

    static class node {
        // instance variables - replace the example below with your own
        int data;
        node next;
    }

    static class stll {
        node top;

        stll() {
            top = null;
        }

        int stempty() {
            if (top == null)
                return 1;
            else
                return 0;
        }

        void push(int n) {
            node new1 = new node();
            new1.data = n;
            new1.next = null;
            new1.next = top;
            top = new1;
        }

        void pop() {
            if (stempty() == 1)
                System.out.println("empty");
            else {
                System.out.println("deleted" + top.data);
                top = top.next;
            }
        }

        void display() {
            if (stempty() == 1)
                System.out.println("empty");
            else {
                node temp;
                temp = top;
                while (temp != null) {
                    System.out.println(temp.data);
                    temp = temp.next;
                }
            }
        }

        public static void main(String args[]) {
            stll s = new stll();
            s.push(10);
            s.push(20);
            s.push(18);
            s.push(50);
            s.push(62);
            s.display();
            s.pop();
            s.pop();
            s.display();
        }
    }

}
