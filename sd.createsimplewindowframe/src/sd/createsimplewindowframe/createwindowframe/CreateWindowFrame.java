package sd.createsimplewindowframe.createwindowframe;

import java.awt.Dimension;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

import no.ntnu.item.arctis.runtime.Block;

public class CreateWindowFrame extends Block {

	public void openPopup() {
		
		JFrame frame = new JFrame("First Frame");
		frame.addWindowListener(new WindowListener() {
			@Override
			public void windowActivated(WindowEvent e) {
			}

			@Override
			public void windowClosed(WindowEvent e) {
			}

			@Override
			public void windowClosing(WindowEvent e) {
				sendToBlock("EXIT");
			}

			@Override
			public void windowDeactivated(WindowEvent e) {
			}

			@Override
			public void windowDeiconified(WindowEvent e) {
			}

			@Override
			public void windowIconified(WindowEvent e) {
			}

			@Override
			public void windowOpened(WindowEvent e) {
			}
		});
		frame.pack();
		frame.setSize(new Dimension(400, 400));
		frame.setVisible(true);
	}

}
