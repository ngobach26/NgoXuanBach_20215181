package hust.soict.globalict.screen;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import hust.soict.globalict.cart.*;
import hust.soict.globalict.media.*;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class CartScreen extends JFrame {
	private static Cart cart = new Cart();
	public static Cart getCart() {
		return cart;
	}
	public CartScreen() {
		super();
		JFXPanel fxPanel = new JFXPanel();
		this.add(fxPanel);
		this.setTitle("Cart");
		this.setSize(1024, 768);
		
		Platform.runLater(new Runnable() {
			
			@Override
			public void run() {
				try {
					FXMLLoader loader = new FXMLLoader(getClass().getResource("cart.fxml"));
					CartScreenController controller = new CartScreenController(cart);
					loader.setController(controller);
					Parent root = loader.load();
					fxPanel.setScene(new Scene(root));
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		});
		
		this.setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new CartScreen();
	}

}
