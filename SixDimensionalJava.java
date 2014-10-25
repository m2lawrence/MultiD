class SixDimensionalJava{
  public static void main(String[]args){
    System.out.println(); //1 blank line.
    System.out.println (" | Mike's Six Dimensional Java:");
    System.out.println(); //1 blank line.
    //Temperature arrays of: 1D:Secs, 2D:Mins, 3D:Hours, 4D:Days, 5D:Months & 6th Dimension: Years!! :-) 
    float [][][][][][] temperature = new float [6][6][6][24][12][13]; 
    //Generate temperatures:
    for (int a = 0; a < temperature.length; a++)
        for (int b = 0; b < temperature[a].length; b++)
            for (int c = 0; c < temperature[b].length; c++)
                for (int d = 0; d < temperature[c].length; d++)
                    for (int e = 0; e < temperature[d].length; e++)
                        for (int f = 0; f < temperature[e].length; f++)
          temperature[a][b][c][d][e][f] = (float) (45.0*Math.random() - 10.0);
    //Calculate the average per location.
    for(int a = 0; a < temperature.length; a++)
        for(int b = 0; b < temperature.length; b++)
            for(int c = 0; c < temperature.length; c++)
                for(int d = 0; d < temperature.length; d++)
                    for(int e = 0; e < temperature.length; e++)
                        for(int f = 0; f < temperature.length; f++){
      float average = 0.0f;  //place to store the average.
        for(int g = 0; g < temperature[0].length; g++)  
           average += temperature[a][b][c][d][e][f];
      //Output the average temperature for the current location
      System.out.println(" Average temp4 Mike's loc "+ (a+1) + " = " + average/(float)temperature[0].length);
    }
  }
}