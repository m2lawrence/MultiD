class TwoDimensionalJava
{
  public static void main(String[]args)
  {
    System.out.println(); //1 blank line.
    System.out.println (" | The average temperatures of Mike's 5 locations are:");
    System.out.println(); //1 blank line.
    float [][] temperature = new float [5][365]; //Temperature array.
    //Generate temperatures:
    for (int i = 0; i < temperature.length; i++)
      for (int j = 0; j < temperature[i].length; j++)
          temperature[i][j] = (float) (45.0*Math.random() - 10.0);
    //Calculate the average per location.
    for(int i = 0; i < temperature.length; i++){
      float average = 0.0f;  //place to store the average.
        for(int j = 0; j < temperature[0].length; j++)
           average += temperature[i][j];
      //Output the average temperature for the current location
      System.out.println(" | The average temperature of Mike's location "+ (i+1) + " = " + average/(float)temperature[i].length);
    }
    System.out.println(); //1 blank line.
  }
}