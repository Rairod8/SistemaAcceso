package logic;

import Gui.FormUsuarios;

public class DBProyecto {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new FormUsuarios().setVisible(true);
        });
    }
}
