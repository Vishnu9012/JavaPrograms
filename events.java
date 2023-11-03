
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Add extends Frame implements ActionListener
{
    Add()
    {
        setLayout(null);
        setVisible(true);
        setSize(500, 600);
        TextField t1 = new TextField();
        t1.setBounds(50,50,500,100);
        add(t1);
        t1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("hello");
    }
    public static void main(String arg[])
    {
        Add a1 = new Add();
    }
    
}