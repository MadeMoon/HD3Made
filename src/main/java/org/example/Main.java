package org.example;

import org.example.Modelos.LibrosModel;
import org.example.Modelos.PrestamosModel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public  static PrestamosModel realizarPrestamo(LibrosModel librosModel, LocalDate fechaPrestamo){
        if (librosModel.isDisponibleLibro()){
            librosModel.setDisponibleLibro(false);
            return new PrestamosModel(librosModel, fechaPrestamo, 5);
        } else {
            return null;
        }
    }
}