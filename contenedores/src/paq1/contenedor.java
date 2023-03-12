package paq1;

public class contenedor {
    private int numero_identificación;
    private double peso;
    private String descripción;
    private String empresa_remitente;
    private String empresa_receptora;
    private String país_procedencia;
    private int prioridad;
    private boolean aduanas;
    private String estado;

    public int getNumero_identificación() {
        return numero_identificación;
    }

    public void setNumero_identificación(int numero_identificación) {
        this.numero_identificación = numero_identificación;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public String getEmpresa_remitente() {
        return empresa_remitente;
    }

    public void setEmpresa_remitente(String empresa_remitente) {
        this.empresa_remitente = empresa_remitente;
    }

    public String getEmpresa_receptora() {
        return empresa_receptora;
    }

    public void setEmpresa_receptora(String empresa_receptora) {
        this.empresa_receptora = empresa_receptora;
    }

    public String getPaís_procedencia() {
        return país_procedencia;
    }

    public void setPaís_procedencia(String país_procedencia) {
        this.país_procedencia = país_procedencia;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public boolean isAduanas() {
        return aduanas;
    }

    public void setAduanas(boolean aduanas) {
        this.aduanas = aduanas;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
