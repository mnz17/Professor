/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package professor;

/**
 *
 * @author Joao
 */
public class Professor {
    private Long idProfessor;
    private IdNivelProfessor idNivelProfessor;
    private Integer IdNivelProfessor;
    private String login;
    private String senha;
    
    private static class IdNivelProfessor {

        public IdNivelProfessor() {
        }
    }
    
    public class professor {
     private Long idUsario;
     private Long idProfessor;
     private IdNivelProfessor idNivelProfessor;
     private String login;
     private String senha;
}
	
	
	public void setIdProfessor(Long idProfessor){
		this.idProfessor = idProfessor;
	}
	
	public Long getIdProfessor(){
		return this.idProfessor;
	}
	
	public void setIdNivelProfessor (IdNivelProfessor idNivelProfessor) {
		this.idNivelProfessor = idNivelProfessor;
	}
	
	public Integer getIdNivelProfessor(){
		return this.IdNivelProfessor;
	}
	
	public void setLogin(String login){
		this.login = login;
	}
	
	public String getLogin(){
		return this.login;
	}
	
	public void setSenha(String login){
		this.login = login;
	}
	
	public String getSenha(){
		return this.senha;
	}	
}         

