
import java.util.ArrayList;

public class Controle {

    private ArrayList<Funcionario> Func = new ArrayList();

    public boolean adicionar(Funcionario nome) {
        for (int i = 0; i < this.Func.size(); i++) {
            if (Func.get(i).getNome().equals(nome.getNome())) {
                System.out.println("Funcionario já existe");
                return false;
            }
        }
        this.Func.add(nome);
        System.out.println("done");
        return true;
    }

    public boolean adddiaria(String nome) {
        for (int i = 0; i < this.Func.size(); i++) {
            if (Func.get(i).getNome().equals(nome) && Func.get(i).getDiarias() < Func.get(i).getMaxDiarias()){
                Func.get(i).setDiarias(1);
                Func.get(i).setSalario(Func.get(i).getSalario()+100);
                System.out.println("done");
            }else{System.out.println("nao é possível adicionar diária");}
        }
        return false;
    }
    
    
    

    public boolean remover(String nome) {
        for (int i = 0; i < this.Func.size(); i++) {
            if (Func.get(i).getNome().equals(nome)) {
                Func.remove(i);
                System.out.println("Funcionario removido");
                return true;
            }
        }
        System.out.println("Funcionario não existe");
        return false;
    }

    public boolean show(String nome) {
        for (int i = 0; i < this.Func.size(); i++) {
            if (Func.get(i).getNome().equals(nome)) {
                System.out.println(Func.get(i));
                return true;
            }
        }
        System.out.println("funcionario " + nome + " nao existe");
        return false;

    }

}
