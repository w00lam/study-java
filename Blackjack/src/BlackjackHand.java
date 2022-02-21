public class BlackjackHand extends Deck{
    public int getValue() {
        int sum = 0;

        for (Card card : getCards()) {
            sum += ((BlackjackCard) card).getValue();
            if (sum > 21 && ((BlackjackCard) card).isAce()) {
                sum -= 10;
            }
        }

        return sum;
    }

    public boolean isBusted() {
        return getValue() > 21;
    }

    public boolean isBlackjack() {
        return getCards().size() == 2 && getValue() == 21;
    }
}
