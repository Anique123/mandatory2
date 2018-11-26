package kea.datamatiker.mandatory2.Model;


import javax.persistence.*;


@Entity
public class Login {
    //Fields
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long loginId;
    private String username;
    private String password;


    /**
     * This method creates a login for the user
     *
     * @param username The users username
     * @param password The users password
     */
    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }


    public Login(){

    }


    /**
     * This method redirects a user baded upon accessLevel
     *
     * @return String Returns a String used to redirect user
     */
    /*public String redirect() {
        String redirectPage = "";
        switch () {
            //Owner
            case 1:
                redirectPage = "owner_page";
                break;
            //Booking employee
            case 2:
                redirectPage = "booking";
                break;
            //Other employee
            case 3:
                redirectPage = "activityHelper_page";
                break;
            //Wrong login or No access to the system
            default:
                redirectPage = "index";
                break;

        }
        return redirectPage;
    }*/


    /*Getters and setters*/

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getLoginId() {
        return loginId;
    }

    public void setLoginId(Long loginId) {
        this.loginId = loginId;
    }

    @Override
    public String toString() {
        return "Login{" +
                "username='" + username;
    }
}
