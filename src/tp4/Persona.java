package tp4;

import java.util.Random;

public class Persona {
    //nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura.
    private String nombre;
    private Integer edad;
    private String dni;
    private Character sexo;
    private Double peso;
    private Double altura;


    public Persona(String nombre, Integer edad, Character sexo, Double peso, Double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
        this.dni=generaDNI();
    }

    public Persona(String nombre, Integer edad, String dni, Character sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso=79.9;
        this.altura=1.73;
    }

    public Persona() {
            this.nombre="martin";
            this.edad=26;
            this.altura=1.73;
            this.dni="40306986";
            this.sexo='H';
            this.peso=79.9;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public int calculoIMC(Double peso, Double altura)
    {
        int rta=0;
        Double imc=(Double)peso/(Double)(altura*altura);
        if (imc<20)
        {
            rta=-1;
        }
        if(20<= imc && imc<=25)
        {
            rta=0;
        }if(imc>25)
        {
            rta=1;
        }
        return rta;
    }
    public Boolean esMayorDeEdad()
    {
        return this.edad>18;
    }
    public Character comprobarSexo(Character sexo)
    {
        if(sexo=='M')
            return 'M';
        else return 'H';
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
    public String generaDNI()
    {
        Random dni = new Random();
        return String.valueOf(dni.nextInt(100000)+40000000);
    }

}

