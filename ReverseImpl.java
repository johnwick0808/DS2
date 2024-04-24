import ReverseModule.ReversePOA;

public class ReverseImpl extends ReversePOA {

    public ReverseImpl() {
        super();
        System.out.println("Reverse Object Created");
    }

    public String reverse_string(String name) {
        StringBuffer str = new StringBuffer(name);
        str.reverse();
        return "Server Send " + str.toString();
    }
}
