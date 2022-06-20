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
    public MoveAblePoint move(){
         super.setX(super.getX() + xSpeed);
         super.setY(super.getY() + ySpeed);
         return this;
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
        System.out.println(mv.move());

        Point pd = new MoveAblePoint(1.0f,1.1f,1.2f,1.4f);
        // pd1 = (MoveAblePoint)pd;
        System.out.println(((MoveAblePoint)pd).getXSpeed());
        System.out.println(pd);
        ((MoveAblePoint)pd).setSpeed(1.2f, 1.3f);
        System.out.println(pd);
    }
}
