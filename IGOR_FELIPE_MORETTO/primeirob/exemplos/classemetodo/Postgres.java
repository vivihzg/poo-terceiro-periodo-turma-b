package primeirob.exemplos.classemetodo;

public class Postgres implements IBancoDados{
    
  
    @Override
    public void buscar() {
        System.out.println("Buscando em PG");
    }
    public void deletar() {
        System.out.println("Deletando em PG");
    }
    public void salvar(){
        System.out.println("Salvando em PG");
    }
    public void atualizar(){
        System.out.println("Atualizando em PG");
    }

}
