package ourgui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GraphicsEnvironment;
import java.awt.Label;
import java.awt.TextField;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

public class gui extends JFrame {
	static JFrame out=new JFrame("商圈评测");
	JTabbedPane p; 
	Icon icon[];
	String[] imageName = {"Image/人气.png", "b.gif", "c.gif"};
	
	public gui() {
		setResizable(false);
		setBounds(100,100,1223,630);
		setVisible(true);
		icon = new Icon[imageName.length];
		
		for (int i = 0; i < icon.length; i++) {
			icon[i] = new ImageIcon(imageName[i]);
		}
		p = new JTabbedPane(JTabbedPane.TOP);
		//p = new JTabbedPane(JTabbedPane.LEFT);
		
		
		
		JPanel jp=new JPanel(/*icon[0]*/);
		jp.setLayout(null);
		ADDBk(jp, icon[0]);
		//ADDtext(jp, "hello world");
		
		p.add("福州最受欢迎的商圈", jp);
		p.add("美食聚集地", new JPanel(/*icon[i]*/));
		p.add("服饰类综合评分最高", new JPanel(/*icon[i]*/));
		p.add("人均消费", new JPanel(/*icon[i]*/));
		p.validate();
		
		
		add(p, BorderLayout.CENTER);
		validate();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	public static void ADDtext(JPanel jp,String inString) {
		TextField add=new TextField();
		add.setBounds(0,0,100,100);
		add.setText(inString);
		jp.add(add);
		
	}
	public static void ADDBk(JPanel jp,Icon ic) {
		JLabel bkg=new JLabel(ic);
		bkg.setBounds(0,0,1212,554);
		jp.add(bkg);
		jp.setOpaque(false);
	}
	//public static void ADDinc
	public static void main(String[] argv) {
		try {
    		BeautyEyeLNFHelper.frameBorderStyle=BeautyEyeLNFHelper.frameBorderStyle.generalNoTranslucencyShadow;
    		org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
    		UIManager.put("ToolBar.isPaintPlainBackground", Boolean.TRUE);
    		UIManager.put("RootPane.setupButtonVisible", false);
    	}catch (Exception e) {
    		
    	}
		new gui();
	}
}

