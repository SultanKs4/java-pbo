package id.natlus.jobsheet15.unittest;

public class MessageProcessor1841720019Sultan {
    private String mSender;
    private String mRecipient;
    private String mMessage;

    public String getmSenderSultan() {
        return mSender;
    }

    public void setmSenderSultan(String mSender) {
        this.mSender = mSender;
    }

    public String getmRecipientSultan() {
        return mRecipient;
    }

    public void setmRecipientSultan(String mRecipient) {
        this.mRecipient = mRecipient;
    }

    public String getmMessageSultan() {
        return mMessage;
    }

    public void setmMessageSultan(String mMessage) {
        this.mMessage = mMessage;
    }

    public String messageFormatSultan() {
        return String.format("Hai %s, you have message from %s.\nThe message as follows : %s",
                this.getmRecipientSultan(), this.getmSenderSultan(), this.getmMessageSultan());
    }

    public void showMessageSultan() {
        System.out.println(messageFormatSultan());
    }
}
