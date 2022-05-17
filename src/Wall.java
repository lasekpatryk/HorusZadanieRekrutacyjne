import blocks.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Wall implements Structure{
    private static List<BaseBlock> blocks = new ArrayList<>();

    @Override
    public Optional findBlockByColor(final String color) {
        return Optional.of(blocks.stream().filter(block -> block.getColor().matches(color.toLowerCase())));
    }

    @Override
    public List findBlocksByMaterial(final String material) {
        return blocks.stream().filter(block -> block.getMaterial().matches(material.toLowerCase())).collect(Collectors.toList());
    }

    @Override
    public int count() {
        return blocks.size();
    }

}
