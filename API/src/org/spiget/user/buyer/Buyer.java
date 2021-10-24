package org.spiget.user.buyer;

import org.spiget.user.User;

import java.util.Date;

/**
 * Represents a buyer of a premium resource.
 * <p>
 * Since spigot doesn't keep track of user downloads, other than just
 * the number of download, this class only has one the PremiumBuyer implementation.
 *
 * @author Pinger
 * @since 1.0
 */

public interface Buyer extends User {

    /**
     * Returns the price of the plugin that this user has bought it for.
     * <p>
     * If this user was added by the author himself, this will return -1.
     *
     * @return the price
     */

    float getPrice();

    /**
     * Returns the currency of this purchase.
     * <p>
     * This is in-fact needed because a user can change
     * both the price and the currency of a plugin.
     * If this user was added by the author himself, this will return null.
     *
     * @return the currency
     */

    String getCurrency();

    /**
     * Returns the date of the purchase.
     *
     * @return the date of the purchase
     */

    Date getDate();


}
