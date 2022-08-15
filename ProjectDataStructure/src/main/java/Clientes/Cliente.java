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
    
public class Cliente {

    private String cedula;
    private String nomCompleto;
    private String fechaNacimiento;
    private String correo;
    private int categoria;
    private int cantAlquilado;


    public Cliente() {
    }

    public Cliente(String cedula, String nomCompleto, String fechaNacimiento, String correo, int categoria, int cantAlquilado) {
        this.cedula = cedula;
        this.nomCompleto = nomCompleto;
        this.fechaNacimiento = fechaNacimiento;
        this.correo = correo;

    }

        public String getCedula() {
            return cedula;
        }

        public void setCedula(String cedula) {
            this.cedula = cedula;
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
        sb.append("\nId: ").append(cedula);
        sb.append("\nNombre completo: ").append(nomCompleto);
        sb.append("\nFecha de nacimiento: ").append(fechaNacimiento);
        sb.append("\nCorreo: ").append(correo);
        sb.append("\nCategoria: ").append(categoria);
        sb.append("\nCantidad que ha alquilado: ").append(cantAlquilado);
        sb.append("\n");
        return sb.toString();
    }
    
}
}
