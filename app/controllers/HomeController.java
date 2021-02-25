package controllers;

import play.mvc.*;
import models.Product;
import views.html.*;


/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(
            index.render(
                "Hello world."
            ));
    }

    public Result about() {
        return ok(
            about.render());
    }

    public Result products() {
        // Create a new product
        Product p = new Product();

        // Set the properties for p 
        p.setId(1L);
        p.setName("LCD TV");
        p.setCategory("Home Entertainment");
        p.setDescription("Sony 55 inch LCD TV");
        p.setStock(10);
        p.setPrice(4500000);

        // Create an object and
        Product p2 = new Product(1L, "LCD TV", "Home", "LG 55 inch OLED TV", 10, 6700000);

        return ok(
            products.render(p2));
    }
}
