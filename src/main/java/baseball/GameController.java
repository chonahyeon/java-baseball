package baseball;

import java.util.ArrayList;

public class GameController {
    MakeThreeDigitNumber makeThreeDigitNumber = new MakeThreeDigitNumber();

    ArrayList<String> computerSelected = makeThreeDigitNumber.computerSelectedNumber();
    ArrayList<String> userSelected;

    public void startGame() {

        do {
            userSelected = makeThreeDigitNumber.userSelectedNumber();
            PlayerInputValueExceptions.allInputValueException(userSelected);
            
        } while (GameHintList.countOfStrike() != 3);

    }
}
