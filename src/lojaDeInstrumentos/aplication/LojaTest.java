package lojaDeInstrumentos.aplication;
/*Criar programa para ler qual tipo de instrumento o usuario deseja*/

import lojaDeInstrumentos.entities.MenuLoja;

import java.util.Scanner;

public class LojaTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MenuLoja menuLoja = new MenuLoja();

        System.out.println("Bem Vindo à menor loja de instrumentos de Brasília!!!");

        System.out.printf(menuLoja.getMenu());
        menuLoja.setItemEscolhido(sc.next());
        System.out.printf(menuLoja.getItemEscolhido());


    }
}
