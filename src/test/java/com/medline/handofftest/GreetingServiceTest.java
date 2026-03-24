package com.medline.handofftest;

import com.medline.handofftest.service.GreetingService;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class GreetingServiceTest {
    @Test
    void greet_returnsFormattedString() {
        assertThat(new GreetingService().greet("World")).isEqualTo("Hello, World!");
    }
}
