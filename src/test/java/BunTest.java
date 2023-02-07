import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;

@RunWith(Parameterized.class)
public class BunTest {
    private String bunName;
    private float bunPrice;

    public BunTest(String bunName, float bunPrice) {
        this.bunName = bunName;
        this.bunPrice = bunPrice;
    }

    @Parameterized.Parameters
    public static Object[][] getBunData() {
        return new Object[][] {
                {"Клавиатура A4Tech-03", 1536.45F},
                {"Лампа настольная L.23", 778.45F}
        };
    }

    @Test
    public void bunGetNameTest() {
        Bun bun = new Bun(bunName, bunPrice);
        Assert.assertEquals(bunName, bun.getName());
    }

    @Test
    public void bunGetPriceTest() {
        Bun bun = new Bun(bunName, bunPrice);
        Assert.assertEquals(bunPrice, bun.getPrice(), 0);
    }

}
