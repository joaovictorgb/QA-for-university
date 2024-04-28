package Entities;


class Triangle {
    static int isosceles = 0;
    static int equilatero = 0;
    static int retangulo = 0;
    String tipo;
    
    public Triangle(String tipo) {
        if (tipo.equals("Retangulo") && Triangle.retangulo == 0) {
            this.tipo = tipo;
            Triangle.retangulo++;

        } else if (tipo.equals("Isosceles") && Triangle.isosceles == 0) {
            this.tipo = tipo;
            Triangle.isosceles++;

        } else if (tipo.equals("Equilatero") && Triangle.equilatero == 0) {
            this.tipo = tipo;
            Triangle.equilatero++;

        }        
        else {
            throw new RuntimeException();}
    }
    
    @Override
    public String toString() {
        return "Triângulo do tipo "+this.tipo+" criado";
    }
}