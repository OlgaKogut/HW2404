package HW_2603;

public class Block {
    int blockWidth;
    int blockLength;
    int blockHeight;

    public Block(int[] size ) {
        this.blockWidth = size[0];
        this.blockLength = size[1];
        this.blockHeight = size[2];
    }

    int getWidth() {
        return blockWidth;
    }

    int getLength() {
        return blockLength;
    }

    int getHeight() {
        return blockHeight;
    }

    int getVolume() {
        return blockHeight * blockWidth * blockLength;
    }

    int getSurfaceArea() {
        return 2 * (blockLength * blockWidth + blockLength * blockHeight + blockHeight * blockWidth);
    }



}
