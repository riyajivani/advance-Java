
package ses1_que2c_1;

public class ClassRoom {
        private final int benches;
        private final int fans;
        private final int lamps;
        private final int windows;
        private final int doors;
        
    // Inner Builder class
    public static class Builder {
        private int benches;
        private int fans;
        private int lamps;
        private int windows;
        private int doors;

        public Builder withBenches(int benches) {
            this.benches = benches;
            return this;
        }

        public Builder fans(int fans) {
            this.fans = fans;
            return this;
        }

        public Builder lamps(int lamps) {
            this.lamps = lamps;
            return this;
        }

        public Builder windows(int windows) {
            this.windows = windows;
            return this;
        }

        public Builder doors(int doors) {
            this.doors = doors;
            return this;
        }

        ClassRoom build() {
            return new ClassRoom(this);
        }
    }
    
    private ClassRoom(Builder builder)
    {
        this.benches=builder.benches;
        this.fans=builder.fans;
        this.lamps=builder.lamps;
        this.windows=builder.windows;
        this.doors=builder.doors;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "benches=" + benches +
                ", fans=" + fans +
                ", lamps=" + lamps +
                ", windows=" + windows +
                ", doors=" + doors +
                '}';
    }

    public static void main(String[] args) {
        // Example usage
        ClassRoom classroom = new ClassRoom.Builder()
                .withBenches(30)
                .fans(4)
                .lamps(10)
                .windows(6)
                .doors(2)
                .build();

        System.out.println(classroom);
    }
}

