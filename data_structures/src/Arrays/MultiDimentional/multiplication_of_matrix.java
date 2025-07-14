package Arrays.MultiDimentional;
import java.util.Scanner;

public class multiplication_of_matrix {
            static void printArray(int [][] arr){
                System.out.println("The array is : ");
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr[i].length; j++) {
                        System.out.print(arr[i][j]+" ");
                    }
                    System.out.println();
                }
            }
            static void multiply(int [][] mt1,int [][] mt2,int r1,int c1,int r2,int c2){
                if (c1 != r2){
                    System.out.println("Not going to multiply !");
                    return;
                }
                int ans [][] = new int[r1][c2];
                for (int i = 0; i < r1; i++) {
                    for (int j = 0; j < c2; j++) {
                        for (int k = 0; k < c1; k++) {
                            ans[i][j] += mt1[i][k] * mt2[k][j];
                        }
                    }
                    System.out.println();
                }
                System.out.println("The matrix multi is : -");
                printArray(ans);
            }

            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("enter the row 1: ");
                int r1 = sc.nextInt();
                System.out.println("enter the col 1: ");
                int c1 = sc.nextInt();
                System.out.println("enter the row 2: ");
                int r2 = sc.nextInt();
                System.out.println("enter the col 2: ");
                int c2 = sc.nextInt();

                int [][] mt1 = new int[r1][c1];
                int [][] mt2 = new int[r2][c2];
                System.out.println("Enter the elements to print for arr1 : ");
                for (int i = 0; i < mt1.length; i++) {
                    for (int j = 0; j < mt1[i].length; j++) {
                        mt1[i][j] = sc.nextInt();
                    }
                }
                System.out.println("Enter the elements to print for arr2 : ");
                for (int i = 0; i < mt2.length; i++) {
                    for (int j = 0; j < mt2[i].length; j++) {
                        mt2[i][j] = sc.nextInt();
                    }
                }

                printArray(mt1);
                printArray(mt2);
                multiply(mt1,mt2,r1,r2,c1,c2);



            }
        }

