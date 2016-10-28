package ticktactoe;


import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class gui extends JFrame
{
	int count = -1;
  public gui()
  {
    setLocation(400,300);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    JPanel jp = new JPanel(new GridLayout(4,1));
    JLabel lbl = new JLabel("Type in a word:");
    final JTextField tf1 = new JTextField(10);
    final JTextField tf2 = new JTextField(10);

    String char01 = "";
    JButton btn01 = new JButton(char01);

    String char02 = "";
    JButton btn02 = new JButton(char02);

    String char03 = "";
    JButton btn03 = new JButton(char03);


    String char11 = "";
    JButton btn11 = new JButton(char11);

    String char12 = "";
    JButton btn12 = new JButton(char12);

    String char13 = "";
    JButton btn13 = new JButton(char13);


    String char21 = "";
    JButton btn21 = new JButton(char21);

    String char22 = "";
    JButton btn22 = new JButton(char22);

    String char23 = "";
    JButton btn23 = new JButton(char23);

    TickTackToe tick = new TickTackToe();

    btn01.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
       // char01 = "X";


    	  if (btn01.getText() == "")
    	  {
    		  count++;
    	  	  char mark = tick.whos_turn(count);
    	  	  String t = String.valueOf(mark);
    		  btn01.setText(t);
    	  }


    	  }});;

    btn02.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){



    	 if (btn02.getText() == "")
    	 {
    	    		  count++;
    	    	  	 char mark = tick.whos_turn(count);
    	    	  	  String t = String.valueOf(mark);
    	    		  btn02.setText(t);

    	 }


    	  }});;


    	  btn03.addActionListener(new ActionListener(){
    	   public void actionPerformed(ActionEvent ae){



    	    if (btn03.getText() == "")
    	    {
    	    	count++;
    	    	char mark = tick.whos_turn(count);
        	  	String t = String.valueOf(mark);
    			btn03.setText(t);

    	    }


    	   }});;

    	 btn11.addActionListener(new ActionListener(){
    	  public void actionPerformed(ActionEvent ae){



    	   if (btn11.getText() == "")
    	   {
    	    	count++;
    	    	char mark = tick.whos_turn(count);
    	    	String t = String.valueOf(mark);
    	    	btn11.setText(t);
    	   }


        }});;

    btn12.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent ae){



    	 if (btn12.getText() == "")
    	 {
    	     count++;
    	     char mark = tick.whos_turn(count);
    	     String t = String.valueOf(mark);
    	     btn12.setText(t);
    	  }


     }});;


    btn13.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent ae){



    	if (btn13.getText() == "")
    	{
    		count++;
    	    char mark = tick.whos_turn(count);
    	    String t = String.valueOf(mark);
    	    btn13.setText(t);
    	 }


    }});;

   btn21.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent ae){



    	if (btn21.getText() == "")
    	{
    		count++;
    	    char mark = tick.whos_turn(count);
    	    String t = String.valueOf(mark);
    	    btn21.setText(t);
    	}


   }});;

    btn22.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent ae){



    	 if (btn22.getText() == "")
    	 {
    		 count++;
    	     char mark = tick.whos_turn(count);
    	     String t = String.valueOf(mark);
    	     btn22.setText(t);
    	  }


    }});;

   btn23.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent ae){



	   if (btn23.getText() == "")
       {
		   count++;
    	   char mark = tick.whos_turn(count);
    	   String t = String.valueOf(mark);
    	   btn23.setText(t);
    	}


   }});;


    jp.add(btn01);
    jp.add(btn02);
    jp.add(btn03);
    jp.add(btn11);
    jp.add(btn12);
    jp.add(btn13);
    jp.add(btn21);
    jp.add(btn22);
    jp.add(btn23);
    getContentPane().add(jp);
    pack();
  }
  public static void main(String[] args){new gui().setVisible(true);}
}
