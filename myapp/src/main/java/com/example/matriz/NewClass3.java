package myapp.src.matriz;
/**
 *
 * @author Lloris
 */
public class NewClass3 {
    public static void main(String[] args) {
        String url = "https://example.com";
        int size = 30; // Tamanho do QR code

        // Matriz representando o QR code
        boolean[][] qrCode = generateQRCode(url, size);

        // Desenho do QR code no terminal
        for (boolean[] row : qrCode) {
            for (boolean pixel : row) {
                System.out.print(pixel ? "██" : "  "); // Usando caracteres ASCII para representar pixels
            }
            System.out.println();
        }
    }

    public static boolean[][] generateQRCode(String url, int size) {
        boolean[][] qrCode = new boolean[size][size];

        // Simulação de um QR code simples usando lógica básica
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                qrCode[i][j] = (i + j) % 2 == 0; // Alternando pixels para simular um QR code
            }
        }

        return qrCode;
    }
}
