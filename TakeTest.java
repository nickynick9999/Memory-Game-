package memorygame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TakeTest extends JFrame 
{

    JPanel pnlBigpnl, pnlComboBox, pnlButton, pnlLabel, pnlTextArea, pnlScore;
    JLabel answer1, answer2, answer3, answer4, answer5, answer6, answer7, answer8, answer9, answer10, score, lblScore;
    JButton btnCheckScore, btnShowAnswer;
    JTextArea answer;
    JComboBox animalList;
    ButtonCheckScore bCS;
    ButtonShowAnswer bSA;
    int counter = 0, idx = 0;
    Integer intScore;
    Integer[] answerArray, yourAnswer;

    public TakeTest(Integer[] answerArray) 
    {
        this.answerArray = answerArray;
        yourAnswer = new Integer[10];
        String[] animal = {"cat", "tiger", "lion", "panda", "rabit", "snake", "dog",
            "fox", "bird", "lizard", "rat", "cow", "zebra", "Hippopotanus", "owl", "leopard", "octopus","ziraf"};
        animalList = new JComboBox(animal);

        animalList.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                String type = (String) animalList.getSelectedItem();
                displayAnimalName();
            }
        });
        intScore = new Integer(10);

        pnlBigpnl = new JPanel();

        pnlButton = new JPanel();
        pnlButton.setBorder(BorderFactory.createTitledBorder("Play"));

        pnlLabel = new JPanel();
        pnlLabel.setBorder(BorderFactory.createTitledBorder("Your Answers"));
        pnlLabel.setPreferredSize(new Dimension(100, 320));
        pnlTextArea = new JPanel();

        pnlScore = new JPanel();

        answer1 = new JLabel("Answer 1", answer1.CENTER);
        answer2 = new JLabel("Answer 2", answer2.CENTER);
        answer3 = new JLabel("Answer 3", answer3.CENTER);
        answer4 = new JLabel("Answer 4", answer4.CENTER);
        answer5 = new JLabel("Answer 5", answer5.CENTER);
        answer6 = new JLabel("Answer 6", answer6.CENTER);
        answer7 = new JLabel("Answer 7", answer7.CENTER);
        answer8 = new JLabel("Answer 8", answer8.CENTER);
        answer9 = new JLabel("Answer 9", answer9.CENTER);
        answer10 = new JLabel("Answer 10", answer10.CENTER);
        
        answer1.setFont(new Font("TimesRoman", Font.BOLD, 18));
        answer2.setFont(new Font("TimesRoman", Font.BOLD, 18));
        answer3.setFont(new Font("TimesRoman", Font.BOLD, 18));
        answer4.setFont(new Font("TimesRoman", Font.BOLD, 18));
        answer5.setFont(new Font("TimesRoman", Font.BOLD, 18));
        answer6.setFont(new Font("TimesRoman", Font.BOLD, 18));
        answer7.setFont(new Font("TimesRoman", Font.BOLD, 18));
        answer8.setFont(new Font("TimesRoman", Font.BOLD, 18));
        answer9.setFont(new Font("TimesRoman", Font.BOLD, 18));
        answer10.setFont(new Font("TimesRoman", Font.BOLD, 18));
               
        score = new JLabel("");

        lblScore = new JLabel("Score");

        btnCheckScore = new JButton("Check Score");
        btnShowAnswer = new JButton("Show Answer");
               
        answer = new JTextArea();
        answer.setPreferredSize(new Dimension(100, 220));
        /*Adapted from 
        Stackoverflow.(2010).How to change the size of the font of a JLabel to take the maximum size. 
        Retrieved from 
        https://stackoverflow.com/questions/2715118/how-to-change-the-size-of-the-font-of-a-jlabel-to-take-the-maximum-size. 
        Date accessed on 21st June*/
        answer.setFont(new Font("TimesRoman", Font.BOLD, 16));
        answer.setForeground(Color.red);

        score.setPreferredSize(new Dimension(50, 50));
        score.setFont(new Font("TimesRoman", Font.BOLD, 16));
        score.setForeground(Color.black);

        lblScore.setPreferredSize(new Dimension(50, 50));
        lblScore.setFont(new Font("TimesRoman", Font.BOLD, 16));
        lblScore.setForeground(Color.blue);

        bCS = new ButtonCheckScore();

        bSA = new ButtonShowAnswer();
    }

    public JPanel createGUI()
    {
        btnCheckScore.addActionListener(bCS);
        btnShowAnswer.addActionListener(bSA);

        pnlButton.add(animalList);
        pnlButton.add(btnCheckScore);
        pnlButton.add(btnShowAnswer);
        pnlButton.add(lblScore);
        pnlButton.add(score);

        pnlLabel.add(answer1);
        pnlLabel.add(answer2);
        pnlLabel.add(answer3);
        pnlLabel.add(answer4);
        pnlLabel.add(answer5);
        pnlLabel.add(answer6);
        pnlLabel.add(answer7);
        pnlLabel.add(answer8);
        pnlLabel.add(answer9);
        pnlLabel.add(answer10);

        pnlTextArea.add(answer);

        pnlBigpnl.add(pnlButton);
        pnlBigpnl.add(pnlLabel);
        pnlBigpnl.add(pnlTextArea);
        pnlBigpnl.add(pnlScore);

        return pnlBigpnl;
    }

    public void displayAnimalName() 
    {
        switch (counter) 
        {
            /* Adapted from
            Stackoverflow.(2012).
            Java ComboBox Different Value to Name. Retrieved from
            https://stackoverflow.com/questions/10387932/java-combobox-different-value-to-name. 
            Date accessed on 21st June
            */
            case 0:
                answer1.setText(animalList.getSelectedItem().toString());
                break;
            case 1:
                answer2.setText(animalList.getSelectedItem().toString());
                break;
            case 2:
                answer3.setText(animalList.getSelectedItem().toString());
                break;
            case 3:
                answer4.setText(animalList.getSelectedItem().toString());
                break;
            case 4:
                answer5.setText(animalList.getSelectedItem().toString());
                break;
            case 5:
                answer6.setText(animalList.getSelectedItem().toString());
                break;
            case 6:
                answer7.setText(animalList.getSelectedItem().toString());
                break;
            case 7:
                answer8.setText(animalList.getSelectedItem().toString());
                break;
            case 8:
                answer9.setText(animalList.getSelectedItem().toString());
                break;
            case 9:
                answer10.setText(animalList.getSelectedItem().toString());
                break;
            default:
        }
        counter++;
    }

    public String TranslateToName(Integer name)
    {
        String newName = "";
        if (name == 2) 
        {
            newName = "cat";
        } 
        else if (name == 1) 
        {
            newName = "bird";
        } 
        else if (name == 3) 
        {
            newName = "dog";
        } 
        else if (name == 4) 
        {
            newName = "fox";
        } 
        else if (name == 5) 
        {
            newName = "lion";
        } 
        else if (name == 6) 
        {
            newName = "lizard";
        } 
        else if (name == 7) 
        {
            newName = "panda";
        } 
        else if (name == 8) 
        {
            newName = "rabit";
        } 
        else if (name == 9) 
        {
            newName = "snake";
        } 
        else if (name == 10) 
        {
            newName = "rat";
        } 
        else if (name == 11) 
        {
            newName = "cow";
        } 
        else if (name == 12) 
        {
            newName = "bear";
        } 
        else if (name == 13) 
        {
            newName = "octopus";
        } 
        else if (name == 14) 
        {
            newName = "Hippopotanus";
        } 
        else if (name == 15) 
        {
            newName = "owl";
        }
        else if (name==16)
        {
            newName="leopard";
        }
        else if(name==17)
        {
            newName="ziraf";
        }
        else if (name==18)
        {
            newName="octopus";
        }
        return newName;
    }

    public String TranslateImageName(String name) 
    {
        String newName = "";
        if (name.equals("cat")) 
        {
            newName = "2";
        } 
        else if (name.equals("bird")) 
        {
            newName = "1";
        } 
        else if (name.equals("dog")) 
        {
            newName = "3";
        } 
        else if (name.equals("fox")) 
        {
            newName = "4";
        } 
        else if (name.equals("lion")) 
        {
            newName = "5";
        }
        else if (name.equals("lizard"))
        {
            newName = "6";
        } 
        else if (name.equals("panda")) 
        {
            newName = "7";
        } 
        else if (name.equals("rabit")) 
        {
            newName = "8";
        } 
        else if (name.equals("snake"))
        {
            newName = "9";
        } 
        else if (name.equals("tiger")) 
        {
            newName = "10";
        } 
        else if (name.equals("rat")) 
        {
            newName = "11";
        } 
        else if (name.equals("cow")) 
        {
            newName = "12";
        } 
        else if (name.equals("ziraffe")) 
        {
            newName = "13";
        } 
        else if (name.equals("Hippopotanus")) 
        {
            newName = "14";
        } 
        else if (name.equals("owl")) 
        {
            newName = "15";
        }
        else if(name.equals("leopard"))
        {
            newName="16";
        }
         else if(name.equals("ziraf"))
        {
            newName="17";
        }
        else if(name.equals("octopus"))
        {
            newName="18";
        }
        return newName;
    }

    public void checkAnswer(JLabel ans, int idx) 
    {
        if (ans.getText().equals("cat"))
        {
            String myAnswer = TranslateImageName(ans.getText());
            yourAnswer[idx] = Integer.parseInt(myAnswer);
        }

        if (ans.getText().equals("dog")) 
        {
            String myAnswer = TranslateImageName(ans.getText());
            yourAnswer[idx] = Integer.parseInt(myAnswer);
        }
        if (ans.getText().equals("panda"))
        {
            String myAnswer = TranslateImageName(ans.getText());
            yourAnswer[idx] = Integer.parseInt(myAnswer);
        }

        if (ans.getText().equals("rabit")) 
        {
            String myAnswer = TranslateImageName(ans.getText());
            yourAnswer[idx] = Integer.parseInt(myAnswer);
        }

        if (ans.getText().equals("tiger")) 
        {
            String myAnswer = TranslateImageName(ans.getText());
            yourAnswer[idx] = Integer.parseInt(myAnswer);
        }

        if (ans.getText().equals("snake")) 
        {
            String myAnswer = TranslateImageName(ans.getText());
            yourAnswer[idx] = Integer.parseInt(myAnswer);
        }

        if (ans.getText().equals("fox")) 
        {
            String myAnswer = TranslateImageName(ans.getText());
            yourAnswer[idx] = Integer.parseInt(myAnswer);
        }

        if (ans.getText().equals("lion")) 
        {
            String myAnswer = TranslateImageName(ans.getText());
            yourAnswer[idx] = Integer.parseInt(myAnswer);
        }

        if (ans.getText().equals("bird")) 
        {
            String myAnswer = TranslateImageName(ans.getText());
            yourAnswer[idx] = Integer.parseInt(myAnswer);
        }

        if (ans.getText().equals("lizard")) 
        {
            String myAnswer = TranslateImageName(ans.getText());
            yourAnswer[idx] = Integer.parseInt(myAnswer);
        }
        if (ans.getText().equals("leopard")) 
        {
            String myAnswer = TranslateImageName(ans.getText());
            yourAnswer[idx] = Integer.parseInt(myAnswer);
        }
        if (ans.getText().equals("bear")) 
        {
            String myAnswer = TranslateImageName(ans.getText());
            yourAnswer[idx] = Integer.parseInt(myAnswer);
        }
        if (ans.getText().equals("octopus")) 
        {
            String myAnswer = TranslateImageName(ans.getText());
            yourAnswer[idx] = Integer.parseInt(myAnswer);
        }
        if (ans.getText().equals("owl")) 
        {
            String myAnswer = TranslateImageName(ans.getText());
            yourAnswer[idx] = Integer.parseInt(myAnswer);
        }
        if (ans.getText().equals("ziraf")) 
        {
            String myAnswer = TranslateImageName(ans.getText());
            yourAnswer[idx] = Integer.parseInt(myAnswer);
        }
    }

    public class ButtonCheckScore implements ActionListener
    {

        public void actionPerformed(ActionEvent ae)
        {
            intScore = 0;
            checkAnswer(answer1, 0);
            checkAnswer(answer2, 1);
            checkAnswer(answer3, 2);
            checkAnswer(answer4, 3);
            checkAnswer(answer5, 4);
            checkAnswer(answer6, 5);
            checkAnswer(answer7, 6);
            checkAnswer(answer8, 7);
            checkAnswer(answer9, 8);
            checkAnswer(answer10, 9);
            for (int x = 0; x <= 9; x++) 
            {
                if (answerArray[x] == yourAnswer[x]) 
                {
                    intScore += 10;
                }
            }
            score.setText(intScore.toString());
        }
    }

    public class ButtonShowAnswer implements ActionListener 
    {

        public void actionPerformed(ActionEvent ae) 
        {
            String name = "";
            System.out.println("Before");
            for (int x = 0; x <= 9; x++) 
            {
                name = TranslateToName(answerArray[x]);
                System.out.println(name);
                answer.append(name + "\n");
            }
        }
    }
}
