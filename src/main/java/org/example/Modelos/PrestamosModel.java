package org.example.Modelos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PrestamosModel {
    private LibrosModel librosModel;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;

    public PrestamosModel(LibrosModel _librosModel,
                          LocalDate _fechaPrestamo,
                          int duracionDias) {
        this.librosModel = _librosModel;
        this.fechaPrestamo = _fechaPrestamo;
        this.fechaDevolucion = _fechaPrestamo.plusDays(5);
    }

    public LibrosModel getLibrosModel() {
        return librosModel;
    }
    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }
    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setLibrosModel(LibrosModel librosModel) {
        this.librosModel = librosModel;
    }
    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }
    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String mostrarInformacion(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return String.format("Nombre: %s, Fecha de préstamo: %s, Fecha de devolución: %s",
                librosModel.getNoLibro(), fechaPrestamo.format(formatter), fechaDevolucion.format(formatter));
    }
}
