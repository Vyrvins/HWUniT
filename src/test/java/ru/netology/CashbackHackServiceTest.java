package ru.netology;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void remainIf900() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }
        @org.testng.annotations.Test
        public void remainIf0(){
            CashbackHackService service = new CashbackHackService();
            int amount = 0;
            int actual = service.remain(amount);
            int expected = 1000;
            assertEquals(actual,expected);
        }
    @org.testng.annotations.Test
    public void remainIf999(){
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;
        assertEquals(actual,expected);
    }
    @org.testng.annotations.Test
    public void remainIf1000(){
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual,expected);
    }
    @org.testng.annotations.Test
    public void remainIf1001(){
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;
        assertEquals(actual,expected);
}
}
