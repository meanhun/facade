package facade;

public class Main {
    public static void main(String[] args) {
        FacebookShare facebookShare = new FacebookShare();
        SocialMediaShare socialMediaShare = new SocialMediaShare(facebookShare);
        socialMediaShare.share("Day la tin nhan gui di");

    }  
}
