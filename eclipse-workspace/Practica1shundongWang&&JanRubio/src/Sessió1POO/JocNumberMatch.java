package Sessió1POO;

import java.util.Random;

import Keyboard.Keyboard;

public class JocNumberMatch {
	public static void main(String[] args) {
		/*String name;
		System.out.println("Hola");
		name=Keyboard.readString();*/
		int numero1=0;
		int[][]taulell= crearTaulell();
		int filaP;
		int columnaP;
		int filaS;
		int columnaS;

		
		
		System.out.println("NUNMBER MATCH. Comença la partida");
		System.out.println("********************************");
		while(isBuit(taulell,4)) {
			
		Boolean si1=true;
		while(si1) {
		System.out.println("Que vols fer");
		System.out.println("************");
		System.out.println("1.- Aparellar");
		System.out.println("2.- Posar més números -màxim 2 cops");
		System.out.println("3.- Acabar");
		numero1=Keyboard.readInt();
		if(numero1<=3&&numero1>=1) {
			si1=false;
			System.out.println("输入的范围必须在1到3");
		}
		}
		if(numero1==1) {
			
			System.out.println("Indica la fila de la primera component\r\n"
					+ "");
			filaP=Keyboard.readInt();
			System.out.println("Indica la columna de la primera component");
			columnaP=Keyboard.readInt();
			System.out.println("Indica la fila de la segona component");
			filaS=Keyboard.readInt();
			System.out.println("Indica la columna de la segona component");
			columnaP=Keyboard.readInt();

		}
		}

	}
	private static int llegirValor(int minim, int maxim, String text) {
		/*一个专门用于读取的函数，要求用户输入在前两个参数中指定的闭区间内的整数值。
		 * 该过程必须坚持不懈地获得正确的值。
		第三个参数是在向用户请求数值时要显示的文本。*/
	}
	private static void visualitzar(int[][] taulell, int numFiles) {
		/*于以矩阵格式显示游戏板的前几行内容。
		 * 空位置的内容 - 存储值为零 - 
		 * 将显示字符 X。*/
		for(int a = 0;a<numFiles;a++) {
			for(int b= 0; b<taulell[a].length;b++) {
				 if (taulell[a][b] == 0) {
	                    System.out.print("X ");
	                } else {
	                    System.out.print(taulell[a][b] + " ");
	                }
			}
			System.out.println();
		}
	}
	  private static int[][] crearTaulell(){
		  /*一个函数，用于创建游戏板并用区间[1,9]内的随机数字填充前36个组件
		   * 游戏板应该是12行9列*/
		  int [][] taulell = new int [12][9];
		  Random rand = new Random();
		  
		  for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < taulell[i].length; j++) {
	                taulell[i][j] = rand.nextInt(9) + 1;
	            }
	        }

	        return taulell;
	  }
	  private static void buidaComponent(int[][] taulell, int fila, int col) {
		 //一个过程，不是函数，用于将游戏板的特定组件清空 - 将值设为0，参数中给出
		  taulell[fila][col] = 0;
	  }
	  private static boolean parellaHoritzontal(int[][] taulell, int fil1, int col1, int fil2, int col2) {
		  /*检查给定参数中的两个组件是否在水平方向上成对。如果是，则该函数返回true，否则返回false*/
		  //去看ppt5
	  }
	  private static boolean parellaVertical(int[][] taulell, int fil1, int col1, int fil2, int col2) {
		 /*检查给定参数中的两个组件是否在垂直方向上成对。如果是，则该函数返回true，否则返回false*/ 
	  }
	   private static boolean parellaDiagonal(int[][] taulell, int fil1, int col1, int fil2, int col2) {
		   //一函数，检查给定参数中的两个组件是否在主对角线上成对。如果是，则该函数返回true，否则返回false
	   }
	   private static void afegir(int[][] taulell, int numFiles{
		   /*向矩阵添加数字。添加与现有数字相同的数字并按相同的顺序添加。
		    * 必须填充另外的4行数字。最后一个参数指示在插入之前有多少行已满。*/
	   }
	   private static boolean isBuida(int[][] taulell, int fila) {
		 //检查游戏板的某一行是否为空。  
	   }
	   private static void eliminarFila(int[][] taulell, int fila) {
		   //删除一行。也就是说，将要删除的行以上的数字向上移动一行
	   }
	   private static boolean isBuit(int[][] t, int numFiles) {
		   //一个函数，确定游戏板是否有数字。请记住，零表示空位置
	   }
}
