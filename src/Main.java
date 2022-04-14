import java.util.*;
import Tensors.Tensor;

public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Your Text :");
		String data = s.nextLine();
		Tensor ten = Tensor.loadData(data);
		int[][] ma = ten.getMatrix();
		System.out.println(data + " in Matrix ");
		ten.printMatrix();
		System.out.println("Matrix To String");
		ten.MatrixToString(ma);
        
    }
    
}
