package Labb3;

import Labb3.kontroll.Tangentbordslyssnare;
import Labb3.modell.Nivå;
import Labb3.vy.Målarduk;

import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class GUI extends JFrame implements Observer {

	private Målarduk målarduk;

	public GUI(Nivå enNivå) {

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		enNivå.addObserver(this);

		målarduk = new Målarduk(enNivå);
		målarduk.setPreferredSize(new Dimension(600, 600));
		målarduk.addKeyListener(new Tangentbordslyssnare(enNivå));

		setContentPane(målarduk);
		setVisible(true);
		pack();

	}
	@Override
	public void update(Observable o, Object arg) {
		this.målarduk.repaint();
	}
}
