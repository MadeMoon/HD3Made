package org.example.Vistas;

import org.example.Modelos.LibrosModel;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultTreeModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Vlibros extends JDialog{
    private JPanel VPLibros;
    private JTextField txtnoLibro;
    private JTextField txtNombreLibro;
    private JTextField txtAutorLibro;
    private JTextField txtGeneroLibro;
    private JButton BRegistrar;
    private JTable LibrosR;
    private LibrosModel libro = new LibrosModel();

    public Vlibros(){
        setContentPane(VPLibros);
        setModal(true);
        setSize(800, 600);
        setLocationRelativeTo(null);

        BRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                libro.setNoLibro(Integer.parseInt(txtnoLibro.getText()));
                libro.setNombreLibro(txtNombreLibro.getText());
                libro.setAutorLibro(txtAutorLibro.getText());
                libro.setGeneroLibro(txtGeneroLibro.getText());

                DefaultTableModel model = new DefaultTableModel();
                model.addColumn("No.");
                model.addColumn("Nombre");
                model.addColumn("Autor");
                model.addColumn("Genero");
                

            }
        });
    }



    public static void main (String [] args){
        Vlibros dialog = new Vlibros();
        dialog.setVisible(true);

    }
}

