package View;

import Controller.qtdeIntEspec;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        qtdeIntEspec qIE = new qtdeIntEspec();

        int bV = 0;
        int sV = 0;
        boolean check = false;

        while(check == false) {


            System.out.println("Insira um valor de 10 a 999999: ");
            bV = scan.nextInt();

            if (bV >= 10 && bV <= 999999) {
                check = true;
            }
            else {
                System.out.println("Valor inválido");
            }

        }

        check = false;


        while(check == false) {


            System.out.println("Insira um valor de 0 a 9: ");
            sV = scan.nextInt();

            if (sV >= 0 && sV <= 9) {
                check = true;
            }
            else {
                System.out.println("Valor inválido");
            }

        }


        System.out.println("Quantidade de vezes que o valor aparece: " + qIE.funcCheckSpecific(bV, sV));
    }

}
