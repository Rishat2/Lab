import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        long[] a = new long[11];
        float[] x = new float[18];
        for (int i = 0; i < 11; i++) {
            a[i] = 3 + i * 2;
        }
        for (int i = 0; i < 18; i++) {
            x[i] = ((float) (Math.round(Math.random() * 140 - 20))) / 10;
        }
        double[][] A = new double[11][18];
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 18; j++) {
                if (a[i] == 21) {
                    A[i][j] = Math.exp(Math.asin((Math.pow((x[j] + 5) / 14, 2))));
                }
                if (a[i]==5||a[i]==7||a[i]==9||a[i]==11||a[i]==13||a[i]==15) {
                    A[i][j]=Math.atan(1/(Math.exp(Math.pow(Math.sin(Math.pow((Math.exp(x[j])-1)/Math.exp(x[j]),3)),2))));
                }
                if (a[i]==3||a[i]==17||a[i]==19||a[i]==23) {
                    A[i][j]=Math.pow((4-Math.pow(1-Math.pow(x[j]/2,9),3))/Math.pow(2*Math.pow(4/(Math.pow(x[j]/(x[j]-1),2)-0.5),2),Math.sin(3/4*(1-x[j]))),2);
                }

            }
        }
        for(int i=0;i<11;i++) {
            for(int j=0;j<18;j++) {
                System.out.printf("%.5f ",A[i][j]);
            }
            System.out.print("\n");
        }
            }
        }

