/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snack;

// Importações necessárias para rodar o jogo
import javax.swing.JFrame;

/*
 *
 * AUTOR: Luana de Souza Bianchini
 * DATA: 31/10/2015
 * CLASSE: SNACK
 * OBJETIVO: JFRAME PRINCIPAL DO JOGO
 *
 */

public class Snack extends JFrame
{

    // Método construtor da classe
    public Snack ()
    {
        // Adiciona o JPanel do jogo
        add(new Grade());

        // Define a saida da aplicação
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Define o tamanho da janela
        setSize(420, 440);
        // A localização
        setLocationRelativeTo(null);
        // O titulo da janela
        setTitle("Jogo da Cobrinha");

        // Impede o redimensionamento da janela
        setResizable(false);
        // Mostra a janela
        setVisible(true);
    }

    public static void main(String[] args) 
    {
        // Cria o novo JFrame
        new Snack();
    }

}
