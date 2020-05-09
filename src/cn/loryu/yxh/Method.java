package cn.loryu.yxh;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Method {

    //创建窗体对象
    public Frame frame = new Frame("营销号");
    public static Method instance = new Method();

    public void init() {
        //初始化窗口
        frame.initFrame();
        //按钮事件
        frame.jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Method.instance.judge();
            }
        });

        //文本框3按下回车后事件
        frame.jTextField03.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Method.instance.judge();
            }
        });
    }

    public void yxhPrint() {
        //创建StringBuilder对象
        StringBuilder stringBuilder = new StringBuilder();

        //清除文本域原来的文字
        frame.jTextArea.setText("");

        stringBuilder.append("  ");
        stringBuilder.append(frame.jTextField01.getText());
        stringBuilder.append(frame.jTextField02.getText());
        stringBuilder.append("是怎么回事呢？");
        stringBuilder.append(frame.jTextField01.getText());
        stringBuilder.append("相信大家都很熟悉，但是");
        stringBuilder.append(frame.jTextField01.getText());
        stringBuilder.append(frame.jTextField02.getText());
        stringBuilder.append("是怎么回事呢？\n  ");
        stringBuilder.append(frame.jTextField01.getText());
        stringBuilder.append(frame.jTextField02.getText());
        stringBuilder.append("其实就是因为");
        stringBuilder.append(frame.jTextField03.getText());
        stringBuilder.append("，大家可能会很惊讶");
        stringBuilder.append(frame.jTextField01.getText());
        stringBuilder.append("怎么会");
        stringBuilder.append(frame.jTextField02.getText());
        stringBuilder.append("呢？但事实就是这样，小编也感到很惊讶。\n  这就是关于");
        stringBuilder.append(frame.jTextField01.getText());
        stringBuilder.append(frame.jTextField02.getText());
        stringBuilder.append("的事情了，大家有什么想法呢，欢迎在评论区告诉小编一起讨论哦！");

        frame.jTextArea.setText(stringBuilder.toString());//输出到文本域
    }

    public void judge() {
        //判断输入内容是否为空
        if ("".equals(frame.jTextField01.getText())) {
            //设置弹出对话框按钮字体
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("微软雅黑", Font.PLAIN, 12)));
            //设置弹出对话框文本字体
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("微软雅黑", Font.PLAIN, 12)));
            //弹出对话框
            JOptionPane.showMessageDialog(frame, "请输入主体");
            return;
        }else if ("".equals(frame.jTextField02.getText())) {
            //设置弹出对话框按钮字体
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("微软雅黑", Font.PLAIN, 12)));
            //设置弹出对话框文本字体
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("微软雅黑", Font.PLAIN, 12)));
            //弹出对话框
            JOptionPane.showMessageDialog(frame, "请输入事件");
            return;
        }else if ("".equals(frame.jTextField03.getText())) {
            //设置弹出对话框按钮字体
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("微软雅黑", Font.PLAIN, 12)));
            //设置弹出对话框文本字体
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("微软雅黑", Font.PLAIN, 12)));
            //弹出对话框
            JOptionPane.showMessageDialog(frame, "请输入另一种说法");
            return;
        }
        //调用输出方法
        Method.instance.yxhPrint();
    }

}
