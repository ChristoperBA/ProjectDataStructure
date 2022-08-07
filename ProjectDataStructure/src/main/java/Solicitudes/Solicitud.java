/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Solicitudes;

import java.util.Date;

/**
 *
 * @author antho
 */
public class Solicitud {

    private Date fecha;
    private String cedulaCliente;
    private int dias;
    private int cantidadPasajeros;
    private String marca;
    private String modelo;
    private int año;
    private String extras;
    private String categoria;
    private String placaVehiculo;
    private double precioTotal;
    private String estadoSolicitud;

    public Solicitud() {
    }

    public Solicitud(String cedulaCliente, int dias, String placaVehiculo, double precioTotal, String categoria, String estadoSolicitud) {
        this.cedulaCliente = cedulaCliente;
        this.dias = dias;
        this.placaVehiculo = placaVehiculo;
        this.precioTotal = precioTotal;
        this.categoria = categoria;
        this.estadoSolicitud = estadoSolicitud;
    }

    public Solicitud(Date fecha, String cedulaCliente, int dias, int cantidadPasajeros, String marca, String modelo, int año, String extras, String categoria, String placaVehiculo, double precioTotal, String estadoSolicitud) {
        this.fecha = fecha;
        this.cedulaCliente = cedulaCliente;
        this.dias = dias;
        this.cantidadPasajeros = cantidadPasajeros;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.extras = extras;
        this.categoria = categoria;
        this.placaVehiculo = placaVehiculo;
        this.precioTotal = precioTotal;
        this.estadoSolicitud = estadoSolicitud;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
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

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
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
    
    public String mostrarSolicitud() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nSolicitud");
        sb.append("Fecha: ").append(fecha);
        sb.append("cedulaCliente=").append(cedulaCliente);
        sb.append(", dias=").append(dias);
        sb.append(", placaVehiculo=").append(placaVehiculo);
        sb.append(", precioTotal=").append(precioTotal);
        sb.append(", categoria=").append(categoria);
        sb.append(", estadoSolicitud=").append(estadoSolicitud);
        sb.append('}');
        return sb.toString();
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nSolicitud");
        sb.append("\nCedula del cliente: ").append(cedulaCliente);
        sb.append("\nDias: ").append(dias);
        sb.append("\nPlaca del vehiculo: ").append(placaVehiculo);
        sb.append("\nPrecio total: ").append(precioTotal);
        sb.append("\nCategoria: ").append(categoria);
        sb.append("\nEstado de la solicitud: ").append(estadoSolicitud);
        return sb.toString();
    }
    
}
