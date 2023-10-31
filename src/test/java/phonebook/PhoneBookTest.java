package phonebook;
import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class PhoneBookTest {

    @Test
    public void test1() {
        // given
        PhoneBook phoneBook = new PhoneBook();
        String expectedName = "John";
        String phoneNumber = "302-555-4545";
        phoneBook.add(expectedName, phoneNumber);

        // when
        String actualName = phoneBook.reverseLookup(phoneNumber);

        // then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void test2() {
        // given
        PhoneBook phoneBook = new PhoneBook();
        String expectedName = "Joe";
        String phoneNumber = "302-554-4545";
        phoneBook.add(expectedName, phoneNumber);

        // when
        String actualName = phoneBook.reverseLookup(phoneNumber);

        // then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void test3() {
        // given
        PhoneBook phoneBook = new PhoneBook();
        String expectedName = "Smith";
        String phoneNumber = "302-554-4535";
        phoneBook.add(expectedName, phoneNumber);

        // when
        String actualName = phoneBook.reverseLookup(phoneNumber);

        // then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testRemoveEntry() {
        // given
        PhoneBook phoneBook = new PhoneBook();
        String name = "Alice";
        String phoneNumber = "123-456-7890";
        phoneBook.add(name, phoneNumber);
        Assert.assertTrue(phoneBook.hasEntry(name));

        // when
        phoneBook.remove(name);

        // then
        Assert.assertFalse(phoneBook.hasEntry(name));
    }

    @Test
    public void test4() {
        // given
        PhoneBook phoneBook = new PhoneBook();
        String name = "Joe";
        String[] phoneNumbers = {
                "302-555-4444",
                "302-555-3333",
                "302-555-2222",
                "302-555-1111",
        };

        // when
        phoneBook.addAll(name, phoneNumbers);
        List<String> actualPhoneNumbers = phoneBook.lookup(name);
        Assert.assertEquals(Arrays.asList(phoneNumbers), actualPhoneNumbers);
    }



    @Test
    public void test5() {
        // given
        PhoneBook phoneBook = new PhoneBook();
        String name = "Joe";
        String[] phoneNumbers = {
                "302-555-5555",
                "302-555-4444",
                "302-555-3333",
                "302-555-2222",
        };

        // when
        phoneBook.addAll(name, phoneNumbers);
        List<String> actualPhoneNumbers = phoneBook.lookup(name);
        Assert.assertEquals(Arrays.asList(phoneNumbers), actualPhoneNumbers);
    }


    @Test
    public void test6() {
        // given
        PhoneBook phoneBook = new PhoneBook();
        String name = "Joe";
        String[] phoneNumbers = {
                "302-555-1212",
                "302-555-3434",
                "302-555-4545",
                "302-555-5656",
        };

        // when
        phoneBook.addAll(name, phoneNumbers);
        List<String> actualPhoneNumbers = phoneBook.lookup(name);
        Assert.assertEquals(Arrays.asList(phoneNumbers), actualPhoneNumbers);
    }
}

