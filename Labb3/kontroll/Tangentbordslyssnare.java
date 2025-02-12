package Labb3.kontroll;

import Labb3.modell.Nivå;
import Labb3.modell.Väderstreck;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

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
		System.out.println("KeyPressed: " + KeyEvent.getKeyText(key));  // Skriv ut vilken tangent som trycktes ned
		switch (key) {
			case KeyEvent.VK_W: // W
				enNivå.hoppaÅt(Väderstreck.NORR);
				System.out.println("Hoppa åt norr");
				enNivå.hoppaÅt(Väderstreck.VÄSTER);
				System.out.println("Hoppa åt Väster");
				break;
			case KeyEvent.VK_S: // S
				enNivå.hoppaÅt(Väderstreck.SÖDER);
				System.out.println("Hoppa åt Söder");
				break;
			case KeyEvent.VK_D: // D
				enNivå.hoppaÅt(Väderstreck.ÖSTER);
				System.out.println("Hoppa åt Öster");
				break;
			default:
				System.out.println("Ogiltig tangent");
				break;
		}


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
		System.out.println("KeyTyped: " + e.getKeyChar()); // Skriv ut vilken tangent som trycktes (som tecken)
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("KeyReleased: " + KeyEvent.getKeyText(e.getKeyCode()));  // Skriv ut när tangenten släpptes

		// Används inte men måste implementeras eftersom keyReleased finns is
		// gränssnittet KeyListener.
	}
}
