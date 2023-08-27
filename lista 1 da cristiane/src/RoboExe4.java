public class RoboExe4 {
	private static int direction = 0; // 0: direita, 1: baixo, 2: esquerda, 3: cima
	private static int x = 0;
	private static int y = 0;

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			desloca(i);
			viraDireita();
			desloca(i);
			viraDireita();
			desloca(i);
			viraDireita();
			desloca(i);
			viraDireita();
			viraDireita();
		}
	}

	private static void desloca(int steps) {
		if (direction == 0) {
			x += steps;
		} else if (direction == 1) {
			y += steps;
		} else if (direction == 2) {
			x -= steps;
		} else if (direction == 3) {
			y -= steps;
		}
		// System.out.println("Desloca(" + steps + "): (" + x + ", " + y + ")");
	}

	private static void viraDireita() {
		direction = (direction + 1) % 4;
		System.out.println("ViraDireita: direção " + getDirectionName());
	}

	private static void viraEsquerda() {
		direction = (direction + 3) % 4; // Girar à esquerda é equivalente a girar três vezes à direita
		System.out.println("ViraEsquerda: direção " + getDirectionName());
	}

	private static String getDirectionName() {
		if (direction == 0) {
			return "direita";
		} else if (direction == 1) {
			return "baixo";
		} else if (direction == 2) {
			return "esquerda";
		} else {
			return "cima";
		}
	}
}
