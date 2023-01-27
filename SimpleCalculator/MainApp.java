import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MainApp extends JFrame implements ActionListener{
    
    public Container c;
    public Font font = new Font("italic",Font.BOLD,15);
    public JLabel LNum1,LNum2,Result;
    public JTextField FNum1,FNum2;
    public JButton Add,sub,mul,div;

    MainApp(){
        this.setTitle("Calculator");
        c= this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);

        // Lable

        LNum1 = new JLabel("Number1");
        LNum1.setBounds(30,30,100,30);
        LNum1.setFont(font);
        c.add(LNum1);

        LNum2 = new JLabel("Numbe2");
        LNum2.setBounds(30,70,100,30);
        LNum2.setFont(font);
        c.add(LNum2);

        //TextSpace

        FNum1 = new JTextField();
        FNum1.setBounds(110,30,100,25);
        FNum1.setFont(font);
        c.add(FNum1);

        FNum2 = new JTextField();
        FNum2.setBounds(110,70,100,25);
        FNum2.setFont(font);
        c.add(FNum2);

        //Button
        Add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("X");
        div = new JButton("/");
        Add.setBounds(40,120,60,30);
        sub.setBounds(110 ,120,60,30);
        mul.setBounds(180,120,60,30);
        div.setBounds(250,120,60,30);
        c.add(Add);
        Add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        c.add(mul);
        c.add(sub);
        c.add(div);

        Result = new JLabel("Result : ");
        Result.setBounds(40, 200,500,30);
        Result.setFont(font);
        c.add(Result);

        this.setBounds(400,90,400,500);
        this.setVisible(true);
    }



    public void actionPerformed(ActionEvent e) {

        try {
            
            if (e.getSource() == Add) {
                int a = Integer.parseInt(FNum1.getText());
                int b = Integer.parseInt(FNum2.getText());
            int c = a+b;
            Result.setText("Result : "+c);
        }
        if (e.getSource()==sub) {
            int a = Integer.parseInt(FNum1.getText());
            int b = Integer.parseInt(FNum2.getText());
            int c = a-b;
            FNum1.setText("");
            FNum2.setText("");
            Result.setText("Result : "+c);
        }
        if (e.getSource()==mul) {
            int a = Integer.parseInt(FNum1.getText());
            int b = Integer.parseInt(FNum2.getText());
            int c = a*b;
            FNum1.setText("");
            FNum2.setText("");
            Result.setText("Result : "+c);
        }
        if (e.getSource()==div) {
            int a = Integer.parseInt(FNum1.getText());
            int b = Integer.parseInt(FNum2.getText());
            int c = a/b;
            FNum1.setText("");
            FNum2.setText("");
            Result.setText("Result : "+c);
        }
        } catch (NumberFormatException e1) {
            Result.setText("Please write only number not a Alphabet");
        }catch (ArithmeticException e2){
            Result.setText("Please don not Enter Zero in number2");
        }
    }


    public static void main(String[] args) {
        MainApp app = new MainApp();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
