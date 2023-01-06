public class sarray {

  static class stack {
    int a[];
    int top;
    int size;

    stack(int n) {
      a = new int[n];
      top = -1;
      size = n;
    }

    int stempty() {
      if (top == -1) return 1; else return 0;
    }

    int stfull() {
      if (top == size - 1) return 1; else return 0;
    }

    void stpush(int no) {
      if (stfull() == 1) System.out.println("stack is empty"); else {
        top = top + 1;
        a[top] = no;
      }
    }

    void stpop() {
      if (stempty() == 1) System.out.println("stack is empty"); else {
        int no = a[top];
        top--;
        System.out.println("The element is removed" + no);
      }
    }

    void display() {
      if (stempty() == 1) System.out.println("stack is empty"); else {
        for (int i = top; i >= 0; i--) System.out.println(a[i]);
      }
    }

    public static void main(String args[]) {
      stack s = new stack(5);
      s.stpush(10);
      s.stpush(30);
      s.stpush(25);
      s.stpush(20);
      s.display();
      s.stpop();
      s.display();
    }
  }
}
