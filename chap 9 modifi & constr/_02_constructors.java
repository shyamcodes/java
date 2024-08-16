class myMainEmployee {
    private int id;
    private String name;

    public myMainEmployee() {
        id = 84;
        name = "My-name-here";
    }
    public myMainEmployee(String myName, int myId){
        name = myName;
        id  = myId;
    }
    // public myMainEmployee(String myName){
    //     name = myName;
    //     id  = 12;
    // }

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

public class _02_constructors {
    public static void main(String[] args) {
        //myMainEmployee rahul = new myMainEmployee("codeWithRahul",45);
        myMainEmployee rahul = new myMainEmployee();

        // rahul.setId(84);
        // rahul.setName("Rahul Singh");
        System.out.println(rahul.getId());
        System.out.println(rahul.getName());

    }
}
