package lojaDeInstrumentos.entities;

import java.util.Scanner;

public class MenuLoja {
    private String itemEscolhido;


    Scanner sc = new Scanner(System.in);


    public String getMenu() {
        return "%n" +
                "Selecione a opção desejada: %n" +
                "1 - Instrumentos de corda %n" +
                "2 - Instrumentos de percussão %n" +
                "3 - Instrumentos de sopro %n";
    }

        public void setItemEscolhido ( String itemEscolhido){
            this.itemEscolhido = itemEscolhido;
        }

        public String getItemEscolhido () {


            if (itemEscolhido == "1") {
                return "%n" +
                        "Selecione o instrumento de corda que deseja: %n " +
                        "1 - Guitarra %n" +
                        " 2 - Violão %n " +
                        "3 - Baixo %n" +
                        " 4 - Voltar para o menu inicial %n";
            } else if (itemEscolhido == "2") {
                return "%n" +
                        "Selecione o instrumento de percussão que deseja: %n " +
                        "1 - Bateria acústica  %n" +
                        " 2 - Cajon %n " +
                        "3 - Pandeiro %n" +
                        " 4 - Voltar para o menu inicial %n";
            } else if (itemEscolhido == "3") {
                return "%n" +
                        "Selecione o instrumento de sopro que deseja: %n " +
                        "1 - Flauta doce  %n" +
                        " 2 - Clarinete %n" +
                        " 3 - Sexofone %n" +
                        " 4 - Voltar para o menu inicial %n";
            } else {
                System.out.println("Insira um número válido");
                itemEscolhido = sc.nextInt();
                return getItemEscolhido();
            }

        }


    }


