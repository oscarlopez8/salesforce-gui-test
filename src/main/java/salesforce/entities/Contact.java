package salesforce.entities;

/**
 * Contact class.
 *
 * @author Oscar Lopez.
 * @version 1.0
 */
public class Contact {

    /**
     * Id variable of Contact.
     */
    private String id;

    /**
     * Salutation Variablet of Contact.
     */
    private String salutation;

    /**
     * First Name variable of Contact.
     */
    private String firstName;

    /**
     * Last name variable of Contact.
     */
    private String lastName;

    /**
     * Phone variable of Contact.
     */
    private int phone;

    /**
     * Email variable of Contact.
     */
    private String email;

    /**
     * Account variable of Contact.
     */
    private String account;

    /**
     * Gets the id of the Contact.
     *
     * @return the id.
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the id of Contact.
     *
     * @param id for the account.
     */
    public void setId(final String id) {
        this.id = id;
    }

    /**
     * Gets the salutation.
     *
     * @return salutation.
     */
    public String getSalutation() {
        return salutation;
    }

    /**
     * Sets the salutation.
     *
     * @param salutation for the contact.
     */
    public void setSalutation(final String salutation) {
        this.salutation = salutation;
    }

    /**
     * Gets the first name.
     *
     * @return first name.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name.
     *
     * @param firstName for the contact.
     */
    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the last name.
     *
     * @return last name.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name.
     *
     * @param lastName for the contact.
     */
    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the phone.
     *
     * @return phone.
     */
    public int getPhone() {
        return phone;
    }

    /**
     * Sets the phone.
     *
     * @param phone for the contact.
     */
    public void setPhone(final int phone) {
        this.phone = phone;
    }

    /**
     * Gets the email.
     *
     * @return email.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email.
     *
     * @param email for the contact.
     */
    public void setEmail(final String email) {
        this.email = email;
    }
}
