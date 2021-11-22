package Abstract.work_three;

public class Player implements Playable, Recodable {
    @Override
    public void play() {
        System.out.println("Player is play");
    }

    @Override
    public void pause() {
        System.out.println("Player is pause");
    }

    @Override
    public void stop() {
        System.out.println("Player is stop");
    }

    @Override
    public void record() {
        System.out.println("Player is record");
    }
}
