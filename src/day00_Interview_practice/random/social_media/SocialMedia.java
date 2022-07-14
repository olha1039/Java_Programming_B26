package day00_Interview_practice.random.social_media;

public abstract class SocialMedia {

    protected String personalURL;
    protected int accountLength;
    protected static String platform;
    protected String username;
    protected String password;
    protected String fullName;

    public abstract void directMessaging (String username, String message);

    public abstract void post (Object media);

    public abstract void notifications();

}
