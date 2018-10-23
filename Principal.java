import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Controle cont = new Controle();
        String[] comando;
        
        
        System.out.println("Bem vindo Cálculo de salário!"
                
                + "\n       Os comando são:"
                + "\naddprof:   Adicionar um professor.                     ex: addprof elvis D"
                + "\naddsta:    Adicionar um servidor tec. adm.             ex: addsta gilmario 3"
                + "\naddter:    Adicionar terceirizado.                     ex: addter helder 40 sim"
                + "\nrm:        Para remover alguém.                        ex: rm allan"
                + "\nend:       Para sair.\n");
        
        while(true){
            comando = sc.nextLine().split(" ");
            
            if(comando[0].equals("end")){
                System.out.println("  Até a proxima :)");
                break;
            }
            
            switch(comando[0]){
                case ("addprof"):
                    Funcionario Professor = new Professor(comando[1], comando[2]);
                    cont.adicionar(Professor);
                    break;
                
                case ("adddiaria"):
                    cont.adddiaria(comando[1]);
                    break;    
                    
                case ("addsta"):
                    Funcionario sta = new STA(comando[1], Integer.parseInt(comando[2]));
                    cont.adicionar(sta);
                    break;
                    
                case "addter":
                    Funcionario ter = new Terceirizado(comando[1], Integer.parseInt(comando[2]), comando[3]);
                    cont.adicionar(ter);
                    break;
                    
                case ("show"):
                    cont.show(comando[1]);
                    break;
                    
                case ("rm"):
                    cont.remover(comando[1]);
                    break;
                    
                default:
                    System.out.println("Tente novamente");
            }
        }
    }
}
