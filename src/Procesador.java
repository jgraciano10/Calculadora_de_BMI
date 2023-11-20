import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Procesador implements ActionListener {
    private captarDatos ventana;

    public Procesador(){
        ventana = new captarDatos();
        ventana.setContentPane(ventana.getCaptarDatos());
        ventana.setSize(800, 400);
        ventana.setVisible(true);
        ventana.setListener(this);
        ventana.setLocationRelativeTo(ventana);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()){
            case "Calcular":
                System.out.println("Acabas de presionar el boton de calcular");
                ventana.calcular();
                break;
            case "Limpiar":
                System.out.println("Acabas de presionar el boton de Limpiar");
                ventana.limpiar();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + e.getActionCommand());
        }

    }
}
