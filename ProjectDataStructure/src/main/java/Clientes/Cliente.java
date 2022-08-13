package Clientes;

public class Cliente {

    private String id;
    private String nomCompleto;
    private String placa;
    private String correo;
    private int fechaNacimiento;
    private double categoria;

    public Cliente() {
        this.id = "";
        this.fechaNacimiento = 0;
        this.categoria = 0.00;
        this.nomCompleto = "";
        this.placa = "";
        this.correo = "";
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNomCompleto() {
        return nomCompleto;
    }

    public void setNomCompleto(String nomCompleto) {
        this.nomCompleto = nomCompleto;
    }

    public double getCategoria() {
        return categoria;
    }

    public void setCategoria(double categoria) {
        this.categoria = categoria;
    }

}
