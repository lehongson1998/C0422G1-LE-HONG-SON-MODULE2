package ss6_inheritance.bai_tap.point_and_moveablepoint;

import java.util.Arrays;

public class MoveAblePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveAblePoint(){

    }

    public MoveAblePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveAblePoint (float x, float y, float xSpeed, float ySpeed){
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
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
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        float[] array = {this.xSpeed, this.ySpeed};
        return  array;
    }
    public float[] move(){
         float[] moveArr = new float[2];
        for (int i = 0; i < moveArr.length; i++) {
            moveArr[i] = getXY()[i] + getSpeed()[i];
        }
        return moveArr;
    }
    @Override
    public String toString() {
        return super.toString()
                +"(xs, ys):"
                + "xSpeed = "
                +xSpeed
                +",ySpeed = "
                +ySpeed;
    }
    public static void main(String[] args) {
        MoveAblePoint mv = new MoveAblePoint(1.1f,1.2f, 1f, 1f);
        System.out.println(mv);
        System.out.println(Arrays.toString(mv.move()));
    }
}
