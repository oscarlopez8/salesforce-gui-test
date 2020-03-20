package hook;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import salesforce.api.ContactAPI;
import salesforce.entities.Contact;
import salesforce.entities.Context;

import java.util.HashMap;
import java.util.Map;

/**
 * Contact hook class.
 *
 * @author Oscar Lopez.
 * @version 1.0
 */
public class ContactHook {

    /**
     * Context of type context.
     */
    private final Context context;

    /**
     * Contact Variable.
     */
    private Contact contact;

    /**
     * Constructor of class.
     *
     * @param context of type context.
     */
    public ContactHook(Context context) {
        this.context = context;
        this.contact = context.getContact();
    }

    /**
     * Deletes a contact.
     */
    @After("@delete-contact")
    public void afterScenario() {
        ContactAPI.getInstance().deleteContact(contact.getId());
    }

    /**
     * Creates a contact.
     */
    @Before("@create-contact")
    public void beforeScenario() {
        Map<String,String> createNewContact = new HashMap<>();
        createNewContact.put("firstName", "Contact First Name");
        createNewContact.put("LastName", "Contact Last Name");
        createNewContact.put("email", "Contact Email");
        contact.setId(ContactAPI.getInstance().createContact(createNewContact));
    }
}
