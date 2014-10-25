//This one works correctly!
// Method that takes a list of ints and prints every second one out. 

class PrePay2
    {
    public static void main (String[ ] args)
    {
        int MikesArray1[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println("This is Mike's Array");
        display(MikesArray1);
    }
    
    public static void display(int x [])
    {
        for(int row=1; row<x.length; row = row +=2){
                System.out.print(x[row] +"\t");
            }
            System.out.println();
        }
    }
