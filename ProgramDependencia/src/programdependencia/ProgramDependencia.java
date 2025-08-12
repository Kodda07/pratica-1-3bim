package programdependencia;
import programdependencia.model.*;
public class ProgramDependencia {

    public static void main(String[] args) {
        Motor motor = new Motor(4,1.6);
        Carro carro = new Carro("Reanult","Logan",2015,motor);
        System.out.println("o meu carro é:"+carro);
        
        Departamento depart = new Departamento("RH");
        Funcionario func = new Funcionario(1,"Thiago",1512.00);
        depart.setFunc(func);
        System.out.println("Essa é nossa empressa: "+depart);
    }
    
}
