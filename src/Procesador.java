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
                // con este metodo vamos a calcular el Índice de Masa Corporal (BMI) usando la altura y el peso del usuario
                ventana.calcular();
                break;
            case "Limpiar":
                // con este metodo limpiamos la interfaz para volver a empezar

                ventana.limpiar();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + e.getActionCommand());
        }

    }
}
