package liam.year22.design.observer.v9;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @Description
 * @Author liam661
 * @Date 2022/2/11 15:19
 **/
public class TestFrame extends Frame {

    public void lunch(){
        Button b = new Button("press me");
        b.addActionListener(new MyActionListener());
        b.addActionListener(new MyActionListener2());
        this.add(b);
        this.pack();
        this.addWindowFocusListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        this.setLocation(400, 400);
        this.setVisible(true);
    }

    private class MyActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            ((Button)e.getSource()).setLabel("press me again");
            System.out.println("button press");
        }
    }

    private class MyActionListener2 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("button press 2");
        }
    }

    public static void main(String [] args){
        new TestFrame().lunch();
    }
}
