import javax.swing.*; 
public class DefinirIcone extends JFrame{ 
public DefinirIcone(){ 
super("Como definir o ícone para a janela"); 
ImageIcon icone = new ImageIcon("teste.gif"); 
setIconImage(icone.getImage()); 
setSize(300, 150); 
setVisible(true); 
} 
public static void main(String args[]){ 
DefinirIcone app = new DefinirIcone(); 
app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
} 
}