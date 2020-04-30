public class FacadeHotelKeeper  {

    public void getVegMenu() {
        FacadeMenu vegMenu = new FacadeVegMenu();
        vegMenu.display();
    }

    public void getNonVegMenu() {
        FacadeMenu nonVegMenu = new FacadeNonvegMenu();
        nonVegMenu.display();
    }
}
