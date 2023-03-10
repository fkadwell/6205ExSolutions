package Algorithms45.ALeetCode.comp.p182_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Created by HuGuodong on 12/8/19.
 */
public class Problem3 {

  static class UndergroundSystem {

    private class Record {

      int checkInTime;
      int checkOutTime;

      public int getCheckInTime() {
        return checkInTime;
      }

      public void setCheckInTime(int checkInTime) {
        this.checkInTime = checkInTime;
      }

      public int getCheckOutTime() {
        return checkOutTime;
      }

      public void setCheckOutTime(int checkOutTime) {
        this.checkOutTime = checkOutTime;
      }
    }

    Map<String, Map<Integer, Record>> map = new HashMap<>();

    public UndergroundSystem() {

    }

    public void checkIn(int id, String stationName, int t) {
      Record r = new Record();
      r.checkInTime = t;
      if (map.containsKey(stationName)) {
        map.get(stationName).put(id, r);
      }
      else {
        Map<Integer, Record> recordMap = new HashMap<>();
        recordMap.put(id, r);
        map.put(stationName, recordMap);
      }
    }

    public void checkOut(int id, String stationName, int t) {
      Record r = new Record();
      r.checkOutTime = t;
      if (map.containsKey(stationName)) {
        map.get(stationName).put(id, r);
      }
      else {
        Map<Integer, Record> recordMap = new HashMap<>();
        recordMap.put(id, r);
        map.put(stationName, recordMap);
      }
    }

    public double getAverageTime(String startStation, String endStation) {
      double res = 0;
      Map<Integer, Record> startRecordMap = map.get(startStation);
      Map<Integer, Record> endRecordMap = map.get(endStation);
      int count = 0;
      for (Entry<Integer, Record> e : startRecordMap.entrySet()) {
        if (endRecordMap.containsKey(e.getKey())) {
          count++;
          res += (endRecordMap.get(e.getKey()).checkOutTime - e.getValue().checkInTime);
        }
      }

      System.out.println(res / count);
      return res / count;
    }
  }

  public static void main(String[] args) {
    System.out.println();
    UndergroundSystem undergroundSystem = new UndergroundSystem();
    undergroundSystem.checkIn(45, "Leyton", 3);
    undergroundSystem.checkIn(32, "Paradise", 8);
    undergroundSystem.checkIn(27, "Leyton", 10);
    undergroundSystem.checkOut(45, "Waterloo", 15);
    undergroundSystem.checkOut(27, "Waterloo", 20);
    undergroundSystem.checkOut(32, "Cambridge", 22);
    undergroundSystem.getAverageTime("Paradise",
        "Cambridge");       // ?????? 14.0?????? "Paradise"????????? 8?????? "Cambridge"(?????? 22)?????????????????????
    undergroundSystem.getAverageTime("Leyton",
        "Waterloo");          // ?????? 11.0???????????? 2 ?????? "Leyton" ??? "Waterloo" ????????????????????? id=45 ?????????????????? time=3 ????????? time=15???????????? id=27 ?????????????????? time=10 ????????? time=20???????????????????????? ( (15-3) + (20-10) ) / 2 = 11.0
    undergroundSystem.checkIn(10, "Leyton", 24);
    undergroundSystem.getAverageTime("Leyton", "Waterloo");          // ?????? 11.0
    undergroundSystem.checkOut(10, "Waterloo", 38);
    undergroundSystem.getAverageTime("Leyton", "Waterloo");          // ?????? 12.0
  }
}
