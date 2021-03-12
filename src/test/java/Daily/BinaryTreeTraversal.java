package Daily;

public class BinaryTreeTraversal {

    BinaryTreeTraversal left;
    BinaryTreeTraversal right;
    int data;
    BinaryTreeTraversal(int data)
    {
        this.data=data;
    }

    public BinaryTreeTraversal() {
    }

    public static BinaryTreeTraversal creatingBinaryTree()
    {
        BinaryTreeTraversal rootnode=new BinaryTreeTraversal(50);
        BinaryTreeTraversal node10=new BinaryTreeTraversal(10);
        BinaryTreeTraversal node20=new BinaryTreeTraversal(20);
        BinaryTreeTraversal node30=new BinaryTreeTraversal(30);
        BinaryTreeTraversal node40=new BinaryTreeTraversal(40);
        BinaryTreeTraversal node60=new BinaryTreeTraversal(60);
        BinaryTreeTraversal node70=new BinaryTreeTraversal(70);
        BinaryTreeTraversal node80=new BinaryTreeTraversal(80);
        BinaryTreeTraversal node90=new BinaryTreeTraversal(90);
        BinaryTreeTraversal node15=new BinaryTreeTraversal(15);
        BinaryTreeTraversal node25=new BinaryTreeTraversal(25);
        BinaryTreeTraversal node35=new BinaryTreeTraversal(35);
        BinaryTreeTraversal node45=new BinaryTreeTraversal(45);

        rootnode.left=node45;
        rootnode.right=node35;

        node35.left=node10;
        node35.right=node20;

        node45.left=node30;
        node45.right=node40;

        node30.right=node70;
        node30.left=node60;

        node10.left=node25;
        node10.right=node90;

        node20.left=node15;
        node40.right=node80;

        return rootnode;
    }

    public void preOrder(BinaryTreeTraversal rootnode)
    {
        
            if(rootnode!=null)
            {
                    System.out.print(rootnode.data+" ");
                    preOrder(rootnode.left);
                    preOrder(rootnode.right);
            }
         
    }
    public void inOrder(BinaryTreeTraversal rootnode)
    {
        
            if(rootnode!=null)
            {
                   
                    inOrder(rootnode.left);
                    System.out.print(rootnode.data+" ");
                    inOrder(rootnode.right);
            }
           
        
    }
    public void postOrder(BinaryTreeTraversal rootnode)
    {
        
        if(rootnode!=null)
        {
               
                postOrder(rootnode.left);
                postOrder(rootnode.right);
                System.out.print(rootnode.data+" ");
        }
      
    }

    public static void main(String[] args) {
        BinaryTreeTraversal obj=new BinaryTreeTraversal();
        BinaryTreeTraversal rootnode=creatingBinaryTree();
        System.out.println("************PreOrder*********");
      
        obj.preOrder(rootnode);
        System.out.println();
        System.out.println("************End*********");
        System.out.println();
        System.out.println("************InOrder*********");
        
        obj.inOrder(rootnode);
        System.out.println();
        System.out.println("************End*********");
        System.out.println();
        System.out.println("************PostOrder*********");
        
        obj.postOrder(rootnode);
        System.out.println();
        System.out.println("************End*********");
    }

}