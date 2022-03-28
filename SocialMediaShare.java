package facade;

public class SocialMediaShare  {
    private FacebookShare facebookShare;
    
    public SocialMediaShare(FacebookShare facebookShare){
        this.facebookShare = facebookShare;
    }

    public void share(String message){
        this.facebookShare.setMessage(message);
        this.facebookShare.share();
    }

}
