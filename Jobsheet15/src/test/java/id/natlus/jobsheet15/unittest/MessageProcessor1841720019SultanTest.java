package id.natlus.jobsheet15.unittest;

import org.junit.Assert;
import org.junit.Test;

public class MessageProcessor1841720019SultanTest {
    MessageProcessor1841720019Sultan mProcessor;

    public MessageProcessor1841720019SultanTest() {
        mProcessor = new MessageProcessor1841720019Sultan();
        mProcessor.setmSenderSultan("Ronaldo");
        mProcessor.setmRecipientSultan("Rafael");
        mProcessor.setmMessageSultan("What's up bro?");
    }

    @Test
    public void testShowMessageSultan() {
        String expectedResult = "Hai Rafael, you have message from Ronaldo.\nThe message as follows : What's up bro?";
        Assert.assertEquals(expectedResult, mProcessor.messageFormatSultan());
    }
}
