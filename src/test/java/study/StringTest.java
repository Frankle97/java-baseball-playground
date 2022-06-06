package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split() {
        String str1 = "1,2";
        String str2 = "1";
        assertThat(str1.split(",")).contains("1", "2");
        assertThat(str2.split(",")).contains("1");
    }

    @Test
    void substring() {
        String str = "(1,2)";
        assertThat(str.substring(1, 4)).contains("1,2");
    }

    @Test
    @DisplayName("특정 위치 문자 가져오기")
    void charAt() throws Exception {
        String input = "abc";
        assertThatThrownBy(() -> input.charAt(input.length()))
            .isInstanceOf(StringIndexOutOfBoundsException.class)
            .hasMessageContaining("String index out of range");
    }
}
