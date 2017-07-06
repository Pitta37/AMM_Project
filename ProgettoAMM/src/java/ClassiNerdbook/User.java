/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassiNerdbook;

public class User
{
    
    private int id;
    private String nome;
    private String cognome;
    private String username;
    private String frase;
    private String password;
    private String fotoProfilo;
    private String data; /*chiedi se è giusto*/
    
    public User() {
        id = 0;
        nome = "";
        cognome = "";
        username = "";
        frase = "";
        password = "";
        fotoProfilo = "";
        data = "";
        
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cognome
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * @param cognome the cognome to set
     */
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the frase
     */
    public String getFrase() {
        return frase;
    }

    /**
     * @param frase the frase to set
     */
    public void setFrase(String frase) {
        this.frase = frase;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the fotoProfilo
     */
    public String getFotoProfilo() {
        return fotoProfilo;
    }

    /**
     * @param fotoProfilo the fotoProfilo to set
     */
    public void setFotoProfilo(String fotoProfilo) {
        this.fotoProfilo = fotoProfilo;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

   

    
    
    

    
    
}
