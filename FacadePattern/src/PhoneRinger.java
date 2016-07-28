/**
 * Created by diana on 7/28/16.
 */
public class PhoneRinger {

    private Phone iphone;
    private Phone samsung;

    public PhoneRinger() {
        this.iphone = new IPhone();
        this.samsung = new Samsung();
    }

    public void ringIPhone() {
        iphone.ring();
    }

    public void ringSamsung() {
        samsung.ring();
    }
}
