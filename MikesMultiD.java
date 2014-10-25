class MikesMultiD
    {
    public static void main (String[ ] args)
    {
        int MikesArray1[][]={{1,2,3,4}, {5,6,7,8}};
        int MikesArray2[][]={{9,10,11,12}, {13}, {14,15,16}};
        System.out.println("This is Mike's first array");
        display(MikesArray1);
        System.out.println("This is Mike's second array");
        display(MikesArray2);
    }
    
    public static void display(int x [][])
    {
        for(int row=0; row<x.length;row++){
            for(int column=0;column<x[row].length;column++){
                System.out.print(x[row][column] +"\t");
            }
            System.out.println();
        }
    }
}
 
