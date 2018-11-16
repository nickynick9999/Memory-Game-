package memorygame;
import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MemoryGame extends JPanel
{
   JLabel pictureOfAnimal;
   JPanel pnlButton,pnlBigPanel,pnlLabel;
   JButton btnViewImage,btnTakeTest;
   ButtonViewImage bVI;
   int counter=0,idx=0;
   Integer[] answerArray;
   
public MemoryGame()
{
    answerArray=new Integer[10];
    pictureOfAnimal=new JLabel();
    /*Adapted from Stackoverflow(2010). 
    Setting the size of panel. 
    Retrieved from https://stackoverflow.com/questions/1594423/setting-the-size-of-panels .
    Date accesed on 30th June
    */
    pictureOfAnimal.setPreferredSize(new Dimension(400,400));
    
   
    pnlButton=new JPanel();
    /*Adapted from Stackoverflow.(2009).Is there a “Group Box” equivalent in Java Swing?. 
    Retrieved from
     https://stackoverflow.com/questions/431654/is-there-a-group-box-equivalent-in-java-swing. 
    Date accessed on 21st June
    */
    pnlButton.setBorder(BorderFactory.createTitledBorder("Start"));

    pnlLabel=new JPanel();
    pnlLabel.setPreferredSize(new Dimension(400,400));
     
    pnlBigPanel=new JPanel(); 
     
    btnViewImage=new JButton("View Images");
    btnTakeTest=new JButton("Take Test");
    btnTakeTest.setEnabled(false);
    
    btnTakeTest.addActionListener(new ActionListener()
     {
       public void actionPerformed(ActionEvent ae)
       {
          TakeTest takeTest=new TakeTest(answerArray);
          
          takeTest.add(new TakeTest(answerArray).createGUI());
          takeTest.setSize(500,500);
          takeTest.setVisible(true);
          takeTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                    
        }
      });
      
    bVI=new ButtonViewImage();       
}
   
public JPanel createGUI()
{
       btnViewImage.addActionListener(bVI);
       pnlLabel.add(pictureOfAnimal, BorderLayout.NORTH);
       pnlButton.add(btnViewImage, BorderLayout.SOUTH);
       pnlButton.add(btnTakeTest, BorderLayout.SOUTH);  
       setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
       
       pnlBigPanel.add(pnlLabel);
       pnlBigPanel.add(pnlButton);
   
       return pnlBigPanel;
}

public class ButtonViewImage implements ActionListener
{
     public void actionPerformed(ActionEvent ae)
     {
         if(ae.getSource()==btnViewImage)
         {
           String path="";
           Random rand = new Random();
           int n = rand.nextInt(10) + 1;
        if(counter==10)
        {
           btnViewImage.setEnabled(false);
           btnTakeTest.setEnabled(true);
           JOptionPane.showMessageDialog(null,"End of Image please proceed to take test","ALERT",JOptionPane.INFORMATION_MESSAGE);
           pictureOfAnimal.setVisible(false);   
        }
          answerArray[idx]=n;
          idx++;
          //Adapted from Stackoverflow.(2015).displaying an image from a computer. 
          //Retrieved from https://stackoverflow.com/questions/29810506/displaying-an-image-from-a-computer
          //Date accesed from 12th July
            switch(n)
            {
            case 1:
                path="C:\\Users\\User\\Desktop\\New folder\\1.jpg";
                break;
            case 2:
                path="C:\\Users\\User\\Desktop\\New folder\\2.jpg";
                break;
            case 3:
                path="C:\\Users\\User\\Desktop\\New folder\\3.jpg";
                break;
            case 4:
                path="C:\\Users\\User\\Desktop\\New folder\\4.jpg";
                break;
            case 5:
                path="C:\\Users\\User\\Desktop\\New folder\\5.jpg";
                break;
            case 6:
                path="C:\\Users\\User\\Desktop\\New folder\\6.jpg";
                break;
            case 7:
                path="C:\\Users\\User\\Desktop\\New folder\\7.jpg";
                break;
            case 8:
                path="C:\\Users\\User\\Desktop\\New folder\\8.jpg";
                break;
            case 9:
                path="C:\\Users\\User\\Desktop\\New folder\\9.jpg";
                break;
            case 10:
                path="C:\\Users\\User\\Desktop\\New folder\\10.jpg";
                break;
            case 11:
                path="C:\\Users\\User\\Desktop\\New folder\\11.jpg";
                break;
            case 12:
                path="C:\\Users\\User\\Desktop\\New folder\\12.jpg";
                break;
            case 13:
                path="C:\\Users\\User\\Desktop\\New folder\\13.jpg";
                break;
            case 14:
                path="C:\\Users\\User\\Desktop\\New folder\\14.jpg";
                break;
            case 15:
                path="C:\\Users\\User\\Desktop\\New folder\\15.jpg";
                break;   
            case 16:
                path="C:\\Users\\User\\Desktop\\New folder\\16.jpg";
                break;       
            case 17:
                path="C:\\Users\\User\\Desktop\\New folder\\17.jpg";
                break;       
            case 18:
                path="C:\\Users\\User\\Desktop\\New folder\\18.jpg";
                break;                          
            default: 
        }
        //Adapted from Stackoverflow.(2013).How to add an ImageIcon to a JFrame?. 
        //Retrived from https://stackoverflow.com/questions/13011705/how-to-add-an-imageicon-to-a-jframe
        //Date accessed on 12th July
        ImageIcon MyImage = new ImageIcon(path);       
        Image img = MyImage.getImage();
        Image newImg =img.getScaledInstance(pictureOfAnimal.getWidth(),pictureOfAnimal.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        pictureOfAnimal.setIcon(image);
        }
     counter++;
   }
}

public static void main(String[] args)
{
        JFrame memoryGame=new JFrame("Kids Memory Game");
        memoryGame.add(new MemoryGame().createGUI());
        memoryGame.setSize(800,500);
        memoryGame.setVisible(true);
        memoryGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
 }  
}

