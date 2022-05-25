/*Uma parede em formato retangular, cuja altura é hp (altura da parede)
e a largura lp (largura da parede) precisa ser coberta por azulejos também retangulares.
O azulejo retangular tem dimensões ha (altura do azulejo) e la (largura do azulejo).
Escreva um programa que leia as quatro medidas hp, lp, ha e la,
calcule e imprima quanto azulejos com as medidas dadas são necessários para cobrir
a parede dada.*/

public class main {
    public static void main(String[] args) {

        double hp=300, lp=600, ha=4, la=2, areaParede, areaAzulejo, qtdeAzulejos;

        areaAzulejo = ha * la;
        areaParede = hp * lp;


        qtdeAzulejos = areaParede/areaAzulejo;

        System.out.println("numeros de azulejos necessários é: " + qtdeAzulejos);


    }
}
