package Clientes;

public class Cliente implements Comparable<Cliente> {

    private String id;
    private String nomCompleto;
    private String fechaNacimiento;
    private String correo;
    private int categoria;
    private int cantAlquilado;

    public Cliente() {
    }

    public Cliente(String id, String nomCompleto, String fechaNacimiento, String correo, int categoria, int cantAlquilado) {
        this.id = id;
        this.nomCompleto = nomCompleto;
        this.fechaNacimiento = fechaNacimiento;
        this.correo = correo;
        this.categoria = categoria;
        this.cantAlquilado = cantAlquilado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomCompleto() {
        return nomCompleto;
    }

    public void setNomCompleto(String nomCompleto) {
        this.nomCompleto = nomCompleto;
    }

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

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
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
        sb.append("\nNacimiento: ").append(fechaNacimiento);
        sb.append("\nCorreo: ").append(correo);
        sb.append("\nCategoria: ").append(categoria);
        sb.append("\nCant. de alquileres: ").append(cantAlquilado);
        sb.append("\n");
        return sb.toString();
    }

    @Override
    public int compareTo(Cliente o) {
        
        if (this.cantAlquilado > o.getCantAlquilado()) {
            return -1;
        } else {
            if (this.cantAlquilado > o.getCantAlquilado()) {
                return 1;
            } else {
                return 0;
            }
        }
        
    }

}
