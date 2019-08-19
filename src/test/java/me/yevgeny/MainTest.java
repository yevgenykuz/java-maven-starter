package me.yevgeny;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Properties;

import static me.yevgeny.Main.TEMP_PROPERTIES_FILE_NAME;
import static me.yevgeny.Main.loadPropertiesFromFile;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * @author Yevgeny Kuznetsov
 * @since 1.0.0, 19 August 2019
 **/
class MainTest {

    @Test
    void shouldBeTrue() {
        assertThat(true, is(true));
    }

    @Test
    void shouldHaveTempProperty() {
        Properties properties = loadPropertiesFromFile(TEMP_PROPERTIES_FILE_NAME);
        assertThat(properties.isEmpty(), is(false));
    }
}
