package academy.devdojo.maratonajava.Aintroducao;

public class Aula08ArraysMulti01 {
    public static void main(String[] args) {
        int [][] dias = new int[3][3];
        for(int [] dia : dias) {
            for(int num : dia) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
