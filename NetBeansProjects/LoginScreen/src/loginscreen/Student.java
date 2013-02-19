/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loginscreen;

/**
 *
 * @author ChrisO
 */
class Student
{
    private String name, password, query, results;

    public Student()
    {}

    public Static String getName(String loginN){
       query = "SELECT name FROM users WHERE Id=loginN";
       results = executeQuery(query);
       return $results;
    }
    
    
    public String getPassword(String loginN){
	this->openConnection();
        query = "SELECT passwword FROM users WHERE Id=loginN";
        results = mysql_query(query);
        mysql_close($this->connection);
        return $results;
    }
}
