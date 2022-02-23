package day17_WhileDoWhileBranchingStatements;

public class BranchingStatements2 {
    public static void main(String[] args) {

        for (char i = 'A'; i <= 'E'; i++) {

            if (i == 'C') {
                continue;
            }


            System.out.println(i);
        }

        for (int i = 1; i <= 10; i++) {
            if ((i % 2 != 0)) {  //even numbers
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println();

        for (int i = 1; i <= 10; i++) {
            if ((i % 2 == 0)) {  //odd numbers
                continue;  //skips
            }
            System.out.print(i+" ");
        }

    }
}
