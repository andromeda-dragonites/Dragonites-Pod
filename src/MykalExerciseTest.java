
public class MykalExerciseTest {

    public class TestBird {
        public void main(String[] args) {
            Animal myBird = new Bird();

            myBird.label();
            myBird.move();
            myBird.eat();
        }
    }

    public class TestFish {
        public void main(String[] args) {
            Animal myFish = new Fish();

            myFish.label();
            myFish.move();
            myFish.eat();
        }
    }
}
