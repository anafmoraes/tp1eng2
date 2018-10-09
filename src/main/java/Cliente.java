public class Cliente {
    private String nome;
    private String endereco;
    private long telefone;
    
    Cliente(){
    }
    
    Cliente(String nome, String endereco, long telefone){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    
    public void setNome(String nome){
        if (!nome.isEmpty()){
            this.nome = nome;
        }else{
            this.nome = "77";
        }
    }
    
    public void setEndereco(String endereco){
        if (!endereco.isEmpty()){
            this.endereco = endereco;
        }else{
            this.endereco = "78";
        }
    }
    
    public void setTelefone(long telefone){
      /**
        COMENTAR TUDO E MANTER O   
        this.telefone = telefone;
        PARA DAR ERRO
       */
      
        if (telefone != 0){
            this.telefone = telefone;
        }else{
            this.telefone = 79;
        }        
    }
    
    public String getNome(){
        return this.nome;
    }    
    
    public String getEndereco(){
        return this.endereco;
    }
    
    public long getTelefone(){
        return this.telefone;
    }
}
