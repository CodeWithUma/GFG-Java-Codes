import java.text.DecimalFormat;
class Geeks{
    
    static void printInFormat(float a, float b){
        float result = a/b;
        // System.out.println(result);
        // sc = new Scanner("#.##");
        // result = result.3f;
        DecimalFormat ft = new DecimalFormat("####");
 
    // this will print it upto 2 decimal places
    ft = new DecimalFormat("#.###");
        System.out.print(result + " " +ft.format(result));
        
        // Your code here to print upto 3 decimal places
        
    }    
    
}
