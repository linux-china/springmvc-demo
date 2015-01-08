package org.mvnsearch.springmvc.domain.model;

/**
 * user
 *
 * @author linux_china
 */
public class User {
    private Long id;
    private String nick;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }
}
