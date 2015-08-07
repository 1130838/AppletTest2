import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * Created by bruno.devesa on 07-08-2015.
 */
public class App extends JApplet {

    String message;
    String filePath = "./Users/bruno.devesa/IdeaProjects/AppletTest2/src/xico.jpg";
    URL base;
    MediaTracker mt;
    Image pic;



    Image img;
    MediaTracker tr;

    public void init(){

        img = getImage(getDocumentBase(), "xico.jpg");

    }
    public void paint(Graphics g) {



        //tr = new MediaTracker(this);
      //  tr.addImage(img,220);
        g.drawImage(img, 50, 50, this);
        g.drawString("cenas", 25, 25);


        // g.drawArc(23, 34, 45, 500, 60, 70);
    }
}
