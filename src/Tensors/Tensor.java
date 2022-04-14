package Tensors;

public class Tensor
{
	private String data;
	private int[][]baseMatrix;
	public static Tensor loadData(String data){
		return new Tensor(data);
	}
	
	public Tensor(String data){
		this.data = data;
		baseMatrix = new int[data.length()][data.length()];
	}
	public int[][] getMatrix(){
		return mtrix();
	}
	private int[][] mtrix(){
		for (int i=0;i<baseMatrix.length;i++){
			for (int j=i;j<baseMatrix.length;j++){
				baseMatrix[i][j] = (int)data.charAt(j);
				break;
			}
			
		}
		return baseMatrix;
	}
	public void printMatrix(){
		for (int i=0;i<baseMatrix.length;i++){
			for (int j=0;j<baseMatrix.length;j++){
				if (i==0&&j==0){
					System.out.print(baseMatrix[i][j]);
				}else{
					System.out.print("," + baseMatrix[i][j]);
				}
				
			}
			System.out.println();
		}
	}
	
	public void MatrixToString(int[][] mat){
		for (int i=0;i<mat.length;i++){
			for (int j=0;j<mat.length;j++){
				if (mat[i][j] != 0){
					System.out.print((char)mat[i][j]);
					break;
				}
			}
		}
		System.out.println();
	}
}
