import java.util.ArrayList;

public class EntryTest {

    public static void main(String[] args) {
        Entry origin = new Entry();
        origin.setAge(18);
        origin.setName("曹进泉");
        origin.setHobbies(new ArrayList());

        try {
            Entry copy = (Entry) origin.clone();
            System.out.println("深克隆："+(copy.getHobbies() == origin.getHobbies()));
            Entry slipClone = origin.slipClone();
            System.out.println("浅克隆："+(slipClone.getHobbies() == origin.getHobbies()));

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
