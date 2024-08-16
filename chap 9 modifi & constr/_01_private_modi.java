class myEmployee {
    private int id;
    private String name;

    public void setName(String s) {
        name = s;
    }

    public String getName() {
        return name;
    }

    public void setId(int n) {
        id = n;
    }

    public int getId() {
        return id;
    }
}

public class _01_private_modi {
    public static void main(String[] args) {
        myEmployee rahul = new myEmployee();

        rahul.setId(84);
        rahul.setName("Rahul Singh");

        System.out.println(rahul.getId());
        System.out.println(rahul.getName());
    }
}
