import java.util.ArrayList;
import java.util.Random;

public class Deck {
    private ArrayList<Card> cards = new ArrayList<>();

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void addCard(Card card) {
        this.cards.add(card);
    }

    public void print() {
        for(Card card : cards) {
            System.out.println(card.toString());
        }
    }

    public void shuffle() {
        Random random = new Random();

        for(int i = 0; i < cards.size(); i++) {
            // 0~52(카드 갯수)까지 랜덤한 숫자 생성
            int randIndex = random.nextInt(cards.size());
            
            Card temp = cards.get(i);
            cards.set(i, cards.get(randIndex));
            cards.set(randIndex, temp);
        }
    }

    public Deck deal(int count) {
        Deck hand = new Deck();

        for(int i = 0; i < count; i++) {
            hand.addCard(cards.remove(i));
        }

        return hand;
    }
}
