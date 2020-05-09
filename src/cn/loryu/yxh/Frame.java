package cn.loryu.yxh;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    Container container = getContentPane();
    JTextField jTextField01 = new JTextField(20);
    JTextField jTextField02 = new JTextField(20);
    JTextField jTextField03 = new JTextField(20);
    JLabel jLabel01 = new JLabel("主体");
    JLabel jLabel02 = new JLabel("事件");
    JLabel jLabel03 = new JLabel("另一种说法");
    JButton jButton = new JButton("生成");
    JTextArea jTextArea = new JTextArea(10, 20);
    JScrollPane jScrollPane = new JScrollPane(jTextArea);//为文本域增加滚动条

    public Frame(String title) {
        setTitle(title);//设置标题
        setSize(257, 400);//窗口大小
        setLocationRelativeTo(null);//窗口在屏幕中央
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);//不可改变大小
        setVisible(true);//窗口可见
    }

    public void initFrame() {
        container.setBackground(Color.WHITE);//背景色
        container.setLayout(new FlowLayout());//流布局
        jTextArea.setLineWrap(true);//文本域自动换行

        //设置字体
        jTextField01.setFont(new Font("微软雅黑", Font.PLAIN, 12));
        jTextField02.setFont(new Font("微软雅黑", Font.PLAIN, 12));
        jTextField03.setFont(new Font("微软雅黑", Font.PLAIN, 12));
        jLabel01.setFont(new Font("微软雅黑", Font.PLAIN, 12));
        jLabel02.setFont(new Font("微软雅黑", Font.PLAIN, 12));
        jLabel03.setFont(new Font("微软雅黑", Font.PLAIN, 12));
        jTextArea.setFont(new Font("微软雅黑", Font.PLAIN, 12));
        jButton.setFont(new Font("微软雅黑", Font.PLAIN, 12));

        container.add(jLabel01);
        container.add(jTextField01);
        container.add(jLabel02);
        container.add(jTextField02);
        container.add(jLabel03);
        container.add(jTextField03);
        container.add(jButton);
        container.add(jScrollPane);

    }

}
