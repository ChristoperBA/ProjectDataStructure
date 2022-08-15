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
>>>>>>> f6b087012ae75e98bcd5cbf27ba259acd46f112e
public class Cliente {

    private String cedula;
    private String nomCompleto;
    private String fechaNacimiento;
    private String correo;
    private int categoria;
    private int cantAlquilado;
<<<<<<< HEAD

=======
>>>>>>> f6b087012ae75e98bcd5cbf27ba259acd46f112e

    public Cliente() {
    }

    public Cliente(String cedula, String nomCompleto, String fechaNacimiento, String correo, int categoria, int cantAlquilado) {
        this.cedula = cedula;
        this.nomCompleto = nomCompleto;
        this.fechaNacimiento = fechaNacimiento;
        this.correo = correo;
<<<<<<< HEAD

    }

        public String getCedula() {
            return cedula;
        }

        public void setCedula(String cedula) {
            this.cedula = cedula;
        }
=======
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
>>>>>>> f6b087012ae75e98bcd5cbf27ba259acd46f112e

        public String getNomCompleto() {
            return nomCompleto;
        }

<<<<<<< HEAD
        public void setNomCompleto(String nomCompleto) {
            this.nomCompleto = nomCompleto;
        }
=======
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
>>>>>>> f6b087012ae75e98bcd5cbf27ba259acd46f112e

        public String getFechaNacimiento() {
            return fechaNacimiento;
        }

        public void setFechaNacimiento(String fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
        }

        public String getCorreo() {
            return correo;
        }

<<<<<<< HEAD
        public void setCorreo(String correo) {
            this.correo = correo;
        }

        public int getCategoria() {
            return categoria;
        }

        public void setCategoria(int categoria) {
            this.categoria = categoria;
        }
=======
    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
>>>>>>> f6b087012ae75e98bcd5cbf27ba259acd46f112e

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
