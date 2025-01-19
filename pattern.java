

//java code to print diamond pattern 
 public class pattern {
    public static void main(String[] args){
        pattern1(5);
   }
 // i for rows and j is for columns
 static void pattern1(int n){
    for (int i =0; i< 2*n; i++){// i =rows
   int totalnoofcol_inrow =i > n ? 2*n-i:i;//similar to if else condition
 
 // space before stars
 int noOfspaces= n-totalnoofcol_inrow;
 for(int k=0; k< noOfspaces; k++){
 System.out.print("");
 }
 for (int j=0; j<totalnoofcol_inrow; j++){
 System.out.print("*");
 }
 System.out.println("");
 }
 
 }
}
