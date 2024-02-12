package Aventura;

import java.io.IOException;
import java.util.Scanner;

public class aventura {
	public static void main(String[] args) throws IOException {

		// Constante del valor del tesoro por descubirir.
		final int tesoro = 4;
		System.out.println("AVISO: Para una mejor experiencia se recomienda aumentar el tamaño de la consola.");
		System.out.println("e incluso en pantalla completa, de esta manera podra leer mejor los parrafos.");
		System.out.println();
		System.out.println("¡Anda, mira quien esta despierto!");
		System.out.println("Te encontramos inconsciente en la playa asi que te hemos traido a nuestro barco.");
		System.out.println("Antes de nada, ¿Como te llamas?");
		System.out.println();
		Scanner scan = new Scanner(System.in);
		String nombre = scan.nextLine();
		System.out.println();
		System.out.println("¡Encantado de conocerte, " + nombre + "!");
		System.out.println("Hemos encontrado esto cerca de donde estabas incosnciente.");
		// Dejo estos prints vacios para que haya espacio entre parrafos.
		System.out.println();
		System.out.println("*El capitan te entrega el mapa del tesoro que estabas buscando");
		System.out.println();
		System.out.println("Imagino que estabas buscando la recompensa en aquella zona tan peligrosa.");
		System.out.println("No tendrías que haber ido solo, esta plagado de monstruos.");
		System.out.println("¡Yo te puedo ayudar! Ten, elige un arma:");
		System.out.println();
		System.out.println("- Escribe un nombre cualquiera de el arma que quieras usar -");
		System.out.println();
		// El usuario puede nombrar cualquier arma que quiera mientras sea una cadena.
		String arma = scan.nextLine();
		System.out.println();
		System.out.println("¿" + arma + "? " + "Te sera muy útil, desde luego.");
		System.out.println();
		System.out.println("¡A la aventura!");
		System.out.println();
		System.out.println("*Bajais del barco y marchais hacia la playa.");
		System.out.println();
		System.out.println("¿Cuántos doblones crees que habran en al tesoro?");
		System.out.println();
		System.out.println(
				"- Responde con un número. Puede ser entero de tres dos digitos y/o con dos demcimales separados por un punto -");
		System.out.println();
		String doblones = scan.nextLine();
		// Convertimos la respuesta del usuario de String a Double.
		double numdoblones = Double.parseDouble(doblones);
		System.out.println();
		System.out.print(numdoblones + " doblones me parecerian pocos, mejor ");
		System.out.printf("%2.2f", numdoblones + 7);
		System.out.println(" ¿No crees?");
		System.out.println();
		System.out.println("*LLegais a la playa infestada de monstruos");
		System.out.println();
		System.out.println("¡Acabemos con ellos!");
		System.out.println();
		System.out.println("*Consigues deshacerte de los mosntruos con tu " + arma + ".");
		System.out.println();
		System.out.println("Al fin terminamos... Has luchado bien, " + nombre + ".");
		System.out.println("Ahora a excavar");
		System.out.println();
		System.out.println("Inexplicablemente, cavar en la arena te cansa más que luchar contra mosntruos.");
		System.out.println();
		System.out.println("¡Al fin lo encontramos!");
		System.out.println("Rápido, saquemos el cofre y abrámoslo");
		System.out.println();
		System.out.println("*Entre los dos sacais el cofre del agujero, lo soltais en la arena y lo abrís");
		System.out.println();
		System.out.println("¡¿" + tesoro + " doblones ?!" + " Que miseria...");
		System.out.println("Bueno, al menos hemos echado la tarde. Ha sido divertido ¿No?");
		System.out.println("Dividamos el tesoro, es lo justo. Eso son " + (tesoro / 2) + "doblones por cabeza.");
		System.out.println("Toma: 🪙🪙");
		System.out.println("Creo que ya es hora de que volvamos, te puedo llevar a tu hogar en mi barco si necesitas.");
		System.out.println();
		System.out.println("*Os marchais agotados de vuelta al barco");
		System.out.println();
		System.out.println("FIN");
		scan.close();
	}
}
