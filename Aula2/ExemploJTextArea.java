package Aula2;
       import javax.swing.*;
        import java.awt.*;
        public class ExemploJTextArea extends JFrame
        {
        JLabel rotulo;
        JTextArea texto; 
        public ExemploJTextArea(){
         super("Exemplo com JTextArea"); 
        Container tela = getContentPane(); 
        tela.setLayout(null);
        rotulo = new JLabel ("Endereço"); 
        texto = new JTextArea (20,30);
         rotulo.setBounds(50,20,100,20); 
         texto.setBounds(50,50,250,250); 
         tela.add(rotulo); tela.add(texto); setSize(400, 350); 
         setVisible(true); setLocationRelativeTo(null);
        }
        public static void main(String args[]){
        ExemploJTextArea app = new ExemploJTextArea(); app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } }