import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BonusServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForNotRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        long amount = 1000_60;
        boolean registered = false;
        long expected = 10;

        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndAfterLimit() {
        BonusService service = new BonusService();

        long amount = 100_000_60;
        boolean registered = true;
        long expected = 500;

        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForNotRegisteredAndAfterLimit() {
        BonusService service = new BonusService();

        long amount = 100_000_60;
        boolean registered = false;
        long expected = 500;

        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndUnderOneHundred() {
        BonusService service = new BonusService();

        long amount = 90_00;
        boolean registered = true;
        long expected = 2;

        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForNotRegisteredAndUnderOneHundred() {
        BonusService service = new BonusService();

        long amount = 90_00;
        boolean registered = false;
        long expected = 0;

        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);

    }
}