public class AnonymouseClass {
    public static void main(String[] args) {
        Ab obj = new Ab() {
            //Annonymous class for method overriding instead of creating separate class
            @Override
            public void show(){
                System.out.println("showing overiden method");
            }
        };
        obj.show();
    }
}
class Ab {
    public void show(){
        System.out.println("showing class Ab");
    }
}
