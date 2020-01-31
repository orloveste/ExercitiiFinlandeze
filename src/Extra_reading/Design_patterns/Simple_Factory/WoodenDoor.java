package Extra_reading.Design_patterns.Simple_Factory;

public class WoodenDoor implements Door{
    protected float width;
    protected float height;

    public WoodenDoor(float width, float height){
        this.width = width;
        this.height = height;
    }
    @Override
    public float getWidth() {
        return this.width;
    }

    @Override
    public float getHeight() {
        return this.height;
    }
}
