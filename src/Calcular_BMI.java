public class Calcular_BMI {
    // con esta clase vamos a calcular el indice de masa corporal usando el peso(KG) y la la altura(metros)

    private final double peso;
    private final double altura;

    public Calcular_BMI(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public String calcular (){
        double bmi = peso/ (Math.pow(altura,2));
        String retorno ="";
        if(bmi<18.5){
            retorno = "Su BMI es de "+bmi +" y Según los estándares de la Organización Mundial de la Salud, un BMI menor a 18.5 se considera bajo peso";
        }else if(bmi<25){
            retorno = "Su BMI es de "+bmi + "Según los estándares de la Organización Mundial de la Salud, entre 18.5 y 24.9 se considera normal";
        }else if(bmi<30){
            retorno = "Su BMI es de "+bmi + "Según los estándares de la Organización Mundial de la Salud, entre 25 y 29.9 se considera sobrepeso";
        }else{
            retorno = "Su BMI es de "+bmi + "Según los estándares de la Organización Mundial de la Salud, 30 o más se considera obesidad";
        }

        return retorno;


    }
}
