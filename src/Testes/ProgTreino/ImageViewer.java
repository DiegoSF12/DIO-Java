package Testes.ProgTreino;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class ImageViewer extends JFrame {
    private JLabel imageLabel; // Rótulo para exibir a imagem

    public ImageViewer() {
        super("Visualizador de Imagens");

        // Define o layout da janela
        setLayout(new BorderLayout());

        // Botão para abrir o explorador de arquivos
        JButton openButton = new JButton("Abrir Imagem");
        openButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Abre o explorador de arquivos
                JFileChooser fileChooser = new JFileChooser();
                int result = fileChooser.showOpenDialog(null);

                if (result == JFileChooser.APPROVE_OPTION) {
                    // Obtém o arquivo selecionado
                    File selectedFile = fileChooser.getSelectedFile();
                    try {
                        // Carrega a imagem
                        BufferedImage image = ImageIO.read(selectedFile);
                        if (image != null) {
                            // Exibe a imagem no JLabel
                            imageLabel.setIcon(new ImageIcon(image));
                        } else {
                            JOptionPane.showMessageDialog(null, "O arquivo selecionado não é uma imagem válida.");
                        }
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null, "Erro ao carregar a imagem: " + ex.getMessage());
                    }
                }
            }
        });

        // Cria um rótulo vazio para exibir a imagem
        imageLabel = new JLabel();
        imageLabel.setHorizontalAlignment(JLabel.CENTER); // Centraliza a imagem
        imageLabel.setVerticalAlignment(JLabel.CENTER);

        // Adiciona os componentes à janela
        add(openButton, BorderLayout.NORTH); // Botão na parte superior
        add(new JScrollPane(imageLabel), BorderLayout.CENTER); // Imagem no centro com barra de rolagem

        // Configura a janela
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a janela
        setVisible(true);
    }

    public static void main(String[] args) {
        // Inicia a aplicação
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ImageViewer();
            }
        });
    }
}
