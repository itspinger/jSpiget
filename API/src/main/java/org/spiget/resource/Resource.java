package org.spiget.resource;


import org.spiget.user.User;

import java.util.List;
import java.util.Optional;

public interface Resource {

    /**
     * Returns the unique identifier of this resource.
     *
     * @return the id
     */

    long getId();

    /**
     * Returns the title / name of the resource.
     * <p>
     * Note that this can change over time, and shouldn't be used
     * when caching objects, but instead use the {@link #getId()}.
     *
     * @return the title
     */

    String getTitle();

    /**
     * Returns the current known native version of the plugin.
     * <p>
     * This method tells users what version this resource was built against,
     * which can possibly a reason for some bugs.
     *
     * @return the native version
     */

    String getNativeVersion();

    /**
     * Returns the short description of the resource.
     * This should be a 2 sentence short-desc of any resource.
     *
     * @return the description
     */

    String getDescription();

    /**
     * Returns the author of this resource.
     * <p>
     * Author is basically a user who published the resource, even though
     * they might not have made it themselves.
     *
     * @return the author
     */

    User getAuthor();

    /**
     * Returns a list of users that contributed to making of this resource.
     * It will return empty, if no users were provided in the first place.
     *
     * @return the list of contributors
     */

    List<String> getContributors();

    /**
     * Returns the total amount of times this resource has been downloaded.
     * <p>
     * If this resource is a premium resource, this method might not be equal
     * to the amount of buyers, depending on if the user downloaded the resource.
     *
     * @return the amount of downloads
     */

    long getTotalDownloads();

    /**
     * Returns the category of this resource.
     * You can find the whole list here: https://www.spigotmc.org/resources/
     *
     * @return the category
     */

    String getCategory();

    /**
     * Returns a list of all versions this resource has been tested on.
     *
     * @return list of all tested versions
     */

    List<String> getTestedVersions();

    /**
     * Returns a url of the source code of the resource, if present.
     *
     * @return the source url
     */

    Optional<String> getSourceCodeUrl();
}
