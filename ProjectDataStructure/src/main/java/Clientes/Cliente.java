
package Clientes;

public class Cliente 
{
    private String cedula;
    private String nomCompleto;
    private String correo;
    private String fechaNacimiento;
    private String categoria;

    public Cliente() {
        this.cedula = "";
        this.fechaNacimiento = "";
        this.categoria = "";
        this.nomCompleto = "";
        this.correo = "";
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String Cedula) {
        this.cedula = Cedula;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNomCompleto() {
        return nomCompleto;
    }

    public void setNomCompleto(String nomCompleto) {
        this.nomCompleto = nomCompleto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

  
   
    
}
