package animal;

/**
 * Created by Aleksandr on 16.01.2016.
 */
public class Animal {
    private static int id;
    private static String anim_name;
    private static int anim_num;

    public Animal() {
    }

    public static int getId() {
        return id;
    }

    public static String getAnim_name() {
        return anim_name;
    }

    public static int getAnim_num() {
        return anim_num;
    }

    public Animal(String anim_name, int anim_num) {
        this.anim_name=anim_name;
        this.anim_num=anim_num;
    }

    public Animal(int id, String anim_name, int anim_num) {
        this.id=id;
        this.anim_name=anim_name;
        this.anim_num=anim_num;
    }




    public static void setId(int id) {
        Animal.id = id;
    }

    public static void setAnim_name(String anim_name) {
        Animal.anim_name = anim_name;
    }

    public static void setAnim_num(int anim_num) {
        Animal.anim_num = anim_num;
    }



}
