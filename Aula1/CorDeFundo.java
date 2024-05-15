import javax.swing.*; 
import java.awt.*; 
public class CorDeFundo extends JFrame{ 
public CorDeFundo(){ 
super("Definindo a cor de fundo para a janela"); 
Container tela = getContentPane(); 
tela.setBackground(Color.blue); 
setSize(500, 100); 
setVisible(true); 
} 
public static void main(String args[]){ 
CorDeFundo app = new CorDeFundo(); 
app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
} 
}