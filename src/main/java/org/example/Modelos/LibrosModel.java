package org.example.Modelos;

public class LibrosModel {
    private int noLibro;
    private String nombreLibro;
    private String autorLibro;
    private String generoLibro;
    private boolean disponibleLibro;

    public LibrosModel(int _noLibro,
                       String _nombreLibro,
                       String _autorLibro,
                       String _generoLibro,
                       boolean _disponibleLibro) {
        this.noLibro = _noLibro;
        this.nombreLibro = _nombreLibro;
        this.autorLibro = _autorLibro;
        this.generoLibro = _generoLibro;
        this.disponibleLibro = _disponibleLibro;
    }

    public LibrosModel() {
    }

    public String mostrarInformacion(){
        String disponibilidad = disponibleLibro ? "Disponible" : "No disponible";
        return String.format("No.: %s, Nombre: %s, Autor: %s, Genero: %s, Estado: %s");
    }

    public int getNoLibro() {
        return noLibro;
    }
    public String getNombreLibro() {
        return nombreLibro;
    }
    public String getAutorLibro() {
        return autorLibro;
    }
    public String getGeneroLibro() {
        return generoLibro;
    }
    public boolean isDisponibleLibro() {
        return disponibleLibro;
    }

    public void setNoLibro(int noLibro) {
        this.noLibro = noLibro;
    }
    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }
    public void setAutorLibro(String autorLibro) {
        this.autorLibro = autorLibro;
    }
    public void setGeneroLibro(String generoLibro) {
        this.generoLibro = generoLibro;
    }
    public void setDisponibleLibro(boolean disponibleLibro) {
        this.disponibleLibro = disponibleLibro;
    }


}
