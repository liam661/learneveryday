package liam.year22.design.observer.v9;


import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author liam661
 * @Date 2022/2/11 15:55
 **/
class Button{
    private List<ActionListener> actionListenerList = new ArrayList<ActionListener>();

    public void buttonPressed(){
        ActionEvent actionEvent = new ActionEvent(System.currentTimeMillis(),this);
        for(int i = 0; i < actionListenerList.size(); i++){
            ActionListener l = actionListenerList.get(i);
            l.actionPerformed(actionEvent);
        }
    }

    public void addActionListener(ActionListener l){
        actionListenerList.add(l);
    }
}
interface ActionListener {
    public void actionPerformed(ActionEvent e);
}

class MyActionListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("button pressed");
    }
}

class MyActionListener2 implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("button pressed 2!");
    }
}
class ActionEvent{
    long when;
    Object source;

    public ActionEvent(long when, Object source){
        this.when = when;
        this.source = source;
    }

    public long getWhen() {
        return when;
    }

    public Object getSource() {
        return source;
    }

}

public class Test {
    public static void main(String [] args){
        Button b = new Button();
        b.addActionListener(new MyActionListener());
        b.addActionListener(new MyActionListener2());
        b.buttonPressed();
    }
}
