/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tunga.ssbeans;

import java.util.List;
import javax.ejb.Remote;
import tunga.entities.Restaurant;

/**
 *
 * @author Hieu
 */
@Remote
public interface RestaurantFacadeRemote {

    void create(Restaurant restaurant);

    void edit(Restaurant restaurant);

    void remove(Restaurant restaurant);

    Restaurant find(Object id);

    List<Restaurant> findAll();

    List<Restaurant> findRange(int[] range);

    int count();

}
