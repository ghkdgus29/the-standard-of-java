package chapter7;

public class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        for (int i = 0; i < CARD_NUM/2; i++) {
            if ((i == 0) || (i == 2) || (i == 7)) {
                cards[i] = new SutdaCard(i + 1, true);
            } else {
                cards[i] = new SutdaCard(i+1, false);
            }
        }

        for (int i = 0; i < CARD_NUM/2; i++) {
            cards[10 + i] = new SutdaCard(i+1, false);
        }
    }

    public void shuffle() {
        for (int i = 0; i < CARD_NUM; i++) {
            int rand = (int) (Math.random() * CARD_NUM);
            SutdaCard tmp = cards[i];
            cards[i] = cards[rand];
            cards[rand] = tmp;
        }
    }

    public SutdaCard pick(int index) {
        return cards[index];
    }

    public SutdaCard pick() {
        int rand = (int) (Math.random() * CARD_NUM);
        return cards[rand];
    }
}


