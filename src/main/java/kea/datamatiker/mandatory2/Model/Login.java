package kea.datamatiker.mandatory2.Model;


import javax.persistence.*;


@Entity
public class Login {
    //Fields
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
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

    public Login(String username, String password, int id) {
        this.username = username;
        this.password = password;
        this.id = id;
    }

    public Login(){

    }

    //Methods

    /*public Boolean verifyUser() {
        Connection con = AccessDB.getConnection();
        String getSQL = "SELECT username, password, accessLevel FROM login WHERE username = ?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(getSQL);
            preparedStatement.setString(1, username);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    try {
                        if (username.equals(rs.getString("username")) && password.equals(rs.getString("password"))) {
                            accessLevel = rs.getInt("accessLevel");
                            return true;
                        } else {
                            accessLevel = 0;
                            return false;
                        }

                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
            preparedStatement.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }*/

    /**
     * This method redirects a user baded upon accessLevel
     *
     * @return String Returns a String used to redirect user
     */
    public String redirect() {
        String redirectPage = "";
        switch (id) {
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
    }


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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Login{" +
                "username='" + username;
    }
}
