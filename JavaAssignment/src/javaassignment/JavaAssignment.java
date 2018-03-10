
package javaassignment;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Dell
 */
public class JavaAssignment extends Applet implements ActionListener {
Button ok,cancel,help;
TextField out; 


   public void init(){//initialize all components
       ok=new Button("OK");
       cancel=new Button("CANCEL");
       help=new Button("HELP");
       out=new TextField(5);
       add(ok);add(cancel);add(help);add(out);
       ok.addActionListener(this);
       cancel.addActionListener(this);
       help.addActionListener(this);
       
       
   }
  
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==ok){               //event when ok is clicked
            showStatus("OK is pressed");
            
            out.setBackground(Color.RED);
        }
        else if(e.getSource()==cancel){ //event when cancel is clicked
            showStatus("CANCEL is pressed");
            out.setBackground(Color.GREEN);
        }
        else if(e.getSource()==help){//event when help is clicked
            showStatus("HELP is pressed");
            out.setBackground(Color.YELLOW);
        }
        else
            ;
    }
           
    
}
