public class pattern2 {
    //java code to print diamond pattern 
    public static void main(String[] args){
        pattern(5);
   }
 // i for rows and j is for columns
 static void pattern(int n){
    for (int i =0; i< 2*n; i++){// i =rows
   int totalnoofcol_inrow =i > n ? 2*n-i:i;//similar to if else condition
 
 // space before stars
 //int noOfspaces= n-totalnoofcol_inrow;
 for(int k=0; k< n; k++){
 System.out.print("");
 }
 for (int j=0; j<n; j++){
 System.out.print("*");
 }
 System.out.println("");
 }
 
 }
 }

