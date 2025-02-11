package Labb3.kontroll;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import Labb3.modell.Nivå;

public class Tangentbordslyssnare implements KeyListener {
	private Nivå enNivå;

	public Tangentbordslyssnare(Nivå enNivå) {
		this.enNivå = enNivå;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO: Skriv klar denna metod som automatiskt anropas så snart
		// användaren tryckt på en tangent på tangentbordet. Metoden ska
		// översätta tangenten till ett väderstreck och sen anropa hoppaÅt i
		// enNivå med detta väderstreck. Här ska

		int key = e.getKeyCode();

		System.out.println(e.getKeyCode);

		// w betyda "hoppa åt NORR",
		// d betyda "hoppa åt ÖSTER",
		// s betyda "hoppa åt SÖDER" och
		// a betyda "hoppa åt VÄSTER".



		switch (e.getKeyCode()) {

		}

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// Används inte men måste implementeras eftersom keyTyped finns i
		// gränssnittet KeyListener.
		System.out.printf(keyEvent);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.printf("KeyEvent e");

		// Används inte men måste implementeras eftersom keyReleased finns is
		// gränssnittet KeyListener.
	}
}
