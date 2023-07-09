package org.example;

public abstract class Figura {

        String colorFondo;

    public String getColorFondo() {
        return colorFondo;
    }

    public void setColorFondo(String colorFondo) {
        this.colorFondo = colorFondo;
    }

    public abstract double calcularArea();
}


