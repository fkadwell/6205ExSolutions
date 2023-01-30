package Algorithms45.designpattern.u39.viewer;

import Algorithms45.designpattern.u39.EmailSender;
import Algorithms45.designpattern.u39.RequestStat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by HuGuodong on 1/31/20.
 */
public class EmailViewer  {

  private EmailSender emailSender;
  private List<String> toAddresses = new ArrayList<>();

  public EmailViewer() {
    emailSender = new EmailSender();
  }

  public void addToAddress(String address) {
    toAddresses.add(address);
  }

  //@Override
  public void output(Map<String, RequestStat> requestStats, long startTimeInMillis,
      long endTimeInMills) {
    // TODO: 格式化为html格式，并且发送邮件
  }
}
