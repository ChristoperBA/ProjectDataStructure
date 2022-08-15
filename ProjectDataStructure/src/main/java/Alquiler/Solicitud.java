/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Alquiler;

/**
 *
 * @author antho
 */
public class Solicitud {

    private String fecha;
    private String cedulaCliente;
    private int dias;
    private int cantidadPasajeros;
    private String marca;
    private String modelo;
    private String extras;
    private double precioTotal;
    private String placaVehiculo;
    private String categoria;
    private String estadoSolicitud;

    public Solicitud() {
    }

    public Solicitud(String fecha, String cedulaCliente, int dias, int cantidadPasajeros, String marca, String modelo, String extras, double precioTotal, String placaVehiculo, String categoria, String estadoSolicitud) {
        this.fecha = fecha;
        this.cedulaCliente = cedulaCliente;
        this.dias = dias;
        this.cantidadPasajeros = cantidadPasajeros;
        this.marca = marca;
        this.modelo = modelo;
        this.extras = extras;
        this.precioTotal = precioTotal;
        this.placaVehiculo = placaVehiculo;
        this.categoria = categoria;
        this.estadoSolicitud = estadoSolicitud;
    }
    
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(String cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getExtras() {
        return extras;
    }

    public void setExtras(String extras) {
        this.extras = extras;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getPlacaVehiculo() {
        return placaVehiculo;
    }

    public void setPlacaVehiculo(String placaVehiculo) {
        this.placaVehiculo = placaVehiculo;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public String getEstadoSolicitud() {
        return estadoSolicitud;
    }

    public void setEstadoSolicitud(String estadoSolicitud) {
        this.estadoSolicitud = estadoSolicitud;
    }
    
}
