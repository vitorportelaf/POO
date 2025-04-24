package PowerPoint2.Exercicio4;

public class Salario {
    String [] professor = new String[1];
    int [] aulasSemanais = new int[professor.length];
    double [] valorHora = new double[professor.length];

    public double [] calculaSalarioBase(){
        double [] salarioBase = new double[professor.length];
        for(int i=0;i<professor.length;i++){
            salarioBase[i]=aulasSemanais[i]*4.5*valorHora[i];
        }
        return salarioBase;
    }

    public double [] horaAtividade(){
        double [] adicional = new double[professor.length];
        for(int i=0;i<professor.length;i++){
            adicional[i] = calculaSalarioBase()[i]*0.05;
        }
        return adicional;
    }

    public double [] totalBruto(){
        double [] bruto = new double[professor.length];
        for(int i=0;i<professor.length;i++){
            bruto[i] = calculaSalarioBase()[i]+horaAtividade()[i];
        }
        return bruto;
    }

    public double [] descansoRemunerado(){
        double [] descanso = new double[professor.length];
        for(int i=0;i<professor.length;i++){
            descanso[i] = totalBruto()[i]+(totalBruto()[i]/6);
        }
        return descanso;
    }

    public double [] salarioFinal(){
        double [] salarioBruto = new double[professor.length];
        for(int i=0;i<professor.length;i++){
            salarioBruto[i] = totalBruto()[i]+descansoRemunerado()[i];
        }
        return salarioBruto;
    }
}
