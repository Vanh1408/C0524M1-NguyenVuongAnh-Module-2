package xay_dung_lop_fan;

class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(false);
        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setOn(true);

        System.out.println("Fan1: " + fan1.toString());
        System.out.println("Fan2: " + fan2.toString());
    }
}
