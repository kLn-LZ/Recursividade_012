package Controller;

public class qtdeIntEspec {

    public qtdeIntEspec() {
        super();

    }

    public int funcCheckSpecific (int bV, int sV) {

        // Checando se o valor de referência chegou no limite
        if(bV <= 0) {

            return 0;
        }

        // Checando se o menor valor está dentro do maior valor
        if (bV % 10 == sV ) {


            return 1 + funcCheckSpecific(bV / 10, sV);
        }

        // Diminuindo em uma casa o maior valor
        return funcCheckSpecific(bV / 10, sV);

    }


}
