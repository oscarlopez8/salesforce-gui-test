package salesforce.api;

import io.restassured.response.Response;
import salesforce.api.rest.RestClientAPI;

import java.util.Map;

import static salesforce.api.EndPoints.CONTACT_ENDPOINT;

/**
 * ContactAPI class.
 *
 * @author Oscar Lopez.
 * @version 1.0
 */
public class ContactAPI {

    /**
     * Variable for the rest client.
     */
    private RestClientAPI restClient;

    /**
     * Variable for the final endpoint.
     */
    private String finalEndpoint;

    /**
     * Constructor of ContactAPI.
     */
    protected ContactAPI() {
        restClient = RestClientAPI.getInstance();
    }

    /**
     * Returns the instance the contact API.
     *
     * @return a Contact API.
     */
    public static ContactAPI getInstance() {
        return new ContactAPI();
    }

    /**
     * Deletes a contact by id.
     *
     * @param contactId to concat with the base endpoint.
     */
    public void deleteContact(final String contactId) {
        finalEndpoint = CONTACT_ENDPOINT.concat("/".concat(contactId));
        final Response response = restClient.delete(finalEndpoint);
    }

    /**
     * Gets a contact by Id
     *
     * @param contactId to contact with the base endpoint.
     */
    public void readContactById(final String contactId) {
        finalEndpoint = CONTACT_ENDPOINT.concat("/".concat(contactId));
        final Response response = restClient.get(finalEndpoint);
    }

    /**
     * Create a contact.
     */
    public String createContact(Map<String, String> NewContat) {
        finalEndpoint = CONTACT_ENDPOINT;
        final Response response = restClient.post(finalEndpoint, NewContat);
        return response.body().jsonPath().getString("id");
    }
}
