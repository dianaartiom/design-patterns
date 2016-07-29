/**
 * Created by diana on 7/29/16.
 */
public class Main {

    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();

        for(Iterator iter = (Iterator) nameRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.getNext();
            System.out.println("Name: " + name);
        }
    }
}
