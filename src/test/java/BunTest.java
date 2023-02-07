import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;

@RunWith(Parameterized.class)
public class BunTest {
    private String name;
    private float price;

    public BunTest(String name, float price) {
        this.name = name;
        this.price = price;
    }

    @Parameterized.Parameters
    public static Object[][] getBunData() {
        return new Object[][]{
                {"Клавиатура A4Tech-03", 1536.45F},
                {"Лампа настольная L.23", 778.45F}
        };
    }

    @Test
    public void bunGetNameTest() {
        Bun bun = new Bun(name, price);
        Assert.assertEquals(name, bun.getName());
    }

    @Test
    public void bunGetPriceTest() {
        Bun bun = new Bun(name, price);
        Assert.assertEquals(price, bun.getPrice(), 0);
    }

}
