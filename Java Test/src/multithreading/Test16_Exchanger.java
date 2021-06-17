package multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class Test16_Exchanger {
    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();

        List<Action> friend1Action = new ArrayList<>();
        friend1Action.add(Action.CUTTERS);
        friend1Action.add(Action.PAPER);
        friend1Action.add(Action.CUTTERS);

        List<Action> friend2Action = new ArrayList<>();
        friend2Action.add(Action.PAPER);
        friend2Action.add(Action.STONE);
        friend2Action.add(Action.STONE);

        new BestFriend("Ivan", friend1Action, exchanger);
        new BestFriend("Petya", friend2Action, exchanger);

    }
}
enum Action{
    STONE, CUTTERS, PAPER;
}

class BestFriend extends Thread{
    private String name;
    private List<Action> myActions;
    private Exchanger<Action> exchanger;

    public BestFriend(String name, List<Action> myAction, Exchanger<Action> exchanger) {
        this.name = name;
        this.myActions = myAction;
        this.exchanger = exchanger;
        this.start();
    }

    private void whoWins (Action myAction, Action friendsAction){
        if((myAction == Action.STONE && friendsAction == Action.CUTTERS)
        || (myAction == Action.CUTTERS && friendsAction == Action.PAPER)
        || (myAction == Action.PAPER && friendsAction == Action.STONE)){
            System.out.println(name + " WINS!!!");
        }
    }

    @Override
    public void run() {
        Action reply;
        for (Action action : myActions){
            try {
                reply = exchanger.exchange(action);//getting data from another thread
                whoWins(action, reply);
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}