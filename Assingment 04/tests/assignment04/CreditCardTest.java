package assignment04;

import org.junit.jupiter.api.Test;

import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardTest {

    CreditCard c = new CreditCard("Hans","Muster", CustomerCounter.getInstance().getCustomerID(), "123", CreditCard.CreditCardType.regular);

    @Test
    void getName() {
        assertEquals("Hans",c.getName());
    }

    @Test
    void getSurname() {
        assertEquals("Muster",c.getSurname());
    }

    @Test
    void getSerialNumber() {
        assertEquals(CustomerCounter.getInstance().getCustomerID(),c.getSerialNumber());
    }

    @Test
    void getExpirationDate() {
        assertTrue((BooleanSupplier) c.getExpirationDate());
    }

    @Test
    void getSecurityCode() {
        assertEquals("123",c.getSecurityCode());

    }

    @Test
    void getCCType() {
        assertEquals(CreditCard.CreditCardType.regular,c.getCCType());
    }

    @Test
    void changeCCType() {
        c.changeCCType(CreditCard.CreditCardType.gold);
        assertEquals(CreditCard.CreditCardType.gold, c.getCCType());
    }

    @Test
    void getLimit() {
        assertEquals(2000, c.getLimit());
    }

    @Test
    void isExpired() {
        assertTrue(c.isExpired());
    }
}
