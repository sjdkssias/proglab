package Location;

public record Meadow(int size) {
    public void describeMeadow(){
        if (size>10){
            System.out.println("Увлекательная история начинается на большом зеленом лугу.");
        } else {
            System.out.println("Увлекательная исторяи начинается на маленьком зеленом лугу.");
        }
    }
}
