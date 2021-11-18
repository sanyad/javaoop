package Package.one;

public class ClassRoom {
    public ClassRoom(Pupil ppl) {
        ppl.run(ppl);
    }

    public ClassRoom(Pupil ppl, Pupil ppl2) {
        ppl2.run(ppl2);
        ppl.run(ppl);
    }

    public ClassRoom(Pupil ppl, Pupil ppl2, Pupil ppl3) {
        ppl2.run(ppl2);
        ppl.run(ppl);
        ppl3.run(ppl3);
    }
}
