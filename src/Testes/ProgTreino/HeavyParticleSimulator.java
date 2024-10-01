package Testes.ProgTreino;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;

public class HeavyParticleSimulator extends JPanel implements ActionListener {
    private static final int PARTICLE_COUNT = 100000; // número de partículas maior
    private static final double GRAVITY = 0.98; // aceleração gravitacional
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int RADIUS = 3; // Raio de cada partícula para colisão

    private ArrayList<Particle> particles = new ArrayList<>();
    private Timer timer;
    private Random random = new Random();

    public HeavyParticleSimulator() {
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.setBackground(Color.BLACK);
        this.timer = new Timer(16, this); // aproximadamente 60 FPS
        this.timer.start();

        // Adiciona as partículas
        for (int i = 0; i < PARTICLE_COUNT; i++) {
            particles.add(new Particle(random.nextInt(WIDTH), random.nextInt(HEIGHT), this));
        }

        // Adiciona listener de clique para adicionar mais partículas
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                particles.add(new Particle(e.getX(), e.getY(), HeavyParticleSimulator.this));
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.WHITE);

        // Renderiza cada partícula
        for (Particle particle : particles) {
            g2d.fillOval((int) particle.getX(), (int) particle.getY(), RADIUS * 2, RADIUS * 2);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (Particle particle : particles) {
            particle.update();
        }
        checkCollisions(); // Verifica colisões entre partículas
        repaint(); // Redesenha a tela
    }

    // Método para verificar colisões entre partículas
    private void checkCollisions() {
        for (int i = 0; i < particles.size(); i++) {
            Particle p1 = particles.get(i);
            for (int j = i + 1; j < particles.size(); j++) {
                Particle p2 = particles.get(j);
                double dx = p1.getX() - p2.getX();
                double dy = p1.getY() - p2.getY();
                double distance = Math.sqrt(dx * dx + dy * dy);
                if (distance < RADIUS * 2) {
                    // Colisão detectada - inverte a velocidade das partículas
                    double tempVx = p1.vx;
                    double tempVy = p1.vy;
                    p1.vx = p2.vx;
                    p1.vy = p2.vy;
                    p2.vx = tempVx;
                    p2.vy = tempVy;
                }
            }
        }
    }

    // Getters para acessar as variáveis privadas
    public double getGravity() {
        return GRAVITY;
    }

    public int getSimWidth() {
        return WIDTH;
    }

    public int getSimHeight() {
        return HEIGHT;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Simulação de Partículas Pesada com Colisões");
        HeavyParticleSimulator simulator = new HeavyParticleSimulator();
        frame.add(simulator);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

class Particle {
    public double x, y;
    public double vx, vy;
    private static final double FRICTION = 0.99; // Reduz a velocidade com o tempo
    private HeavyParticleSimulator simulator;

    public Particle(int x, int y, HeavyParticleSimulator simulator) {
        this.x = x;
        this.y = y;
        this.vx = (Math.random() - 0.5) * 10;
        this.vy = (Math.random() - 0.5) * 10;
        this.simulator = simulator;
    }

    public void update() {
        // A gravidade afeta a velocidade no eixo Y
        vy += simulator.getGravity();

        // Atualiza a posição com base na velocidade
        x += vx;
        y += vy;

        // Aplica atrito
        vx *= FRICTION;
        vy *= FRICTION;

        // Colisão com as bordas da janela
        if (x < 0 || x > simulator.getSimWidth()) {
            vx = -vx;
        }
        if (y < 0 || y > simulator.getSimHeight()) {
            vy = -vy;
        }
    }

    // Getters para acessar as coordenadas
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
