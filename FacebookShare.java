package facade;

public class FacebookShare implements Ishare {

    private String message;

    @Override
    public void share() {
        // TODO Auto-generated method stub
        System.out.println("Sharing to facebook .... : "+ this.message);
    }

    @Override
    public void setMessage(String message) {
        // TODO Auto-generated method stub
        this.message = message;
    }

}
