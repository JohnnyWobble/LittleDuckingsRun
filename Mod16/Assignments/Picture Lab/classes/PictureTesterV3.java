/*
 * Purpose:
 * 
 * < your name >
 * < today's date >
*/

/**
 * This class contains class (static) methods that will help you test the
 * PictureV3 class methods. Uncomment the methods and the code in the main to
 * test.
 * 
 * @author Barbara Ericson
 */
public class PictureTesterV3 {
  /** Method to test zeroBlue - Activity 5 */
  public static void testZeroBlue() {
    PictureV3 beach = new PictureV3("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }

  public static void testKeepOnlyGreen() {
    PictureV3 beach = new PictureV3("beach.jpg");
    beach.explore();
    beach.keepOnlyGreen();
    beach.explore();
  }

  public static void testKeepOnlyRed() {
    PictureV3 beach = new PictureV3("beach.jpg");
    beach.explore();
    beach.keepOnlyRed();
    beach.explore();
  }

  public static void testKeepOnlyBlue() {
    PictureV3 beach = new PictureV3("beach.jpg");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  }

  public static void testNegate() {
    PictureV3 beach = new PictureV3("beach.jpg");
    beach.explore();
    beach.negate();
    beach.explore();
  }

  public static void testGrayscale() {
    PictureV3 beach = new PictureV3("beach.jpg");
    beach.explore();
    beach.grayscale();
    beach.explore();
  }

  /** Method to test mirrorVertical */
  public static void testMirrorVertical() {
    PictureV3 caterpillar = new PictureV3("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }

  public static void testMirrorVerticalRightToLeft() {
    PictureV3 caterpillar = new PictureV3("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }

  public static void testMirrorHorizontal() {
    PictureV3 caterpillar = new PictureV3("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontal();
    caterpillar.explore();
  }

  public static void testMirrorHorizontalBotToTop() {
    PictureV3 caterpillar = new PictureV3("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontalBotToTop();
    caterpillar.explore();
  }

  /** Method to test mirrorTemple */
  public static void testMirrorTemple() {
    PictureV3 temple = new PictureV3("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }

  public static void testMirrorArms() {
    PictureV3 snowman = new PictureV3("snowman.jpg");
    snowman.explore();
    snowman.mirrorArms();
    snowman.explore();
  }

  public static void testMirrorGull() {
    PictureV3 seagull = new PictureV3("seagull.jpg");
    seagull.explore();
    seagull.mirrorGull();
    seagull.explore();
  }

  /** Method to test the collage method */
  public static void testCollage() {
    PictureV3 canvas = new PictureV3("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }

  public static void testCopy() {
    PictureV3 canvas = new PictureV3("640x480.jpg");
    canvas.testCopy();
    canvas.explore();
  }

  public static void testMyCollage() {
    PictureV3 canvas = new PictureV3("640x480.jpg");
    canvas.myCollage();
    canvas.explore();
  }

  /** Method to test edgeDetection */
  public static void testEdgeDetection() {
    PictureV3 swan = new PictureV3("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }

  public static void testEdgeDetection2() {
    PictureV3 swan = new PictureV3("swan.jpg");
    swan.edgeDetection2(15);
    swan.explore();
  }

  /**
   * Main method for testing. Every class can have a main method in Java
   */
  public static void main(String[] args) {
    // uncomment a call here to run a test and
    // comment out the ones you don't want to run

    // Activity 5
    // testZeroBlue();
    // testKeepOnlyBlue();
    // testKeepOnlyRed();
    // testKeepOnlyGreen();
    // testNegate();
    // testGrayscale();

    // Activity 5 Challenge - optional
    // testFixUnderwater();

    // Activity 6
    // testMirrorVertical();
    // testMirrorVerticalRightToLeft();
    // testMirrorHorizontal();
    // testMirrorHorizontalBotToTop();

    // Activity 6 Challenge - optional
    // testMirrorDiagonal();

    // Activity 7
    // testMirrorTemple();
    // testMirrorArms();
    // testMirrorGull();

    // Activity 8
    // testCollage();
    // testCopy();
    testMyCollage();

    // Activity 9
    // testEdgeDetection();
    // testEdgeDetection2();

    // Extra methods
    // testChromakey();
    // testEncodeAndDecode();
    // testGetCountRedOverValue(250);
    // testSetRedToHalfValueInTopHalf();
    // testClearBlueOverValue(200);
    // testGetAverageForColumn(0);
  }
}
