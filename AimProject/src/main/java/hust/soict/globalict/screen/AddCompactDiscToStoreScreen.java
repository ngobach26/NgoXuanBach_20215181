package hust.soict.globalict.screen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import hust.soict.globalict.media.*;

public class AddCompactDiscToStoreScreen extends AddItemToStoreScreen{
	JPanel createBottom() {
		JPanel bottom = new JPanel();
		JButton addMedia = new JButton("Add to STORE");
		addMedia.addActionListener(e ->{
			String title = titleInput.getText();
			String category = categoryInput.getText();
			float cost = Float.parseFloat(costInput.getText());
			CompactDisc cd = new CompactDisc(title, category, cost);
			StoreScreen.getStore().addMedia(cd);
			new StoreScreen(StoreScreen.getStore());
			});
		bottom.add(addMedia);
		return bottom;
	}
	public AddCompactDiscToStoreScreen(){
		this.setMediaType("CD");
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		
		cp.add(createNorth(), BorderLayout.NORTH);
		cp.add(createCenter(), BorderLayout.CENTER);
		cp.add(createBottom(),BorderLayout.SOUTH);
		
		setVisible(true);
		setTitle("UPDATE");
		setSize(1024, 768);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new AddCompactDiscToStoreScreen();
	}
}
