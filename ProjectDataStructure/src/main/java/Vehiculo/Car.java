package Vehiculo;

public class Car {

    /*
    Atributos del Vehículo: Placa, modelo, año, color, cilindrada, 
    tipo de combustible, capacidad de pasajeros, precio de alquiler por día, 
    Estado (Disponible, Alquilado, En reparación, Fuera de circulación.)
     */

    //Atributos
    private String Placa;
    private String Marca;
    private String Model;
    private int Years;
    private String Color;
    private String CylinderCapacity;
    private int Passangers;
    private double Price;
    private String Extra;
    private String Condition;
    private String estado;
    private int cantAlquilado;

    public Car() {
    }
   
    public Car(String Placa, String Marca, String Model, int Years, String Color, String CylinderCapacity, int Passangers, double Price, String Extra, String Condition, String estado, int cantAlquilado) {
        this.Placa = Placa;
        this.Marca = Marca;
        this.Model = Model;
        this.Years = Years;
        this.Color = Color;
        this.CylinderCapacity = CylinderCapacity;
        this.Passangers = Passangers;
        this.Price = Price;
        this.Extra = Extra;
        this.Condition = Condition;
        this.estado = estado;
        this.cantAlquilado = cantAlquilado;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public int getYears() {
        return Years;
    }

    public void setYears(int Years) {
        this.Years = Years;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getCylinderCapacity() {
        return CylinderCapacity;
    }

    public void setCylinderCapacity(String CylinderCapacity) {
        this.CylinderCapacity = CylinderCapacity;
    }

    public int getPassangers() {
        return Passangers;
    }

    public void setPassangers(int Passangers) {
        this.Passangers = Passangers;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public String getExtra() {
        return Extra;
    }

    public void setExtra(String Extra) {
        this.Extra = Extra;
    }

    public String getCondition() {
        return Condition;
    }

    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCantAlquilado() {
        return cantAlquilado;
    }

    public void setCantAlquilado(int cantAlquilado) {
        this.cantAlquilado = cantAlquilado;
    }

    @Override
    public String toString() {
        return "\nPlaca:" + Placa + ", Marca:" + Marca + ", Modelo:" + Model + ", Anios:" + Years + ", Color:" + Color + ", Capacidad de Cilindraje:" + CylinderCapacity +"\n"+ "Pasajeros:" + Passangers + ", Precio:" + Price + ", Extras:" + Extra + ", Condicion:" + Condition + ", Estado:" + estado + ", Cantidadd Alquilado:" + cantAlquilado;
    }
}
  


