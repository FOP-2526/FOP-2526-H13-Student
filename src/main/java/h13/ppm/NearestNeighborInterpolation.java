package h13.ppm;

import h13.ppm.image.PPMHeader;
import h13.ppm.image.PPMImage;
import h13.ppm.image.PixelColor;
import org.tudalgo.algoutils.student.annotation.DoNotTouch;
import org.tudalgo.algoutils.student.annotation.StudentImplementationRequired;

/**
 * Class to provide class method that implements nearest neighbor-interpolation of images.
 */
public final class NearestNeighborInterpolation {

    @DoNotTouch
    private NearestNeighborInterpolation() {
    }

    /**
     * Scales an image using nearest neighbor-interpolation given a scale factor.
     * The new image's dimensions are the originals scaled by scale factor (rounded towards 0).
     *
     * @param original    the original image to be scaled
     * @param scaleFactor the factor by which the image's dimensions should be scaled
     * @return a new image scaled by scaleFactor
     */
    @StudentImplementationRequired("H13.1.2")
    public static PPMImage scaleImage(PPMImage original, float scaleFactor) {
        // TODO: H13.1.2
        return org.tudalgo.algoutils.student.Student.crash("H13.1.2 - Remove if implemented");
    }
}
