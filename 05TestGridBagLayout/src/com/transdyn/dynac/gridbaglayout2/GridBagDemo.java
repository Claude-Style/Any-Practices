package com.transdyn.dynac.gridbaglayout2;
import java.awt.*;
import javax.swing.*;


/**
 * 
 * GridBagLayout是java里面最重要的布局管理器之一，可以做出很复杂的布局，可以说GridBagLayout是必须要学好的的，
 * GridBagLayout 类是一个灵活的布局管理器，它不要求组件的大小相同便可以将组件垂直、水平或沿它们的基线对齐。
 * 每个 GridBagLayout 对象维持一个动态的矩形单元网格，每个组件占用一个或多个这样的单元，该单元被称为显示区域。
 * 下面就通过一个记事本案例去说明GridBagLayout的使用方法。
 * 
 * 分析：
 * 
 * 带有箭头的说明可以拉伸的。
 * 4占用4个格子，6占用4个格子。如果设置6可以拉伸了，那么4也会跟着拉伸。
 * 但是如果设置4拉伸，那么7所在的列也可以拉伸，所以4不能设置拉伸。我们应该设置4是跟随6进行拉伸。
 * 灰色的线是为了看清布局的大概，组件占用的格子数。
 * http://www.cnblogs.com/taoweiji/archive/2012/12/14/2818787.html
 * @author cshao
 *
 */
public class GridBagDemo extends JFrame {
    public static void main(String args[]) {
        GridBagDemo demo = new GridBagDemo();
    }

    public GridBagDemo() {
        init();
        this.setSize(600,600);
        this.setVisible(true);
    }
    public void init() {
        j1open = new JButton("打开");
        j2save = new JButton("保存");
        j3saveas = new JButton("另存为");
        j4panel = new JPanel();
        String[] str = { "java笔记", "C#笔记", "HTML5笔记" };
        j5combo = new JComboBox(str);
        j6text = new JTextField();
        j7clear = new JButton("清空");
        j8list = new JList(str);
        j9tarea = new JTextArea();
        j9tarea.setBackground(Color.PINK);//为了看出效果，设置了颜色
        GridBagLayout layout = new GridBagLayout();
        this.setLayout(layout);
        this.add(j1open);//把组件添加进jframe
        this.add(j2save);
        this.add(j3saveas);
        this.add(j4panel);
        this.add(j5combo);
        this.add(j6text);
        this.add(j7clear);
        this.add(j8list);
        this.add(j9tarea);
        GridBagConstraints s= new GridBagConstraints();//定义一个GridBagConstraints，
        //是用来控制添加进的组件的显示位置
        s.fill = GridBagConstraints.BOTH;
        //该方法是为了设置如果组件所在的区域比组件本身要大时的显示情况
        //NONE：不调整组件大小。
        //HORIZONTAL：加宽组件，使它在水平方向上填满其显示区域，但是不改变高度。
        //VERTICAL：加高组件，使它在垂直方向上填满其显示区域，但是不改变宽度。
        //BOTH：使组件完全填满其显示区域。
        
        
        s.gridwidth=1;//该方法是设置组件水平所占用的格子数，如果为0，就说明该组件是该行的最后一个
        s.weightx = 0;//该方法设置组件水平的拉伸幅度，如果为0就说明不拉伸，不为0就随着窗口增大进行拉伸，0到1之间
        s.weighty=0;//该方法设置组件垂直的拉伸幅度，如果为0就说明不拉伸，不为0就随着窗口增大进行拉伸，0到1之间
        layout.setConstraints(j1open, s);//设置组件
        
        
        s.gridwidth=1;
        s.weightx = 0;
        s.weighty=0;
        layout.setConstraints(j2save, s);
        
        
        s.gridwidth=1;
        s.weightx = 0;
        s.weighty=0;
        layout.setConstraints(j3saveas, s);
        
        
        s.gridwidth=0;//该方法是设置组件水平所占用的格子数，如果为0，就说明该组件是该行的最后一个
        s.weightx = 0;//不能为1，j4是占了4个格，并且可以横向拉伸，
        //但是如果为1，后面行的列的格也会跟着拉伸,导致j7所在的列也可以拉伸
        //所以应该是跟着j6进行拉伸
        s.weighty=0;
        layout.setConstraints(j4panel, s)                 /*j4是"另存为"右侧的空白处，为第一行最后一个*/
        
        
        ;s.gridwidth=2;
        s.weightx = 0;
        s.weighty=0;
        layout.setConstraints(j5combo, s);
        
        
        ;s.gridwidth=4;
        s.weightx = 1;
        s.weighty=0;
        layout.setConstraints(j6text, s);
        
        
        ;s.gridwidth=0;
        s.weightx = 0;
        s.weighty=0;
        layout.setConstraints(j7clear, s);         /*第二行最后一个 clear按钮*/
        
        
        ;s.gridwidth=2;
        s.weightx = 0;
        s.weighty=1;
        layout.setConstraints(j8list, s);
        
        
        ;s.gridwidth=5;
        s.weightx = 0;
        s.weighty=1;               /*列表和文字区域可以纵向拉神*/
        layout.setConstraints(j9tarea, s);
    }
    JButton j1open;
    JButton j2save;
    JButton j3saveas;
    JPanel j4panel;
    JComboBox j5combo;
    JTextField j6text;
    JButton j7clear;
    JList j8list;
    JTextArea j9tarea;
}