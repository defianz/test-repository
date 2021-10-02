package baseball.service;

import baseball.Application;
import baseball.controller.GameController;
import nextstep.utils.Console;

public class AfterGameServiceImpl implements AfterGameService {

    private static final AfterGameServiceImpl afterGameService = new AfterGameServiceImpl();
    
    public static AfterGameServiceImpl getInstance(){
        return afterGameService;
    }

    @Override
    public void afterGame() {
        GameController.againGame = checkGameAgain();
    }

    private boolean checkGameAgain() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String inputObj = Console.readLine();
        while(validationInputObj(inputObj)){
            System.out.println("[ERROR] 1 또는 2 를 입력해주세요.");
            inputObj = Console.readLine();
        };
        return inputObj.equals("1") ? true : false;
    }

    private boolean validationInputObj(String inputObj) {
        String REGREX = "1,2";
        return inputObj.matches(REGREX);
    }
}
