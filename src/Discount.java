public enum Discount {

    default_ticket(0),
    child_ticket(50),
    older_ticket(30);

    int persent;

    Discount(int persent)  {
        this.persent = persent;
    }

}
