package blocks;

import java.util.List;

public abstract class BaseBlock implements Block{

    String color;
    String material;
    List blocks;

    BaseBlock(final String color, final String material) {
        this.color = color;
        this.material = material;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getMaterial() {
        return material;
    }

    @Override
    public List getBlocks() {
        return blocks;
    }
}
