import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        double l1 = 0, l2 = 0, l3 = 0;

        // Loop para garantir que os valores de entrada sejam válidos
        while (true) {
            String l1Str = JOptionPane.showInputDialog("Comprimento do lado 1:");
            if (l1Str == null || l1Str.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor, insira um valor para o lado 1.");
                continue;
            }
            try {
                l1 = Double.parseDouble(l1Str);
                if (l1 <= 0) {
                    JOptionPane.showMessageDialog(null, "O valor do lado 1 deve ser positivo.");
                    continue;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, insira um valor numérico válido para o lado 1.");
                continue;
            }

            String l2Str = JOptionPane.showInputDialog("Comprimento do lado 2:");
            if (l2Str == null || l2Str.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor, insira um valor para o lado 2.");
                continue;
            }
            try {
                l2 = Double.parseDouble(l2Str);
                if (l2 <= 0) {
                    JOptionPane.showMessageDialog(null, "O valor do lado 2 deve ser positivo.");
                    continue;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, insira um valor numérico válido para o lado 2.");
                continue;
            }

            String l3Str = JOptionPane.showInputDialog("Comprimento do lado 3:");
            if (l3Str == null || l3Str.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor, insira um valor para o lado 3.");
                continue;
            }
            try {
                l3 = Double.parseDouble(l3Str);
                if (l3 <= 0) {
                    JOptionPane.showMessageDialog(null, "O valor do lado 3 deve ser positivo.");
                    continue;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, insira um valor numérico válido para o lado 3.");
                continue;
            }

            if (verificaTriangulo(l1, l2, l3)) {
                break; // Sai do loop se os valores forem válidos e formarem um triângulo
            } else {
                JOptionPane.showMessageDialog(null, "Os lados não formam um triângulo válido!");
            }
        }

        Triangulo triangulo = new Triangulo(l1, l2, l3);

        String mensagem =   "Tipo de Triângulo: " + triangulo.tipoTriangulo() + "\n" +
                            "Área: " + triangulo.calculaArea() + "\n" +
                            "Perímetro: " + triangulo.calculaPerimetro() + "\n" +
                            "É Equilátero? " + triangulo.verificaEquilatero();

        JOptionPane.showMessageDialog(null, mensagem);
    }

    public static boolean verificaTriangulo(double lado1, double lado2, double lado3) {
        return lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1;
    }
}
