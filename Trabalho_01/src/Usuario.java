/**
 *
 */
public class Usuario {
	 private String nome;
	 private String email;
	 private String senha;
	 private String papel; // admin ou caixa
	 
	 
	 public Usuario(String nome, String email, String senha,String papel) {
		 this.nome=nome;
		 this.email = email;
		 this.senha=senha;
		 this.papel= papel;
	 }
	 
	 
	 //getters
	 
	   public String getNome() {
	        return nome;
	    }
	   
	   public String getEmail() {
	        return email;
	    }
	   public String getSenha() {
	        return senha;
	    }
	   public String getPapel() {
	        return papel;
	    }	    
	    
	    // Setters
	    
	   public String setNome() {
	        return nome;
	    }
	   
	   public String setEmail() {
	        return email;
	    }
	   public String setSenha() {
	        return senha;
	    }
	   public String setPapel() {
	        return papel;
	    }
	   

@Override
public String toString() {
    return "Usuario{" +
            "nome='" + nome + '\'' +
            ", email='" + email + '\'' +
            ", senha='" + senha + '\'' +
            ", papel='" + papel + '\'' +
            '}';
}
}
	
