import java.io.*;
import java.util.List;

public class Entry implements Cloneable, Serializable {

    private int age;
    private String name;
    private List hobbies;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        try{
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            oos.flush();
            oos.close();

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            return ois.readObject();

        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public Entry slipClone(){
        Entry copy = new Entry();
        copy.setAge(this.age);
        copy.setHobbies(this.hobbies);
        copy.setAge(this.age);
        return copy;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getHobbies() {
        return hobbies;
    }

    public void setHobbies(List hobbies) {
        this.hobbies = hobbies;
    }
}
