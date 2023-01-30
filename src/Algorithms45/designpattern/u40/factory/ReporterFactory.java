package Algorithms45.designpattern.u40.factory;

import Algorithms45.designpattern.u40.Aggregator;
import Algorithms45.designpattern.u40.reporter.ConsoleReporter;
import Algorithms45.designpattern.u40.storage.MetricsStorage;
import Algorithms45.designpattern.u40.viewer.ConsoleViewer;

/**
 * Created by HuGuodong on 1/31/20.
 */
public class ReporterFactory {


  public static ConsoleReporter createConsoleReporter(MetricsStorage storage) {
    Aggregator aggregator = new Aggregator();
    return new ConsoleReporter(new ConsoleViewer(), aggregator, storage);
  }


}
