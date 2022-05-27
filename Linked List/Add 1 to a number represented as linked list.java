class Solution
{
    public:
    Node* addOne(Node *head) 
    {
        // Your Code here
        // return head of list after adding one
        if(head==NULL)
           return head;
       head = reverseList(head);
       int num = 1;
       int carry = 0;
       Node *curr = head;
       while(carry!=0 || num==1)
       {
           if(curr->data<9)
           {
               curr->data = num + curr->data;
               head = reverseList(head);
               return head;
           }
           curr->data = 0;
           carry = 1;
           
           if(curr->next==NULL && carry==1)
           {
               Node *temp = new Node(1);
               curr->next = temp;
               head = reverseList(head);
               return head;
           }
           curr = curr->next;
       }
       //return head;
   }
   
   
    Node* reverseList(Node *head)
   {
       if(head==NULL || head->next==NULL)
           return head;
       Node *prev = NULL, *curr = head;
       while(curr!=NULL)
       {
           Node *next = curr->next;
           curr->next = prev;
           prev = curr;
           curr = next;
       }
       return prev;
   }
};
