
package com.mycompany.projectdatastructure;


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
    private String Passangers;
    private int Price;
    private String Condition;
    private String Extra;

    public Car(String Placa,String Marca, String Model, int Years, String Color, String CylinderCapacity, String Passangers, int Price, String Condition, String Extra) {
        this.Placa = Placa;
        this.Marca= Marca;
        this.Model = Model;
        this.Years = Years;
        this.Color = Color;
        this.CylinderCapacity = CylinderCapacity;
        this.Passangers = Passangers;
        this.Price = Price;
        this.Condition = Condition;
        this.Extra = Extra;
    }
    //Setter and Getters
    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
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

    public String getPassangers() {
        return Passangers;
    }

    public void setPassangers(String Passangers) {
        this.Passangers = Passangers;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int  Price) {
        this.Price = Price;
    }

    public String getCondition() {
        return Condition;
    }

    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    public String getExtra() {
        return Extra;
    }

    public void setExtra(String Extra) {
        this.Extra = Extra;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    @Override
    public String toString() {
        return "Placa:" + Placa +" Marca:" + Marca +", Model:" + Model + ", Years:" + Years + ", Color:" + Color + 
               ", CylinderCapacity:" +CylinderCapacity + "Passangers:" + Passangers + ", Price:" + 
               Price + ", Condition:" + Condition + ", Extra:" + Extra + '}';
    }
    
    
    
    
    
}
