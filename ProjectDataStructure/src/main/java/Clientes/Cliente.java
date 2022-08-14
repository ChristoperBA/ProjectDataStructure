package Clientes;

<<<<<<< HEAD
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
=======
public class Cliente {

    private String id;
    private String nomCompleto;
    private String fechaNacimiento;
    private String correo;
    private int categoria;
    private int cantAlquilado;
>>>>>>> 1b9d9c3e17fe495aafc33ee2d168fb7a41348431

    public Cliente() {
    }

    public Cliente(String id, String nomCompleto, String fechaNacimiento, String correo, int categoria, int cantAlquilado) {
        this.id = id;
        this.nomCompleto = nomCompleto;
        this.fechaNacimiento = fechaNacimiento;
        this.correo = correo;
<<<<<<< HEAD
    }
    public String getCedula() {
        return cedula;
=======
        this.categoria = categoria;
        this.cantAlquilado = cantAlquilado;
    }

    public String getId() {
        return id;
>>>>>>> 1b9d9c3e17fe495aafc33ee2d168fb7a41348431
    }

    public void setCedula(String Cedula) {
        this.cedula = Cedula;
    }

<<<<<<< HEAD
=======
    public String getNomCompleto() {
        return nomCompleto;
    }

    public void setNomCompleto(String nomCompleto) {
        this.nomCompleto = nomCompleto;
    }

>>>>>>> 1b9d9c3e17fe495aafc33ee2d168fb7a41348431
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

<<<<<<< HEAD
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
=======
    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
>>>>>>> 1b9d9c3e17fe495aafc33ee2d168fb7a41348431
        this.categoria = categoria;
    }

    public int getCantAlquilado() {
        return cantAlquilado;
    }

    public void setCantAlquilado(int cantAlquilado) {
        this.cantAlquilado = cantAlquilado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nDatos del cliente");
        sb.append("\nId: ").append(id);
        sb.append("\nNombre completo: ").append(nomCompleto);
        sb.append("\nFecha de nacimiento: ").append(fechaNacimiento);
        sb.append("\nCorreo: ").append(correo);
        sb.append("\nCategoria: ").append(categoria);
        sb.append("\nCantidad que ha alquilado: ").append(cantAlquilado);
        sb.append("\n");
        return sb.toString();
    }
    
}
