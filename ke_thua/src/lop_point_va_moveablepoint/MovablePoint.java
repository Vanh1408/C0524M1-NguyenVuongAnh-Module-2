package lop_point_va_moveablepoint;

class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        return new float[]{xSpeed, ySpeed};
    }

    @Override
    public String toString() {
        return "(" + super.getX() + ", " + super.getY() + "),speed=(" + xSpeed + ", " + ySpeed + ")";
    }

    public String move(){
        float xp = super.getX() + this.xSpeed;
        float yp = super.getY() + this.ySpeed;
        return "x = " + xp + ", y = " + yp;
    }
}
