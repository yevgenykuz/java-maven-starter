package me.yevgeny;

import org.junit.jupiter.api.Test;

import static me.yevgeny.Main.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * @author Yevgeny Kuznetsov
 * @since 1.0.0, 19 August 2019
 **/
class MainTest {

    @Test
    void shouldBeTrue() {
        main(null);
        assertThat(true, is(true));
    }

    @Test
    void shouldHaveTempProperty() {
        assertThat(loadPropertiesFromFile(TEMP_PROPERTIES_FILE_NAME).isEmpty(), is(false));
    }
}
