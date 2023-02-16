public class Calculation {

    /**
     * Возвращает стоимость всех билетов из счет
     * @param bill счет
     * @return сумма
     */
    public static double getAllSumm(Bill bill)  {

        return bill.count *
    (bill.ticket.ticketPrice -
    (bill.ticket.ticketPrice *
    bill.discount.persent / 100));
    }
}
