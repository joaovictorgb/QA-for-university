package Entities;


public class Triangle {
    private static Triangle isosceles = null;
    private static Triangle equilatero = null;
    private static Triangle retangulo = null;
    private String tipo;
    
    private Triangle(String tipo)  {
        this.tipo=tipo;
    }

    public static Triangle getInstance(String tipo) throws ExcecaoInstancia{

        if (tipo == "Retangulo") {
            if(Triangle.retangulo == null){
                return Triangle.retangulo= new Triangle(tipo);
            } else throw new ExcecaoInstancia("Já existe uma instância de Triângulo Retângulo");
        } 

        else if (tipo == "Isosceles"){
            if(Triangle.isosceles == null) {
                return Triangle.isosceles= new Triangle(tipo);
        }  else throw new ExcecaoInstancia("Já existe uma instância de Triângulo Isósceles");

        } else if (tipo == "Equilatero"){
            if(Triangle.equilatero == null) {
                return Triangle.equilatero= new Triangle(tipo);
        }     else throw new ExcecaoInstancia("Já existe uma instância de Triângulo Equilátero");   
    }

        else {
            throw new ExcecaoInstancia("Tipo inválido de instância");
        }
    }
    
    @Override
    public String toString() {
        return "Triângulo do tipo "+ this.tipo +" criado";
    }
}