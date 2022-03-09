package typing_text;

import java.applet.Applet;
import java.awt.Font;
import java.awt.Graphics;

public class typing extends Applet {

    public void init() {
      
    }
    
    String text = "This is typing text in applet";
    Font f = new Font(null,Font.BOLD,20);
    
    public void paint(Graphics g){
        for(int i=0;i<=text.length();i++)
        {
            g.setFont(f);
            
            g.drawString(text.substring(0,i), 100, 100);
            try{
                Thread.sleep(250);
            }catch(Exception e){
                
            }
        }
      
    }
}
