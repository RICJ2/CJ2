
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loginscreen;
import java.util.Hashtable;
/**
 *
 * @author ChrisO
 */
/**
 * This class represents a dictionary which stores a table of keys and values.
 * The keys is a String and the values are Student objects. Neither a key nor a value can be
 * the empty string or can contain white space characters (spaces, tabs, or new
 * lines).
 */

class Diction {
	String key; 
        Student value;
	Boolean dictionary;
	Hashtable<String, Student> dict1;
        //Student Dave = new Student("Dave", "pass123");
        //Student Sue = new Student("Sue", "pass1234");

	public Diction() {
		key = null;
		value = null;
		dictionary = true;
		dict1 = new Hashtable<String, Student>(30);
		//dict1.put("Dave", Dave);
		//dict1.put("Sue", Sue);
	}

	/**
	 * The put method stores a key-value pair in the dictionary. If a value
	 * already exists for this key then the new value replaces the old value.
	 * Otherwise a new entry is created for the specified key and value. This
	 * method must do nothing if the dictionary has been closed.
	 */
	public void put(String k, Student v) {
		if (dict1.get(k) != null) {
                    dict1.remove(k);}
		dict1.put(k, v);}
	

	/**
	 * The get method retrieves the value stored for the specified key. The
	 * empty string "" is returned if no value is stored for this key or if the
	 * dictionary has been closed.
	 */

	public Student get(String k) {
		value = dict1.get(k);

		if (value == null)
			return null;
		else
			return value;
	}

	/**
	 * The close method releases resources used by the dictionary when it is no
	 * longer needed. Mark the dictionary as closed so that future calls to the
	 * get and put methods behave as specified.
	 */

	public synchronized void close() {
		dictionary = false;
		key = null;
		value = null;

	}
}

