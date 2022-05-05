/*
 * GeoventasAndroidAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package m664533.m88.m232.m3.controllers;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import m664533.m88.m232.m3.ApiHelper;
import m664533.m88.m232.m3.AuthManager;
import m664533.m88.m232.m3.Configuration;
import m664533.m88.m232.m3.exceptions.ApiException;
import m664533.m88.m232.m3.http.Headers;
import m664533.m88.m232.m3.http.client.HttpCallback;
import m664533.m88.m232.m3.http.client.HttpClient;
import m664533.m88.m232.m3.http.client.HttpContext;
import m664533.m88.m232.m3.http.request.HttpRequest;
import m664533.m88.m232.m3.http.response.HttpResponse;
import m664533.m88.m232.m3.http.response.HttpStringResponse;
import m664533.m88.m232.m3.models.ProductsAPI;

/**
 * This class lists all the endpoints of the groups.
 */
public final class ProductosController extends BaseController {

    /**
     * Initializes the controller.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     */
    public ProductosController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers) {
        super(config, httpClient, authManagers);
    }

    /**
     * Initializes the controller with HTTPCallback.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     * @param httpCallback    Callback to be called before and after the HTTP call.
     */
    public ProductosController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers, HttpCallback httpCallback) {
        super(config, httpClient, authManagers, httpCallback);
    }

    /**
     * @return    Returns the List of ProductsAPI response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<ProductsAPI> productosGET() throws ApiException, IOException {
        HttpRequest request = buildProductosGETRequest();
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleProductosGETResponse(context);
    }

    /**
     * @return    Returns the List of ProductsAPI response from the API call
     */
    public CompletableFuture<List<ProductsAPI>> productosGETAsync() {
        return makeHttpCallAsync(() -> buildProductosGETRequest(),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleProductosGETResponse(context));
    }

    /**
     * Builds the HttpRequest object for productosGET.
     */
    private HttpRequest buildProductosGETRequest() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/Productos");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().get(queryBuilder, headers, null, null);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for productosGET.
     * @return An object of type List of ProductsAPI
     */
    private List<ProductsAPI> handleProductosGETResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        List<ProductsAPI> result = ApiHelper.deserializeArray(responseBody,
                ProductsAPI[].class);
        return result;
    }

}