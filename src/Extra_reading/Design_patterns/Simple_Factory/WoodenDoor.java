package Extra_reading.Design_patterns.Simple_Factory;

public class WoodenDoor implements Door{

    private float width;
    private float height;
    public void construct(float $width, float $height){
        this.width = $width;
        this.height = $height;
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
