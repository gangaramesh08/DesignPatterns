public class FacadeDemo {
    public static void main(String[] args) {
        FacadeHotelKeeper keeper = new FacadeHotelKeeper();
        keeper.getVegMenu();
        keeper.getNonVegMenu();
    }
}
