import java.util.Scanner;

class node{
    int data;
    node next;
    public
        node(int no)
        {
            data=no;
            next=null;
        }
}

class Linked_List{
    //Create Function
    node create(node head,int no)
    {   
        node temp = head;
        node new1 = new node(no);
        if (head==null) {
            head=new1;
            temp=new1;
        }
        else{
            temp.next = new1;
            temp=new1;
        }
        return head;
    }
    // Display Function
    void display(node head)
    {
        node temp;
        temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    // Insert Function
    node insert(node head,int no, int pos)
    {
        node new1 = new node(no);
        if(pos==1)
        {
            new1.next = head;
            head=new1;
        }
        else
        {
            node temp = head;
            for(int i=0; i<=pos-1 && temp!=null; i++)
            {
                temp = temp.next;
                new1.next=temp.next;
                temp.next=new1;
            }
        }
        return head;
    }
    // Main Function
    public static void main(String[] args) {
        int count;
        node head = new node(0);
        Linked_List d = new Linked_List();
        head = null;
        Scanner in = new Scanner(System.in);

        do{
            System.out.println("\n! Linked-List Menu !");
            System.out.println( "\n1.Create a node\n2.Display the node\n3.Insert Node");
            System.out.println("Enter the choice : ");
            int ch = in.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("\nEnter the number you want to enter in the Node :");
                    int num = in.nextInt();
                    head = d.create(head,num);
                    break;

                case 2:
                    System.out.println("\nThis is the Linked-List you entered : ");
                    d.display(head);
                    break;
                
                case 3:
                    System.out.println("\nEnter the number you want to insert :");
                    int j = in.nextInt();
                    System.out.println("\nEnter the position you want to enter the node at :");
                    int pos = in.nextInt();
                    d.insert(head, j, pos); 
            }
            System.out.println("\nDo you want to continue : ");
            count = in.nextInt();
        }while(count==1);

    }
}