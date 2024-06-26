package edu.pitt.cs;

public class CatImpl implements Cat {

	// TODO: Fill in with member variables
	boolean _rented;
	String _name;
	int _id;

	public CatImpl(int id, String name) {
		// TODO: Fill in
		_rented = false;
		_name = name;
		_id = id;
	}

	/**
	 * Rent cat. Simply sets the _rented flag to true.
	 */
	public void rentCat() {
		// TODO: Fill in
		_rented = true;
	}

	/**
	 * Return cat. Simply sets the _rented flag to false.
	 */
	public void returnCat() {
		// TODO: Fill in
		_rented = false;
	}

	/**
	 * Rename cat. Simply sets the name to the new name.
	 * 
	 * @param String name New name of the cat
	 */
	public void renameCat(String name) {
		// TODO: Fill in
		_name = name;
	}

	/**
	 * Accessor for _name variable. Returns the name of this cat.
	 * 
	 * @return String name of cat
	 */

	public String getName() {
		// TODO: Fill in
		return _name;
	}

	/**
	 * Accessor for _id variable. Returns the ID of this cat.
	 * 
	 * @return int ID of this cat
	 */

	public int getId() {
		// TODO: Fill in
		return _id;
	}

	/**
	 * Accessor for _rented variable. Returns if cat is rented.
	 * 
	 * @return boolean - true if rented, false otherwise
	 */

	public boolean getRented() {
		// TODO: Fill in
		return _rented;
	}

	/**
	 * Returns string version of this cat, in form: "ID *id_num*. *name*" Example
	 * for cat of ID 1, name Jennyanydots: "ID 1. Jennyanydots"
	 * 
	 * @return String string version of cat
	 */

	public String toString() {
		// TODO: Fill in
		return String.format("ID %o. %s", _id, _name);
	}

}