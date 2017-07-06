/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassiNerdbook;


public class Post
{
    public enum Type
    {
        TEXT, IMAGE, LINK
    };
    
    private int id;
    private User user;
    private String contenuto;
    private Type tipoPost;
    
    public Post()
    {
        id = 0;
        user = null;
        contenuto = "";
        tipoPost = Type.TEXT;
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
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * @return the contenuto
     */
    public String getContenuto() {
        return contenuto;
    }

    /**
     * @param contenuto the contenuto to set
     */
    public void setContenuto(String contenuto) {
        this.contenuto = contenuto;
    }

    /**
     * @return the tipoPost
     */
    public Type getTipoPost() {
        return tipoPost;
    }

    /**
     * @param tipoPost the tipoPost to set
     */
    public void setTipoPost(Type tipoPost) {
        this.tipoPost = tipoPost;
    }
    
    
   
    
}
