import org.assertj.core.api.Assertions;
import org.junit.Test;

public class AppTest {
    @Test
    public void testShouldWork() {
        Assertions.assertThat(true).isTrue();
    }

    @Test
    public void testShouldTakeInEmptyStringAndReturnEmptyString() {
        App app = new App();
        String result = app.extract("");
        Assertions.assertThat(result).isEqualTo("");
    }

    @Test
    public void testShouldReturnEmptyStringIfNoTag() {
        App app = new App();
        String result = app.extract("abcd");
        Assertions.assertThat(result).isEqualTo("");
    }

    @Test
    public void testShouldReturnEmptyStringIfNoEndTag() {
        App app = new App();
        String result = app.extract("<h1>abcd");
        Assertions.assertThat(result).isEqualTo("");
    }

    @Test
    public void testShouldReturnEmptyStringIfStartAndEndTagIsDifference() {
        App app = new App();
        String result = app.extract("<h1>abcd</H1>");
        Assertions.assertThat(result).isEqualTo("");
    }

    @Test
    public void testShouldReturnEmptyStringIfStartAndEndTagIsReverse() {
        App app = new App();
        String result = app.extract("</h1>abcd<h1>");
        Assertions.assertThat(result).isEqualTo("");
    }

    @Test
    public void testShouldReturnString() {
        App app = new App();
        String result = app.extract("<h1>abcd</h1>");
        Assertions.assertThat(result).isEqualTo("abcd");
    }
}
