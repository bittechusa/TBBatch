import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Mur extends JFrame {
	private JButton reg;
	private JButton custom;
	
	public Mur(){
		super("the title");
		setLayout(new FlowLayout());
		reg=new JButton("reg button");
		add(reg);
		Icon b=new ImageIcon(getClass().getResource("b.png"));
		Icon x=new ImageIcon(getClass().getResource("x.png"));
		custom=new JButton("custom",b);
		custom.setRolloverIcon(x);
		add(custom);
		
		HandlerClass handler=new HandlerClass();
		reg.addActionListener(handler);
		custom.addActionListener(handler);
	}
	private class HandlerClass implements ActionListener {
		public void actionPerformed(ActionEvent event){
			JOptionPane.showMessageDialog(null,String.format("%s", event.getActionCommand()));
		}
		
	}

}
