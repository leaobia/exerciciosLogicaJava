package tabuada;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MinhaTabuada extends JFrame {

    private JTextField inputNumero;
    private JTextField minimoMultiplicador;
    private JTextField maximoMultiplicador;
    private JButton btnGerarTabuada;
    private JTextArea areaTabuada;

    public MinhaTabuada() {
        super("Tabuada da FATEC");

        // Criar componentes
        inputNumero = new JTextField(3);
        minimoMultiplicador = new JTextField(3);
        maximoMultiplicador = new JTextField(3);
        btnGerarTabuada = new JButton("Gerar Tabuada");
        areaTabuada = new JTextArea(10, 20);
        areaTabuada.setEditable(false);
        JPanel painelEsquerda = new JPanel();

        setLayout(new BorderLayout());

        // Criar painel para inputs

        painelEsquerda.setLayout(new GridLayout(15, 1));
        painelEsquerda.add(new JLabel("Digite o multiplicando:"));
        painelEsquerda.add(inputNumero);
        painelEsquerda.add(new JLabel("Mínimo Multiplicador:"));
        painelEsquerda.add(minimoMultiplicador);
        painelEsquerda.add(new JLabel("Máximo Multiplicador:"));
        painelEsquerda.add(maximoMultiplicador);
        painelEsquerda.add(btnGerarTabuada);

        // Adicionar paineis ao frame
        add(painelEsquerda, BorderLayout.WEST);
        add(new JScrollPane(areaTabuada), BorderLayout.CENTER);

        // Ação do botão
        btnGerarTabuada.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gerarTabuada();
            }
        });

        // Configurações da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void gerarTabuada() {
        String numeroStr = inputNumero.getText();
        String minimoStr = minimoMultiplicador.getText();
        String maximoStr = maximoMultiplicador.getText();
        try {
            int numero = Integer.parseInt(numeroStr);
            int minimo = Integer.parseInt(minimoStr);
            int maximo = Integer.parseInt(maximoStr);
            StringBuilder tabuada = new StringBuilder();
            for (int i = minimo; i <= maximo; i++) {
                tabuada.append(numero).append(" x ").append(i).append(" = ").append(numero * i).append("\n");
            }
            areaTabuada.setText(tabuada.toString());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, insira um número válido.", "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new MinhaTabuada();
    }
}