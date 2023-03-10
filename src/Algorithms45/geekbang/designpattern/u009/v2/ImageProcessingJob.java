package Algorithms45.geekbang.designpattern.u009.v2;

import Algorithms45.geekbang.designpattern.u009.FileUtils;
import java.awt.Image;

/**
 * Created by HuGuodong on 11/22/19.
 */
public class ImageProcessingJob {

  private static final String BUCKET_NAME = "ai_images_bucket";
  private static final String STORE_TYPE = "STORE_TYPE";
  private static final String PROP_PATH = "geekbang/designpattern/u009/v2/config.properties";

  public void process() {
    Image image = null;
//    String storeType = prop.getString(STORE_TYPE);
    String storeType = FileUtils.load(PROP_PATH)
        .getProperty(STORE_TYPE);
    ImageStore imageStore = ImageStoreFactory.newInstance(storeType);
    imageStore.upload(image, BUCKET_NAME);
  }

  public static void main(String[] args) {
    ImageProcessingJob job = new ImageProcessingJob();
    job.process();
  }
}
